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

public class so {
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
   private static final sp.a<so.a> l = new sp.a<>(so.a::new);

   private static ArgumentBuilder<du, ?> a(
      ArgumentBuilder<du, ?> $$0, Function<CommandContext<du>, so.a> $$1, Function<ArgumentBuilder<du, ?>, ArgumentBuilder<du, ?>> $$2
   ) {
      return $$0.executes($$1x -> $$1.apply($$1x).d())
         .then(
            ((RequiredArgumentBuilder)dv.a("numberOfTimes", IntegerArgumentType.integer(0))
                  .executes($$1x -> $$1.apply($$1x).a(new sj(IntegerArgumentType.getInteger($$1x, "numberOfTimes"), false))))
               .then(
                  $$2.apply(
                     dv.a("untilFailed", BoolArgumentType.bool())
                        .executes(
                           $$1x -> $$1.apply($$1x)
                                 .a(new sj(IntegerArgumentType.getInteger($$1x, "numberOfTimes"), BoolArgumentType.getBool($$1x, "untilFailed")))
                        )
                  )
               )
         );
   }

   private static ArgumentBuilder<du, ?> a(ArgumentBuilder<du, ?> $$0, Function<CommandContext<du>, so.a> $$1) {
      return a($$0, $$1, $$0x -> $$0x);
   }

   private static ArgumentBuilder<du, ?> b(ArgumentBuilder<du, ?> $$0, Function<CommandContext<du>, so.a> $$1) {
      return a(
         $$0,
         $$1,
         $$1x -> $$1x.then(
               ((RequiredArgumentBuilder)dv.a("rotationSteps", IntegerArgumentType.integer())
                     .executes(
                        $$1xx -> $$1.apply($$1xx)
                              .a(
                                 new sj(IntegerArgumentType.getInteger($$1xx, "numberOfTimes"), BoolArgumentType.getBool($$1xx, "untilFailed")),
                                 IntegerArgumentType.getInteger($$1xx, "rotationSteps")
                              )
                     ))
                  .then(
                     dv.a("testsPerRow", IntegerArgumentType.integer())
                        .executes(
                           $$1xx -> $$1.apply($$1xx)
                                 .a(
                                    new sj(IntegerArgumentType.getInteger($$1xx, "numberOfTimes"), BoolArgumentType.getBool($$1xx, "untilFailed")),
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
      ArgumentBuilder<du, ?> $$2 = b(dv.a("testClassName", sn.a()), $$0x -> l.a($$0x, sn.a($$0x, "testClassName")));
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dv.a(
                                                                        "test"
                                                                     )
                                                                     .then(dv.a("run").then(b(dv.a("testName", sr.a()), $$0x -> l.b($$0x, "testName")))))
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
                                    .executes($$0x -> l.a($$0x, aww.a(IntegerArgumentType.getInteger($$0x, "radius"), 0, 1024)).b())
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
                           .suggests(sr::a)
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

   private static int a(rw $$0) {
      $$0.e().c($$0.f());
      a($$0.f(), "Reset succeded for: " + $$0.b(), n.k);
      return 1;
   }

   static Stream<rw> a(du $$0, sj $$1, sk $$2) {
      return $$2.findStructureBlockPos().map($$2x -> a($$2x, $$0.e(), $$1)).flatMap(Optional::stream);
   }

   static Stream<rw> a(du $$0, sj $$1, ss $$2, int $$3) {
      return $$2.findTestFunctions().filter($$1x -> a($$0.e(), $$1x.d())).map($$3x -> new rw($$3x, sm.a($$3), $$0.e(), $$1));
   }

   private static Optional<rw> a(ib $$0, apf $$1, sj $$2) {
      dlu $$3 = (dlu)$$1.c_($$0);
      if ($$3 == null) {
         a($$1, "Structure block entity could not be found", n.m);
         return Optional.empty();
      } else {
         String $$4 = $$3.s();
         Optional<sq> $$5 = ry.e($$4);
         if ($$5.isEmpty()) {
            a($$1, "Test function for test " + $$4 + " could not be found", n.m);
            return Optional.empty();
         } else {
            sq $$6 = $$5.get();
            rw $$7 = new rw($$6, $$3.l(), $$1, $$2);
            $$7.a($$0);
            return !a($$1, $$7.s()) ? Optional.empty() : Optional.of($$7);
         }
      }
   }

   private static int a(du $$0, String $$1, int $$2, int $$3, int $$4) {
      if ($$2 <= 48 && $$3 <= 48 && $$4 <= 48) {
         apf $$5 = $$0.e();
         ib $$6 = a($$0).d();
         sm.a($$1.toLowerCase(), $$6, new jg($$2, $$3, $$4), dgm.a, $$5);

         for (int $$7 = 0; $$7 < $$2; $$7++) {
            for (int $$8 = 0; $$8 < $$4; $$8++) {
               ib $$9 = new ib($$6.u() + $$7, $$6.v() + 1, $$6.w() + $$8);
               daa $$10 = dac.h;
               fj $$11 = new fj($$10.o(), Collections.emptySet(), null);
               $$11.a($$5, $$9, 2);
            }
         }

         sm.a($$6, new ib(1, 0, -1), dgm.a, $$5);
         return 0;
      } else {
         throw new IllegalArgumentException("The structure must be less than 48 blocks big in each axis");
      }
   }

   private static int a(du $$0, String $$1) throws CommandSyntaxException {
      epn $$2 = (epn)$$0.h().a(10.0, 1.0F, false);
      ib $$3 = $$2.a();
      apf $$4 = $$0.e();
      Optional<ib> $$5 = sm.a($$3, 15, $$4);
      if ($$5.isEmpty()) {
         $$5 = sm.a($$3, 200, $$4);
      }

      if ($$5.isEmpty()) {
         $$0.b(vu.b("Can't find a structure block that contains the targeted pos " + $$3));
         return 0;
      } else {
         dlu $$6 = (dlu)$$4.c_($$5.get());
         if ($$6 == null) {
            a($$4, "Structure block entity could not be found", n.m);
            return 0;
         } else {
            ib $$7 = $$3.b($$5.get());
            String $$8 = $$7.u() + ", " + $$7.v() + ", " + $$7.w();
            String $$9 = $$6.s();
            vu $$10 = vu.b($$8)
               .b(
                  wr.a
                     .a(true)
                     .a(n.k)
                     .a(new wa(wa.a.a, vu.b("Click to copy to clipboard")))
                     .a(new vs(vs.a.f, "final BlockPos " + $$1 + " = new BlockPos(" + $$8 + ");"))
               );
            $$0.a(() -> vu.b("Position relative to " + $$9 + ": ").b($$10), false);
            aew.a($$4, new ib($$3), $$8, -2147418368, 10000);
            return 1;
         }
      }
   }

   static int a() {
      sc.a.a();
      return 1;
   }

   static int a(du $$0, apf $$1, rz $$2) {
      $$2.a(new so.b($$0));
      sh $$3 = new sh($$2.a());
      $$3.a(new so.c($$1, $$3));
      $$3.a($$0x -> ry.a($$0x.u()));
      $$2.b();
      return 1;
   }

   static int a(du $$0, dlu $$1) {
      String $$2 = $$1.c();
      if (!$$1.b(true)) {
         c($$0, "Failed to save structure " + $$2);
      }

      return b($$0, $$2);
   }

   private static int b(du $$0, String $$1) {
      Path $$2 = Paths.get(sm.b);
      ajh $$3 = new ajh($$1);
      Path $$4 = $$0.e().q().a($$3, ".nbt");
      Path $$5 = nx.a(kn.a, $$4, $$3.a(), $$2);
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

   private static boolean a(apf $$0, String $$1) {
      if ($$0.q().b(new ajh($$1)).isEmpty()) {
         a($$0, "Test structure " + $$1 + " could not be found", n.m);
         return false;
      } else {
         return true;
      }
   }

   static ib a(du $$0) {
      ib $$1 = ib.a($$0.d());
      int $$2 = $$0.e().a(dsm.a.b, $$1).v();
      return new ib($$1.u(), $$2 + 1, $$1.w() + 3);
   }

   static void c(du $$0, String $$1) {
      $$0.a(() -> vu.b($$1), false);
   }

   private static int d(du $$0, String $$1) {
      Path $$2 = Paths.get(sm.b, $$1 + ".snbt");
      ajh $$3 = new ajh("minecraft", $$1);
      Path $$4 = $$0.e().q().a($$3, ".nbt");

      try {
         BufferedReader $$5 = Files.newBufferedReader($$2);
         String $$6 = IOUtils.toString($$5);
         Files.createDirectories($$4.getParent());

         try (OutputStream $$7 = Files.newOutputStream($$4)) {
            tn.a(tp.a($$6), $$7);
         }

         $$0.e().q().d($$3);
         c($$0, "Imported to " + $$4.toAbsolutePath());
         return 0;
      } catch (CommandSyntaxException | IOException var12) {
         c.error("Failed to load structure {}", $$1, var12);
         return 1;
      }
   }

   static void a(apf $$0, String $$1, n $$2) {
      $$0.a($$0x -> true).forEach($$2x -> $$2x.a(vu.b($$1).a($$2)));
   }

   public static class a {
      private final sp<so.a> a;

      public a(sp<so.a> $$0) {
         this.a = $$0;
      }

      public int a() {
         so.a();
         return so.a(this.a.a(), sj.a(), this.a).map(so::a).toList().isEmpty() ? 0 : 1;
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
         so.a();
         du $$0 = this.a.a();
         apf $$1 = $$0.e();
         rz.a($$1);
         this.a(this.a.findStructureBlockPos(), $$1x -> {
            dlu $$2 = (dlu)$$1.c_($$1x);
            if ($$2 == null) {
               return 0;
            } else {
               ecu $$3 = sm.b($$2);
               sm.a($$3, $$1);
               return 1;
            }
         }, () -> so.a($$1, "Could not find any structures to clear", n.m), $$1x -> so.c($$0, "Cleared " + $$1x + " structures"));
         return 1;
      }

      public int c() {
         MutableBoolean $$0 = new MutableBoolean(true);
         du $$1 = this.a.a();
         apf $$2 = $$1.e();
         this.a(this.a.findStructureBlockPos(), $$3 -> {
            dlu $$4 = (dlu)$$2.c_($$3);
            if ($$4 == null) {
               so.a($$2, "Structure block entity could not be found", n.m);
               $$0.setFalse();
               return 0;
            } else {
               if (so.a($$1, $$4) != 0) {
                  $$0.setFalse();
               }

               return 1;
            }
         }, () -> so.a($$2, "Could not find any structures to export", n.m), $$1x -> so.c($$1, "Exported " + $$1x + " structures"));
         return $$0.getValue() ? 0 : 1;
      }

      public int a(sj $$0, int $$1, int $$2) {
         so.a();
         du $$3 = this.a.a();
         apf $$4 = $$3.e();
         ib $$5 = so.a($$3);
         Collection<rw> $$6 = Stream.concat(so.a($$3, $$0, this.a), so.a($$3, $$0, this.a, $$1)).toList();
         if ($$6.isEmpty()) {
            so.c($$3, "No tests found");
            return 0;
         } else {
            rz.a($$4);
            ry.d();
            so.c($$3, "Running " + $$6.size() + " tests...");
            rz $$7 = rz.a.b($$6, $$4).a(new sl($$5, $$2)).a();
            return so.a($$3, $$4, $$7);
         }
      }

      public int a(int $$0, int $$1) {
         return this.a(sj.a(), $$0, $$1);
      }

      public int a(int $$0) {
         return this.a(sj.a(), $$0, 8);
      }

      public int a(sj $$0, int $$1) {
         return this.a($$0, $$1, 8);
      }

      public int a(sj $$0) {
         return this.a($$0, 0, 8);
      }

      public int d() {
         return this.a(sj.a());
      }
   }

   static record b(du a) implements rs {
      @Override
      public void a(rq $$0) {
         so.c(this.a, "Starting batch: " + $$0.a());
      }

      @Override
      public void b(rq $$0) {
      }
   }

   public static record c(apf a, sh b) implements rx {
      @Override
      public void a(rw $$0) {
      }

      @Override
      public void a(rw $$0, rz $$1) {
         a(this.a, this.b);
      }

      @Override
      public void b(rw $$0, rz $$1) {
         a(this.a, this.b);
      }

      @Override
      public void a(rw $$0, rw $$1, rz $$2) {
         this.b.a($$1);
      }

      private static void a(apf $$0, sh $$1) {
         if ($$1.i()) {
            so.a($$0, "GameTest done! " + $$1.h() + " tests were run", n.p);
            if ($$1.d()) {
               so.a($$0, $$1.a() + " required tests failed :(", n.m);
            } else {
               so.a($$0, "All required tests passed :)", n.k);
            }

            if ($$1.e()) {
               so.a($$0, $$1.b() + " optional tests failed", n.h);
            }
         }
      }
   }
}
