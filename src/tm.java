import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.BoolArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collection;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.ToIntFunction;
import java.util.stream.Stream;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.mutable.MutableBoolean;
import org.slf4j.Logger;

public class tm {
   public static final int a = 15;
   public static final int b = 200;
   private static final Logger c = LogUtils.getLogger();
   private static final int d = 200;
   private static final int e = 1024;
   private static final int f = 3;
   private static final int g = 10000;
   private static final int h = 5;
   private static final int i = 5;
   private static final int j = 5;
   private static final String k = "Structure block entity could not be found";
   private static final tn.a<tm.a> l = new tn.a<>(tm.a::new);

   private static ArgumentBuilder<ec, ?> a(
      ArgumentBuilder<ec, ?> $$0, Function<CommandContext<ec>, tm.a> $$1, Function<ArgumentBuilder<ec, ?>, ArgumentBuilder<ec, ?>> $$2
   ) {
      return $$0.executes($$1x -> $$1.apply($$1x).d())
         .then(
            ((RequiredArgumentBuilder)ed.a("numberOfTimes", IntegerArgumentType.integer(0))
                  .executes($$1x -> $$1.apply($$1x).a(new th(IntegerArgumentType.getInteger($$1x, "numberOfTimes"), false))))
               .then(
                  $$2.apply(
                     ed.a("untilFailed", BoolArgumentType.bool())
                        .executes(
                           $$1x -> $$1.apply($$1x)
                                 .a(new th(IntegerArgumentType.getInteger($$1x, "numberOfTimes"), BoolArgumentType.getBool($$1x, "untilFailed")))
                        )
                  )
               )
         );
   }

   private static ArgumentBuilder<ec, ?> a(ArgumentBuilder<ec, ?> $$0, Function<CommandContext<ec>, tm.a> $$1) {
      return a($$0, $$1, $$0x -> $$0x);
   }

   private static ArgumentBuilder<ec, ?> b(ArgumentBuilder<ec, ?> $$0, Function<CommandContext<ec>, tm.a> $$1) {
      return a(
         $$0,
         $$1,
         $$1x -> $$1x.then(
               ((RequiredArgumentBuilder)ed.a("rotationSteps", IntegerArgumentType.integer())
                     .executes(
                        $$1xx -> $$1.apply($$1xx)
                              .a(
                                 new th(IntegerArgumentType.getInteger($$1xx, "numberOfTimes"), BoolArgumentType.getBool($$1xx, "untilFailed")),
                                 IntegerArgumentType.getInteger($$1xx, "rotationSteps")
                              )
                     ))
                  .then(
                     ed.a("testsPerRow", IntegerArgumentType.integer())
                        .executes(
                           $$1xx -> $$1.apply($$1xx)
                                 .a(
                                    new th(IntegerArgumentType.getInteger($$1xx, "numberOfTimes"), BoolArgumentType.getBool($$1xx, "untilFailed")),
                                    IntegerArgumentType.getInteger($$1xx, "rotationSteps"),
                                    IntegerArgumentType.getInteger($$1xx, "testsPerRow")
                                 )
                        )
                  )
            )
      );
   }

   public static void a(CommandDispatcher<ec> $$0) {
      ArgumentBuilder<ec, ?> $$1 = b(ed.a("onlyRequiredTests", BoolArgumentType.bool()), $$0x -> l.a($$0x, BoolArgumentType.getBool($$0x, "onlyRequiredTests")));
      ArgumentBuilder<ec, ?> $$2 = b(ed.a("testClassName", tl.a()), $$0x -> l.a($$0x, tl.a($$0x, "testClassName")));
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ed.a(
                                                                           "test"
                                                                        )
                                                                        .then(ed.a("run").then(b(ed.a("testName", tp.a()), $$0x -> l.b($$0x, "testName")))))
                                                                     .then(
                                                                        ed.a("runmultiple")
                                                                           .then(
                                                                              ((RequiredArgumentBuilder)ed.a("testName", tp.a())
                                                                                    .executes($$0x -> l.b($$0x, "testName").d()))
                                                                                 .then(
                                                                                    ed.a("amount", IntegerArgumentType.integer())
                                                                                       .executes(
                                                                                          $$0x -> l.a(IntegerArgumentType.getInteger($$0x, "amount"))
                                                                                                .b($$0x, "testName")
                                                                                                .d()
                                                                                       )
                                                                                 )
                                                                           )
                                                                     ))
                                                                  .then(b(ed.a("runall").then($$2), l::d)))
                                                               .then(a(ed.a("runthese"), l::b)))
                                                            .then(a(ed.a("runclosest"), l::a)))
                                                         .then(a(ed.a("runthat"), l::c)))
                                                      .then(b(ed.a("runfailed").then($$1), l::e)))
                                                   .then(ed.a("resetclosest").executes($$0x -> l.a($$0x).a())))
                                                .then(ed.a("resetthese").executes($$0x -> l.b($$0x).a())))
                                             .then(ed.a("resetthat").executes($$0x -> l.c($$0x).a())))
                                          .then(
                                             ed.a("export")
                                                .then(
                                                   ed.a("testName", StringArgumentType.word())
                                                      .executes($$0x -> b((ec)$$0x.getSource(), "minecraft:" + StringArgumentType.getString($$0x, "testName")))
                                                )
                                          ))
                                       .then(ed.a("exportclosest").executes($$0x -> l.a($$0x).c())))
                                    .then(ed.a("exportthese").executes($$0x -> l.b($$0x).c())))
                                 .then(ed.a("exportthat").executes($$0x -> l.c($$0x).c())))
                              .then(ed.a("clearthat").executes($$0x -> l.c($$0x).b())))
                           .then(ed.a("clearthese").executes($$0x -> l.b($$0x).b())))
                        .then(
                           ((LiteralArgumentBuilder)ed.a("clearall").executes($$0x -> l.a($$0x, 200).b()))
                              .then(
                                 ed.a("radius", IntegerArgumentType.integer())
                                    .executes($$0x -> l.a($$0x, axw.a(IntegerArgumentType.getInteger($$0x, "radius"), 0, 1024)).b())
                              )
                        ))
                     .then(
                        ed.a("import")
                           .then(
                              ed.a("testName", StringArgumentType.word())
                                 .executes($$0x -> d((ec)$$0x.getSource(), StringArgumentType.getString($$0x, "testName")))
                           )
                     ))
                  .then(ed.a("stop").executes($$0x -> a())))
               .then(
                  ((LiteralArgumentBuilder)ed.a("pos").executes($$0x -> a((ec)$$0x.getSource(), "pos")))
                     .then(ed.a("var", StringArgumentType.word()).executes($$0x -> a((ec)$$0x.getSource(), StringArgumentType.getString($$0x, "var"))))
               ))
            .then(
               ed.a("create")
                  .then(
                     ((RequiredArgumentBuilder)ed.a("testName", StringArgumentType.word())
                           .suggests(tp::a)
                           .executes($$0x -> a((ec)$$0x.getSource(), StringArgumentType.getString($$0x, "testName"), 5, 5, 5)))
                        .then(
                           ((RequiredArgumentBuilder)ed.a("width", IntegerArgumentType.integer())
                                 .executes(
                                    $$0x -> a(
                                          (ec)$$0x.getSource(),
                                          StringArgumentType.getString($$0x, "testName"),
                                          IntegerArgumentType.getInteger($$0x, "width"),
                                          IntegerArgumentType.getInteger($$0x, "width"),
                                          IntegerArgumentType.getInteger($$0x, "width")
                                       )
                                 ))
                              .then(
                                 ed.a("height", IntegerArgumentType.integer())
                                    .then(
                                       ed.a("depth", IntegerArgumentType.integer())
                                          .executes(
                                             $$0x -> a(
                                                   (ec)$$0x.getSource(),
                                                   StringArgumentType.getString($$0x, "testName"),
                                                   IntegerArgumentType.getInteger($$0x, "width"),
                                                   IntegerArgumentType.getInteger($$0x, "height"),
                                                   IntegerArgumentType.getInteger($$0x, "depth")
                                                )
                                          )
                                    )
                              )
                        )
                  )
            )
      );
   }

   private static int a(su $$0) {
      $$0.f().a_(null, $$0.d()).stream().forEach($$0x -> $$0x.a(bql.c.b));
      $$0.e().c($$0.f());
      tk.a($$0.d(), $$0.f());
      a($$0.f(), "Reset succeded for: " + $$0.b(), n.k);
      return 1;
   }

   static Stream<su> a(ec $$0, th $$1, ti $$2) {
      return $$2.findStructureBlockPos().map($$2x -> a($$2x, $$0.e(), $$1)).flatMap(Optional::stream);
   }

   static Stream<su> a(ec $$0, th $$1, tq $$2, int $$3) {
      return $$2.findTestFunctions().filter($$1x -> a($$0.e(), $$1x.d())).map($$3x -> new su($$3x, tk.a($$3), $$0.e(), $$1));
   }

   private static Optional<su> a(im $$0, aqe $$1, th $$2) {
      dos $$3 = (dos)$$1.c_($$0);
      if ($$3 == null) {
         a($$1, "Structure block entity could not be found", n.m);
         return Optional.empty();
      } else {
         String $$4 = $$3.t();
         Optional<to> $$5 = sw.e($$4);
         if ($$5.isEmpty()) {
            a($$1, "Test function for test " + $$4 + " could not be found", n.m);
            return Optional.empty();
         } else {
            to $$6 = $$5.get();
            su $$7 = new su($$6, $$3.l(), $$1, $$2);
            $$7.a($$0);
            return !a($$1, $$7.s()) ? Optional.empty() : Optional.of($$7);
         }
      }
   }

   private static int a(ec $$0, String $$1, int $$2, int $$3, int $$4) {
      if ($$2 <= 48 && $$3 <= 48 && $$4 <= 48) {
         aqe $$5 = $$0.e();
         im $$6 = a($$0).d();
         tk.a($$1.toLowerCase(), $$6, new jq($$2, $$3, $$4), dji.a, $$5);
         im $$7 = $$6.c();
         im $$8 = $$7.b($$2 - 1, 0, $$4 - 1);
         im.d($$7, $$8).forEach($$1x -> $$5.b($$1x, dcx.F.n()));
         tk.a($$6, new im(1, 0, -1), dji.a, $$5);
         return 0;
      } else {
         throw new IllegalArgumentException("The structure must be less than 48 blocks big in each axis");
      }
   }

   private static int a(ec $$0, String $$1) throws CommandSyntaxException {
      etb $$2 = (etb)$$0.h().a(10.0, 1.0F, false);
      im $$3 = $$2.a();
      aqe $$4 = $$0.e();
      Optional<im> $$5 = tk.a($$3, 15, $$4);
      if ($$5.isEmpty()) {
         $$5 = tk.a($$3, 200, $$4);
      }

      if ($$5.isEmpty()) {
         $$0.b(ws.b("Can't find a structure block that contains the targeted pos " + $$3));
         return 0;
      } else {
         dos $$6 = (dos)$$4.c_($$5.get());
         if ($$6 == null) {
            a($$4, "Structure block entity could not be found", n.m);
            return 0;
         } else {
            im $$7 = $$3.b($$5.get());
            String $$8 = $$7.u() + ", " + $$7.v() + ", " + $$7.w();
            String $$9 = $$6.t();
            ws $$10 = ws.b($$8)
               .b(
                  xp.a
                     .a(true)
                     .a(n.k)
                     .a(new wy(wy.a.a, ws.b("Click to copy to clipboard")))
                     .a(new wq(wq.a.f, "final BlockPos " + $$1 + " = new BlockPos(" + $$8 + ");"))
               );
            $$0.a(() -> ws.b("Position relative to " + $$9 + ": ").b($$10), false);
            afu.a($$4, new im($$3), $$8, -2147418368, 10000);
            return 1;
         }
      }
   }

   static int a() {
      ta.a.a();
      return 1;
   }

   static int a(ec $$0, aqe $$1, sx $$2) {
      $$2.a(new tm.b($$0));
      tf $$3 = new tf($$2.a());
      $$3.a(new tm.c($$1, $$3));
      $$3.a($$0x -> sw.a($$0x.u()));
      $$2.b();
      return 1;
   }

   static int a(ec $$0, dos $$1) {
      String $$2 = $$1.c();
      if (!$$1.b(true)) {
         c($$0, "Failed to save structure " + $$2);
      }

      return b($$0, $$2);
   }

   private static int b(ec $$0, String $$1) {
      Path $$2 = Paths.get(tk.b);
      akf $$3 = new akf($$1);
      Path $$4 = $$0.e().q().a($$3, ".nbt");
      Path $$5 = ou.a(lh.a, $$4, $$3.a(), $$2);
      if ($$5 == null) {
         c($$0, "Failed to export " + $$4);
         return 1;
      } else {
         try {
            v.c($$5.getParent());
         } catch (IOException var7) {
            c($$0, "Could not create folder " + $$5.getParent());
            c.error("Could not create export folder", var7);
            return 1;
         }

         c($$0, "Exported " + $$1 + " to " + $$5.toAbsolutePath());
         return 0;
      }
   }

   private static boolean a(aqe $$0, String $$1) {
      if ($$0.q().b(new akf($$1)).isEmpty()) {
         a($$0, "Test structure " + $$1 + " could not be found", n.m);
         return false;
      } else {
         return true;
      }
   }

   static im a(ec $$0) {
      im $$1 = im.a($$0.d());
      int $$2 = $$0.e().a(dvq.a.b, $$1).v();
      return new im($$1.u(), $$2 + 1, $$1.w() + 3);
   }

   static void c(ec $$0, String $$1) {
      $$0.a(() -> ws.b($$1), false);
   }

   private static int d(ec $$0, String $$1) {
      Path $$2 = Paths.get(tk.b, $$1 + ".snbt");
      akf $$3 = new akf("minecraft", $$1);
      Path $$4 = $$0.e().q().a($$3, ".nbt");

      try {
         BufferedReader $$5 = Files.newBufferedReader($$2);
         String $$6 = IOUtils.toString($$5);
         Files.createDirectories($$4.getParent());

         try (OutputStream $$7 = Files.newOutputStream($$4)) {
            ul.a(un.a($$6), $$7);
         }

         $$0.e().q().d($$3);
         c($$0, "Imported to " + $$4.toAbsolutePath());
         return 0;
      } catch (CommandSyntaxException | IOException var12) {
         c.error("Failed to load structure {}", $$1, var12);
         return 1;
      }
   }

   static void a(aqe $$0, String $$1, n $$2) {
      $$0.a($$0x -> true).forEach($$2x -> $$2x.a(ws.b($$1).a($$2)));
   }

   public static class a {
      private final tn<tm.a> a;

      public a(tn<tm.a> $$0) {
         this.a = $$0;
      }

      public int a() {
         tm.a();
         return tm.a(this.a.a(), th.a(), this.a).map(tm::a).toList().isEmpty() ? 0 : 1;
      }

      private <T> void a(Stream<T> $$0, ToIntFunction<T> $$1, Runnable $$2, Consumer<Integer> $$3) {
         int $$4 = $$0.mapToInt($$1).sum();
         if ($$4 == 0) {
            $$2.run();
         } else {
            $$3.accept($$4);
         }
      }

      public int b() {
         tm.a();
         ec $$0 = this.a.a();
         aqe $$1 = $$0.e();
         sx.a($$1);
         this.a(this.a.findStructureBlockPos(), $$1x -> {
            dos $$2 = (dos)$$1.c_($$1x);
            if ($$2 == null) {
               return 0;
            } else {
               efy $$3 = tk.b($$2);
               tk.a($$3, $$1);
               return 1;
            }
         }, () -> tm.a($$1, "Could not find any structures to clear", n.m), $$1x -> tm.c($$0, "Cleared " + $$1x + " structures"));
         return 1;
      }

      public int c() {
         MutableBoolean $$0 = new MutableBoolean(true);
         ec $$1 = this.a.a();
         aqe $$2 = $$1.e();
         this.a(this.a.findStructureBlockPos(), $$3 -> {
            dos $$4 = (dos)$$2.c_($$3);
            if ($$4 == null) {
               tm.a($$2, "Structure block entity could not be found", n.m);
               $$0.setFalse();
               return 0;
            } else {
               if (tm.a($$1, $$4) != 0) {
                  $$0.setFalse();
               }

               return 1;
            }
         }, () -> tm.a($$2, "Could not find any structures to export", n.m), $$1x -> tm.c($$1, "Exported " + $$1x + " structures"));
         return $$0.getValue() ? 0 : 1;
      }

      public int a(th $$0, int $$1, int $$2) {
         tm.a();
         ec $$3 = this.a.a();
         aqe $$4 = $$3.e();
         im $$5 = tm.a($$3);
         Collection<su> $$6 = Stream.concat(tm.a($$3, $$0, this.a), tm.a($$3, $$0, this.a, $$1)).toList();
         if ($$6.isEmpty()) {
            tm.c($$3, "No tests found");
            return 0;
         } else {
            sx.a($$4);
            sw.d();
            tm.c($$3, "Running " + $$6.size() + " tests...");
            sx $$7 = sx.a.b($$6, $$4).a(new tj($$5, $$2)).a();
            return tm.a($$3, $$4, $$7);
         }
      }

      public int a(int $$0, int $$1) {
         return this.a(th.a(), $$0, $$1);
      }

      public int a(int $$0) {
         return this.a(th.a(), $$0, 8);
      }

      public int a(th $$0, int $$1) {
         return this.a($$0, $$1, 8);
      }

      public int a(th $$0) {
         return this.a($$0, 0, 8);
      }

      public int d() {
         return this.a(th.a());
      }
   }

   static record b(ec a) implements sq {
      @Override
      public void a(so $$0) {
         tm.c(this.a, "Starting batch: " + $$0.a());
      }

      @Override
      public void b(so $$0) {
      }
   }

   public static record c(aqe a, tf b) implements sv {
      @Override
      public void a(su $$0) {
      }

      @Override
      public void a(su $$0, sx $$1) {
         a(this.a, this.b);
      }

      @Override
      public void b(su $$0, sx $$1) {
         a(this.a, this.b);
      }

      @Override
      public void a(su $$0, su $$1, sx $$2) {
         this.b.a($$1);
      }

      private static void a(aqe $$0, tf $$1) {
         if ($$1.i()) {
            tm.a($$0, "GameTest done! " + $$1.h() + " tests were run", n.p);
            if ($$1.d()) {
               tm.a($$0, $$1.a() + " required tests failed :(", n.m);
            } else {
               tm.a($$0, "All required tests passed :)", n.k);
            }

            if ($$1.e()) {
               tm.a($$0, $$1.b() + " optional tests failed", n.h);
            }
         }
      }
   }
}
