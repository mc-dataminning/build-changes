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
import java.util.Collections;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.ToIntFunction;
import java.util.stream.Stream;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.mutable.MutableBoolean;
import org.slf4j.Logger;

public class sm {
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
   private static final sn.a<sm.a> l = new sn.a<>(sm.a::new);

   private static ArgumentBuilder<du, ?> a(
      ArgumentBuilder<du, ?> $$0, Function<CommandContext<du>, sm.a> $$1, Function<ArgumentBuilder<du, ?>, ArgumentBuilder<du, ?>> $$2
   ) {
      return $$0.executes($$1x -> $$1.apply($$1x).d())
         .then(
            ((RequiredArgumentBuilder)dv.a("numberOfTimes", IntegerArgumentType.integer(0))
                  .executes($$1x -> $$1.apply($$1x).a(new sh(IntegerArgumentType.getInteger($$1x, "numberOfTimes"), false))))
               .then(
                  $$2.apply(
                     dv.a("untilFailed", BoolArgumentType.bool())
                        .executes(
                           $$1x -> $$1.apply($$1x)
                                 .a(new sh(IntegerArgumentType.getInteger($$1x, "numberOfTimes"), BoolArgumentType.getBool($$1x, "untilFailed")))
                        )
                  )
               )
         );
   }

   private static ArgumentBuilder<du, ?> a(ArgumentBuilder<du, ?> $$0, Function<CommandContext<du>, sm.a> $$1) {
      return a($$0, $$1, $$0x -> $$0x);
   }

   private static ArgumentBuilder<du, ?> b(ArgumentBuilder<du, ?> $$0, Function<CommandContext<du>, sm.a> $$1) {
      return a(
         $$0,
         $$1,
         $$1x -> $$1x.then(
               ((RequiredArgumentBuilder)dv.a("rotationSteps", IntegerArgumentType.integer())
                     .executes(
                        $$1xx -> $$1.apply($$1xx)
                              .a(
                                 new sh(IntegerArgumentType.getInteger($$1xx, "numberOfTimes"), BoolArgumentType.getBool($$1xx, "untilFailed")),
                                 IntegerArgumentType.getInteger($$1xx, "rotationSteps")
                              )
                     ))
                  .then(
                     dv.a("testsPerRow", IntegerArgumentType.integer())
                        .executes(
                           $$1xx -> $$1.apply($$1xx)
                                 .a(
                                    new sh(IntegerArgumentType.getInteger($$1xx, "numberOfTimes"), BoolArgumentType.getBool($$1xx, "untilFailed")),
                                    IntegerArgumentType.getInteger($$1xx, "rotationSteps"),
                                    IntegerArgumentType.getInteger($$1xx, "testsPerRow")
                                 )
                        )
                  )
            )
      );
   }

   public static void a(CommandDispatcher<du> $$0) {
      ArgumentBuilder<du, ?> $$1 = b(dv.a("onlyRequiredTests", BoolArgumentType.bool()), $$0x -> l.a($$0x, BoolArgumentType.getBool($$0x, "onlyRequiredTests")));
      ArgumentBuilder<du, ?> $$2 = b(dv.a("testClassName", sl.a()), $$0x -> l.a($$0x, sl.a($$0x, "testClassName")));
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dv.a(
                                                                        "test"
                                                                     )
                                                                     .then(dv.a("run").then(b(dv.a("testName", sp.a()), $$0x -> l.b($$0x, "testName")))))
                                                                  .then(b(dv.a("runall").then($$2), l::d)))
                                                               .then(a(dv.a("runthese"), l::b)))
                                                            .then(a(dv.a("runclosest"), l::a)))
                                                         .then(a(dv.a("runthat"), l::c)))
                                                      .then(b(dv.a("runfailed").then($$1), l::e)))
                                                   .then(dv.a("resetclosest").executes($$0x -> l.a($$0x).a())))
                                                .then(dv.a("resetthese").executes($$0x -> l.b($$0x).a())))
                                             .then(dv.a("resetthat").executes($$0x -> l.c($$0x).a())))
                                          .then(
                                             dv.a("export")
                                                .then(
                                                   dv.a("testName", StringArgumentType.word())
                                                      .executes($$0x -> b((du)$$0x.getSource(), "minecraft:" + StringArgumentType.getString($$0x, "testName")))
                                                )
                                          ))
                                       .then(dv.a("exportclosest").executes($$0x -> l.a($$0x).c())))
                                    .then(dv.a("exportthese").executes($$0x -> l.b($$0x).c())))
                                 .then(dv.a("exportthat").executes($$0x -> l.c($$0x).c())))
                              .then(dv.a("clearthat").executes($$0x -> l.c($$0x).b())))
                           .then(dv.a("clearthese").executes($$0x -> l.b($$0x).b())))
                        .then(
                           ((LiteralArgumentBuilder)dv.a("clearall").executes($$0x -> l.a($$0x, 200).b()))
                              .then(
                                 dv.a("radius", IntegerArgumentType.integer())
                                    .executes($$0x -> l.a($$0x, awm.a(IntegerArgumentType.getInteger($$0x, "radius"), 0, 1024)).b())
                              )
                        ))
                     .then(
                        dv.a("import")
                           .then(
                              dv.a("testName", StringArgumentType.word())
                                 .executes($$0x -> d((du)$$0x.getSource(), StringArgumentType.getString($$0x, "testName")))
                           )
                     ))
                  .then(dv.a("stop").executes($$0x -> a())))
               .then(
                  ((LiteralArgumentBuilder)dv.a("pos").executes($$0x -> a((du)$$0x.getSource(), "pos")))
                     .then(dv.a("var", StringArgumentType.word()).executes($$0x -> a((du)$$0x.getSource(), StringArgumentType.getString($$0x, "var"))))
               ))
            .then(
               dv.a("create")
                  .then(
                     ((RequiredArgumentBuilder)dv.a("testName", StringArgumentType.word())
                           .suggests(sp::a)
                           .executes($$0x -> a((du)$$0x.getSource(), StringArgumentType.getString($$0x, "testName"), 5, 5, 5)))
                        .then(
                           ((RequiredArgumentBuilder)dv.a("width", IntegerArgumentType.integer())
                                 .executes(
                                    $$0x -> a(
                                          (du)$$0x.getSource(),
                                          StringArgumentType.getString($$0x, "testName"),
                                          IntegerArgumentType.getInteger($$0x, "width"),
                                          IntegerArgumentType.getInteger($$0x, "width"),
                                          IntegerArgumentType.getInteger($$0x, "width")
                                       )
                                 ))
                              .then(
                                 dv.a("height", IntegerArgumentType.integer())
                                    .then(
                                       dv.a("depth", IntegerArgumentType.integer())
                                          .executes(
                                             $$0x -> a(
                                                   (du)$$0x.getSource(),
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

   private static int a(ru $$0) {
      $$0.e().c($$0.f());
      a($$0.f(), "Reset succeded for: " + $$0.b(), n.k);
      return 1;
   }

   static Stream<ru> a(du $$0, sh $$1, si $$2) {
      return $$2.findStructureBlockPos().map($$2x -> a($$2x, $$0.e(), $$1)).flatMap(Optional::stream);
   }

   static Stream<ru> a(du $$0, sh $$1, sq $$2, int $$3) {
      return $$2.findTestFunctions().filter($$1x -> a($$0.e(), $$1x.d())).map($$3x -> new ru($$3x, sk.a($$3), $$0.e(), $$1));
   }

   private static Optional<ru> a(ib $$0, apa $$1, sh $$2) {
      dkz $$3 = (dkz)$$1.c_($$0);
      if ($$3 == null) {
         a($$1, "Structure block entity could not be found", n.m);
         return Optional.empty();
      } else {
         String $$4 = $$3.s();
         Optional<so> $$5 = rw.e($$4);
         if ($$5.isEmpty()) {
            a($$1, "Test function for test " + $$4 + " could not be found", n.m);
            return Optional.empty();
         } else {
            so $$6 = $$5.get();
            ru $$7 = new ru($$6, $$3.l(), $$1, $$2);
            $$7.a($$0);
            return !a($$1, $$7.s()) ? Optional.empty() : Optional.of($$7);
         }
      }
   }

   private static int a(du $$0, String $$1, int $$2, int $$3, int $$4) {
      if ($$2 <= 48 && $$3 <= 48 && $$4 <= 48) {
         apa $$5 = $$0.e();
         ib $$6 = a($$0).d();
         sk.a($$1.toLowerCase(), $$6, new jf($$2, $$3, $$4), dfr.a, $$5);

         for (int $$7 = 0; $$7 < $$2; $$7++) {
            for (int $$8 = 0; $$8 < $$4; $$8++) {
               ib $$9 = new ib($$6.u() + $$7, $$6.v() + 1, $$6.w() + $$8);
               czf $$10 = czh.h;
               fj $$11 = new fj($$10.o(), Collections.emptySet(), null);
               $$11.a($$5, $$9, 2);
            }
         }

         sk.a($$6, new ib(1, 0, -1), dfr.a, $$5);
         return 0;
      } else {
         throw new IllegalArgumentException("The structure must be less than 48 blocks big in each axis");
      }
   }

   private static int a(du $$0, String $$1) throws CommandSyntaxException {
      eor $$2 = (eor)$$0.h().a(10.0, 1.0F, false);
      ib $$3 = $$2.a();
      apa $$4 = $$0.e();
      Optional<ib> $$5 = sk.a($$3, 15, $$4);
      if ($$5.isEmpty()) {
         $$5 = sk.a($$3, 200, $$4);
      }

      if ($$5.isEmpty()) {
         $$0.b(vs.b("Can't find a structure block that contains the targeted pos " + $$3));
         return 0;
      } else {
         dkz $$6 = (dkz)$$4.c_($$5.get());
         if ($$6 == null) {
            a($$4, "Structure block entity could not be found", n.m);
            return 0;
         } else {
            ib $$7 = $$3.b($$5.get());
            String $$8 = $$7.u() + ", " + $$7.v() + ", " + $$7.w();
            String $$9 = $$6.s();
            vs $$10 = vs.b($$8)
               .b(
                  wp.a
                     .a(true)
                     .a(n.k)
                     .a(new vy(vy.a.a, vs.b("Click to copy to clipboard")))
                     .a(new vq(vq.a.f, "final BlockPos " + $$1 + " = new BlockPos(" + $$8 + ");"))
               );
            $$0.a(() -> vs.b("Position relative to " + $$9 + ": ").b($$10), false);
            aes.a($$4, new ib($$3), $$8, -2147418368, 10000);
            return 1;
         }
      }
   }

   static int a() {
      sa.a.a();
      return 1;
   }

   static int a(du $$0, apa $$1, rx $$2) {
      $$2.a(new sm.b($$0));
      sf $$3 = new sf($$2.a());
      $$3.a(new sm.c($$1, $$3));
      $$3.a($$0x -> rw.a($$0x.u()));
      $$2.b();
      return 1;
   }

   static int a(du $$0, dkz $$1) {
      String $$2 = $$1.c();
      if (!$$1.b(true)) {
         c($$0, "Failed to save structure " + $$2);
      }

      return b($$0, $$2);
   }

   private static int b(du $$0, String $$1) {
      Path $$2 = Paths.get(sk.b);
      ajc $$3 = new ajc($$1);
      Path $$4 = $$0.e().q().a($$3, ".nbt");
      Path $$5 = nv.a(km.a, $$4, $$3.a(), $$2);
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

   private static boolean a(apa $$0, String $$1) {
      if ($$0.q().b(new ajc($$1)).isEmpty()) {
         a($$0, "Test structure " + $$1 + " could not be found", n.m);
         return false;
      } else {
         return true;
      }
   }

   static ib a(du $$0) {
      ib $$1 = ib.a($$0.d());
      int $$2 = $$0.e().a(drq.a.b, $$1).v();
      return new ib($$1.u(), $$2 + 1, $$1.w() + 3);
   }

   static void c(du $$0, String $$1) {
      $$0.a(() -> vs.b($$1), false);
   }

   private static int d(du $$0, String $$1) {
      Path $$2 = Paths.get(sk.b, $$1 + ".snbt");
      ajc $$3 = new ajc("minecraft", $$1);
      Path $$4 = $$0.e().q().a($$3, ".nbt");

      try {
         BufferedReader $$5 = Files.newBufferedReader($$2);
         String $$6 = IOUtils.toString($$5);
         Files.createDirectories($$4.getParent());

         try (OutputStream $$7 = Files.newOutputStream($$4)) {
            tl.a(tn.a($$6), $$7);
         }

         $$0.e().q().d($$3);
         c($$0, "Imported to " + $$4.toAbsolutePath());
         return 0;
      } catch (CommandSyntaxException | IOException var12) {
         c.error("Failed to load structure {}", $$1, var12);
         return 1;
      }
   }

   static void a(apa $$0, String $$1, n $$2) {
      $$0.a($$0x -> true).forEach($$2x -> $$2x.a(vs.b($$1).a($$2)));
   }

   public static class a {
      private final sn<sm.a> a;

      public a(sn<sm.a> $$0) {
         this.a = $$0;
      }

      public int a() {
         sm.a();
         return sm.a(this.a.a(), sh.a(), this.a).map(sm::a).toList().isEmpty() ? 0 : 1;
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
         sm.a();
         du $$0 = this.a.a();
         apa $$1 = $$0.e();
         rx.a($$1);
         this.a(this.a.findStructureBlockPos(), $$1x -> {
            dkz $$2 = (dkz)$$1.c_($$1x);
            if ($$2 == null) {
               return 0;
            } else {
               eby $$3 = sk.b($$2);
               sk.a($$3, $$1);
               return 1;
            }
         }, () -> sm.a($$1, "Could not find any structures to clear", n.m), $$1x -> sm.c($$0, "Cleared " + $$1x + " structures"));
         return 1;
      }

      public int c() {
         MutableBoolean $$0 = new MutableBoolean(true);
         du $$1 = this.a.a();
         apa $$2 = $$1.e();
         this.a(this.a.findStructureBlockPos(), $$3 -> {
            dkz $$4 = (dkz)$$2.c_($$3);
            if ($$4 == null) {
               sm.a($$2, "Structure block entity could not be found", n.m);
               $$0.setFalse();
               return 0;
            } else {
               if (sm.a($$1, $$4) != 0) {
                  $$0.setFalse();
               }

               return 1;
            }
         }, () -> sm.a($$2, "Could not find any structures to export", n.m), $$1x -> sm.c($$1, "Exported " + $$1x + " structures"));
         return $$0.getValue() ? 0 : 1;
      }

      public int a(sh $$0, int $$1, int $$2) {
         sm.a();
         du $$3 = this.a.a();
         apa $$4 = $$3.e();
         ib $$5 = sm.a($$3);
         Collection<ru> $$6 = Stream.concat(sm.a($$3, $$0, this.a), sm.a($$3, $$0, this.a, $$1)).toList();
         if ($$6.isEmpty()) {
            sm.c($$3, "No tests found");
            return 0;
         } else {
            rx.a($$4);
            rw.d();
            sm.c($$3, "Running " + $$6.size() + " tests...");
            rx $$7 = rx.a.b($$6, $$4).a(new sj($$5, $$2)).a();
            return sm.a($$3, $$4, $$7);
         }
      }

      public int a(int $$0, int $$1) {
         return this.a(sh.a(), $$0, $$1);
      }

      public int a(int $$0) {
         return this.a(sh.a(), $$0, 8);
      }

      public int a(sh $$0, int $$1) {
         return this.a($$0, $$1, 8);
      }

      public int a(sh $$0) {
         return this.a($$0, 0, 8);
      }

      public int d() {
         return this.a(sh.a());
      }
   }

   static record b(du a) implements rq {
      @Override
      public void a(ro $$0) {
         sm.c(this.a, "Starting batch: " + $$0.a());
      }

      @Override
      public void b(ro $$0) {
      }
   }

   public static record c(apa a, sf b) implements rv {
      @Override
      public void a(ru $$0) {
      }

      @Override
      public void a(ru $$0, rx $$1) {
         a(this.a, this.b);
      }

      @Override
      public void b(ru $$0, rx $$1) {
         a(this.a, this.b);
      }

      @Override
      public void a(ru $$0, ru $$1, rx $$2) {
         this.b.a($$1);
      }

      private static void a(apa $$0, sf $$1) {
         if ($$1.i()) {
            sm.a($$0, "GameTest done! " + $$1.h() + " tests were run", n.p);
            if ($$1.d()) {
               sm.a($$0, $$1.a() + " required tests failed :(", n.m);
            } else {
               sm.a($$0, "All required tests passed :)", n.k);
            }

            if ($$1.e()) {
               sm.a($$0, $$1.b() + " optional tests failed", n.h);
            }
         }
      }
   }
}
