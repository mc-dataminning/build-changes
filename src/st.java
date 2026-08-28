import com.mojang.logging.LogUtils;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;
import joptsimple.OptionParser;
import joptsimple.OptionSet;
import joptsimple.OptionSpec;
import net.minecraft.server.MinecraftServer;
import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;

public class st {
   private static final Logger a = LogUtils.getLogger();
   private static final String b = "gametestserver";
   private static final String c = "gametestworld";
   private static final OptionParser d = new OptionParser();
   private static final OptionSpec<String> e = d.accepts(
         "universe", "The path to where the test server world will be created. Any existing folder will be replaced."
      )
      .withRequiredArg()
      .defaultsTo("gametestserver", new String[0]);
   private static final OptionSpec<File> f = d.accepts("report", "Exports results in a junit-like XML report at the given path.")
      .withRequiredArg()
      .ofType(File.class);
   private static final OptionSpec<String> g = d.accepts("tests", "Which test(s) to run (namespaced ID selector using wildcards). Empty means run all.")
      .withRequiredArg();
   private static final OptionSpec<Boolean> h = d.accepts(
         "verify", "Runs the tests specified with `test` or `testNamespace` 100 times for each 90 degree rotation step"
      )
      .withRequiredArg()
      .ofType(Boolean.class)
      .defaultsTo(false, new Boolean[0]);
   private static final OptionSpec<String> i = d.accepts("packs", "A folder of datapacks to include in the world").withRequiredArg();
   private static final OptionSpec<Void> j = d.accepts("help").forHelp();

   @ac(
      a = "Using System.err due to no bootstrap"
   )
   public static void a(String[] $$0, Consumer<String> $$1) throws Exception {
      d.allowsUnrecognizedOptions();
      OptionSet $$2 = d.parse($$0);
      if ($$2.has(j)) {
         d.printHelpOn(System.err);
      } else {
         if ((Boolean)$$2.valueOf(h) && !$$2.has(g)) {
            a.error("Please specify a test selection to run the verify option. For example: --verify --tests example:test_something_*");
            System.exit(-1);
         }

         a.info("Running GameTestMain with cwd '{}', universe path '{}'", System.getProperty("user.dir"), $$2.valueOf(e));
         if ($$2.has(f)) {
            ta.a(new tb((File)f.value($$2)));
         }

         alg.a();
         af.p();
         String $$3 = (String)$$2.valueOf(e);
         a($$3);
         $$1.accept($$3);
         if ($$2.has(i)) {
            String $$4 = (String)$$2.valueOf(i);
            a($$3, $$4);
         }

         eyb.c $$5 = eyb.b(Paths.get($$3)).e("gametestworld");
         aul $$6 = auo.a($$5);
         MinecraftServer.a((Function<Thread, sw>)($$3x -> sw.a($$3x, $$5, $$6, a($$2, g), $$2.has(h))));
      }
   }

   private static Optional<String> a(OptionSet $$0, OptionSpec<String> $$1) {
      return $$0.has($$1) ? Optional.of((String)$$0.valueOf($$1)) : Optional.empty();
   }

   private static void a(String $$0) throws IOException {
      Path $$1 = Paths.get($$0);
      if (Files.exists($$1)) {
         FileUtils.deleteDirectory($$1.toFile());
      }

      Files.createDirectories($$1);
   }

   private static void a(String $$0, String $$1) throws IOException {
      Path $$2 = Paths.get($$0).resolve("gametestworld").resolve("datapacks");
      if (!Files.exists($$2)) {
         Files.createDirectories($$2);
      }

      Path $$3 = Paths.get($$1);
      if (Files.exists($$3)) {
         try (Stream<Path> $$4 = Files.list($$3)) {
            for (Path $$5 : $$4.toList()) {
               Path $$6 = $$2.resolve($$5.getFileName());
               if (Files.isDirectory($$5)) {
                  if (Files.isRegularFile($$5.resolve("pack.mcmeta"))) {
                     FileUtils.copyDirectory($$5.toFile(), $$6.toFile());
                     a.info("Included folder pack {}", $$5.getFileName());
                  }
               } else if ($$5.toString().endsWith(".zip")) {
                  Files.copy($$5, $$6);
                  a.info("Included zip pack {}", $$5.getFileName());
               }
            }
         }
      }
   }
}
