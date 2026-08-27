import com.mojang.serialization.DataResult;
import java.io.File;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.io.FilenameUtils;

public class v {
   private static final Pattern a = Pattern.compile("(<name>.*) \\((<count>\\d*)\\)", 66);
   private static final int b = 255;
   private static final Pattern c = Pattern.compile(".*\\.|(?:COM|CLOCK\\$|CON|PRN|AUX|NUL|COM[1-9]|LPT[1-9])(?:\\..*)?", 2);
   private static final Pattern d = Pattern.compile("[-._a-z0-9]+");

   public static String a(Path $$0, String $$1, String $$2) throws IOException {
      for (char $$3 : aa.ba) {
         $$1 = $$1.replace($$3, '_');
      }

      $$1 = $$1.replaceAll("[./\"]", "_");
      if (c.matcher($$1).matches()) {
         $$1 = "_" + $$1 + "_";
      }

      Matcher $$4 = a.matcher($$1);
      int $$5 = 0;
      if ($$4.matches()) {
         $$1 = $$4.group("name");
         $$5 = Integer.parseInt($$4.group("count"));
      }

      if ($$1.length() > 255 - $$2.length()) {
         $$1 = $$1.substring(0, 255 - $$2.length());
      }

      while (true) {
         String $$6 = $$1;
         if ($$5 != 0) {
            String $$7 = " (" + $$5 + ")";
            int $$8 = 255 - $$7.length();
            if ($$1.length() > $$8) {
               $$6 = $$1.substring(0, $$8);
            }

            $$6 = $$6 + $$7;
         }

         $$6 = $$6 + $$2;
         Path $$9 = $$0.resolve($$6);

         try {
            Path $$10 = Files.createDirectory($$9);
            Files.deleteIfExists($$10);
            return $$0.relativize($$10).toString();
         } catch (FileAlreadyExistsException var8) {
            $$5++;
         }
      }
   }

   public static boolean a(Path $$0) {
      Path $$1 = $$0.normalize();
      return $$1.equals($$0);
   }

   public static boolean b(Path $$0) {
      for (Path $$1 : $$0) {
         if (c.matcher($$1.toString()).matches()) {
            return false;
         }
      }

      return true;
   }

   public static Path b(Path $$0, String $$1, String $$2) {
      String $$3 = $$1 + $$2;
      Path $$4 = Paths.get($$3);
      if ($$4.endsWith($$2)) {
         throw new InvalidPathException($$3, "empty resource name");
      } else {
         return $$0.resolve($$4);
      }
   }

   public static String a(String $$0) {
      return FilenameUtils.getFullPath($$0).replace(File.separator, "/");
   }

   public static String b(String $$0) {
      return FilenameUtils.normalize($$0).replace(File.separator, "/");
   }

   public static DataResult<List<String>> c(String $$0) {
      int $$1 = $$0.indexOf(47);
      if ($$1 == -1) {
         return switch ($$0) {
            case "", ".", ".." -> DataResult.error(() -> "Invalid path '" + $$0 + "'");
            default -> !d($$0) ? DataResult.error(() -> "Invalid path '" + $$0 + "'") : DataResult.success(List.of($$0));
         };
      } else {
         List<String> $$2 = new ArrayList<>();
         int $$3 = 0;
         boolean $$4 = false;

         while (true) {
            String $$5 = $$0.substring($$3, $$1);
            switch ($$5) {
               case "":
               case ".":
               case "..":
                  return DataResult.error(() -> "Invalid segment '" + $$5 + "' in path '" + $$0 + "'");
            }

            if (!d($$5)) {
               return DataResult.error(() -> "Invalid segment '" + $$5 + "' in path '" + $$0 + "'");
            }

            $$2.add($$5);
            if ($$4) {
               return DataResult.success($$2);
            }

            $$3 = $$1 + 1;
            $$1 = $$0.indexOf(47, $$3);
            if ($$1 == -1) {
               $$1 = $$0.length();
               $$4 = true;
            }
         }
      }
   }

   public static Path a(Path $$0, List<String> $$1) {
      int $$2 = $$1.size();

      return switch ($$2) {
         case 0 -> $$0;
         case 1 -> $$0.resolve($$1.get(0));
         default -> {
            String[] $$3 = new String[$$2 - 1];

            for (int $$4 = 1; $$4 < $$2; $$4++) {
               $$3[$$4 - 1] = $$1.get($$4);
            }

            yield $$0.resolve($$0.getFileSystem().getPath($$1.get(0), $$3));
         }
      };
   }

   public static boolean d(String $$0) {
      return d.matcher($$0).matches();
   }

   public static void a(String... $$0) {
      if ($$0.length == 0) {
         throw new IllegalArgumentException("Path must have at least one element");
      } else {
         for (String $$1 : $$0) {
            if ($$1.equals("..") || $$1.equals(".") || !d($$1)) {
               throw new IllegalArgumentException("Illegal segment " + $$1 + " in path " + Arrays.toString((Object[])$$0));
            }
         }
      }
   }

   public static void c(Path $$0) throws IOException {
      Files.createDirectories(Files.exists($$0) ? $$0.toRealPath() : $$0);
   }
}
