import reposense.git.CommitNotFoundException;
        List<FileInfo> fileInfos = new ArrayList<>();

        try {
            GitChecker.checkoutToDate(config.getRepoRoot(), config.getBranch(), config.getUntilDate());
        } catch (CommitNotFoundException cnfe) {
            return fileInfos;
        }