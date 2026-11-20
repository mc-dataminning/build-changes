package net.minecraft.world.level.validation;

import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;

public class ContentValidationException extends Exception {
   private final Path path;
   private final List<ForbiddenLinkInfo> entries;

   public ContentValidationException(final Path path, final List<ForbiddenLinkInfo> entries) {
      this.path = path;
      this.entries = entries;
   }

   @Override
   public String getMessage() {
      return "Failed to validate '"
         + this.path
         + "'. Found forbidden symlinks: "
         + this.entries
            .stream()
            .map(e -> e.link() + "->" + e.target() + (e.isJuction() ? " (Allowing Junctions is not supported)" : ""))
            .collect(Collectors.joining(", "));
   }

   public List<ForbiddenLinkInfo> getIssues() {
      return this.entries;
   }
}
