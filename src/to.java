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
import org.apache.commons.lang3.mutable.MutableInt;
import org.slf4j.Logger;

public class to {
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
   private static final tp.a<to.a> l = new tp.a<>(to.a::new);

   private static ArgumentBuilder<et, ?> a(
      ArgumentBuilder<et, ?> $$0, Function<CommandContext<et>, to.a> $$1, Function<ArgumentBuilder<et, ?>, ArgumentBuilder<et, ?>> $$2
   ) {
      return $$0.executes($$1x -> $$1.apply($$1x).d())
         .then(
            ((RequiredArgumentBuilder)eu.a("numberOfTimes", IntegerArgumentType.integer(0))
                  .executes($$1x -> $$1.apply($$1x).a(new tj(IntegerArgumentType.getInteger($$1x, "numberOfTimes"), false))))
               .then(
                  $$2.apply(
                     eu.a("untilFailed", BoolArgumentType.bool())
                        .executes(
                           $$1x -> $$1.apply($$1x)
                                 .a(new tj(IntegerArgumentType.getInteger($$1x, "numberOfTimes"), BoolArgumentType.getBool($$1x, "untilFailed")))
                        )
                  )
               )
         );
   }

   private static ArgumentBuilder<et, ?> a(ArgumentBuilder<et, ?> $$0, Function<CommandContext<et>, to.a> $$1) {
      return a($$0, $$1, $$0x -> $$0x);
   }

   private static ArgumentBuilder<et, ?> b(ArgumentBuilder<et, ?> $$0, Function<CommandContext<et>, to.a> $$1) {
      return a(
         $$0,
         $$1,
         $$1x -> $$1x.then(
               ((RequiredArgumentBuilder)eu.a("rotationSteps", IntegerArgumentType.integer())
                     .executes(
                        $$1xx -> $$1.apply($$1xx)
                              .a(
                                 new tj(IntegerArgumentType.getInteger($$1xx, "numberOfTimes"), BoolArgumentType.getBool($$1xx, "untilFailed")),
                                 IntegerArgumentType.getInteger($$1xx, "rotationSteps")
                              )
                     ))
                  .then(
                     eu.a("testsPerRow", IntegerArgumentType.integer())
                        .executes(
                           $$1xx -> $$1.apply($$1xx)
                                 .a(
                                    new tj(IntegerArgumentType.getInteger($$1xx, "numberOfTimes"), BoolArgumentType.getBool($$1xx, "untilFailed")),
                                    IntegerArgumentType.getInteger($$1xx, "rotationSteps"),
                                    IntegerArgumentType.getInteger($$1xx, "testsPerRow")
                                 )
                        )
                  )
            )
      );
   }

   public static void a(CommandDispatcher<et> $$0) {
      ArgumentBuilder<et, ?> $$1 = b(eu.a("onlyRequiredTests", BoolArgumentType.bool()), $$0x -> l.a($$0x, BoolArgumentType.getBool($$0x, "onlyRequiredTests")));
      ArgumentBuilder<et, ?> $$2 = b(eu.a("testClassName", tn.a()), $$0x -> l.a($$0x, tn.a($$0x, "testClassName")));
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)eu.a(
                                                                              "test"
                                                                           )
                                                                           .then(eu.a("run").then(b(eu.a("testName", tr.a()), $$0x -> l.b($$0x, "testName")))))
                                                                        .then(
                                                                           eu.a("runmultiple")
                                                                              .then(
                                                                                 ((RequiredArgumentBuilder)eu.a("testName", tr.a())
                                                                                       .executes($$0x -> l.b($$0x, "testName").d()))
                                                                                    .then(
                                                                                       eu.a("amount", IntegerArgumentType.integer())
                                                                                          .executes(
                                                                                             $$0x -> l.a(IntegerArgumentType.getInteger($$0x, "amount"))
                                                                                                   .b($$0x, "testName")
                                                                                                   .d()
                                                                                          )
                                                                                    )
                                                                              )
                                                                        ))
                                                                     .then(b(eu.a("runall").then($$2), l::d)))
                                                                  .then(a(eu.a("runthese"), l::b)))
                                                               .then(a(eu.a("runclosest"), l::a)))
                                                            .then(a(eu.a("runthat"), l::c)))
                                                         .then(b(eu.a("runfailed").then($$1), l::e)))
                                                      .then(
                                                         eu.a("locate")
                                                            .then(
                                                               eu.a("testName", tr.a())
                                                                  .executes($$0x -> l.c($$0x, "minecraft:" + tr.a($$0x, "testName").d()).e())
                                                            )
                                                      ))
                                                   .then(eu.a("resetclosest").executes($$0x -> l.a($$0x).a())))
                                                .then(eu.a("resetthese").executes($$0x -> l.b($$0x).a())))
                                             .then(eu.a("resetthat").executes($$0x -> l.c($$0x).a())))
                                          .then(
                                             eu.a("export")
                                                .then(
                                                   eu.a("testName", StringArgumentType.word())
                                                      .executes($$0x -> b((et)$$0x.getSource(), "minecraft:" + StringArgumentType.getString($$0x, "testName")))
                                                )
                                          ))
                                       .then(eu.a("exportclosest").executes($$0x -> l.a($$0x).c())))
                                    .then(eu.a("exportthese").executes($$0x -> l.b($$0x).c())))
                                 .then(eu.a("exportthat").executes($$0x -> l.c($$0x).c())))
                              .then(eu.a("clearthat").executes($$0x -> l.c($$0x).b())))
                           .then(eu.a("clearthese").executes($$0x -> l.b($$0x).b())))
                        .then(
                           ((LiteralArgumentBuilder)eu.a("clearall").executes($$0x -> l.a($$0x, 200).b()))
                              .then(
                                 eu.a("radius", IntegerArgumentType.integer())
                                    .executes($$0x -> l.a($$0x, ayn.a(IntegerArgumentType.getInteger($$0x, "radius"), 0, 1024)).b())
                              )
                        ))
                     .then(
                        eu.a("import")
                           .then(
                              eu.a("testName", StringArgumentType.word())
                                 .executes($$0x -> d((et)$$0x.getSource(), StringArgumentType.getString($$0x, "testName")))
                           )
                     ))
                  .then(eu.a("stop").executes($$0x -> a())))
               .then(
                  ((LiteralArgumentBuilder)eu.a("pos").executes($$0x -> a((et)$$0x.getSource(), "pos")))
                     .then(eu.a("var", StringArgumentType.word()).executes($$0x -> a((et)$$0x.getSource(), StringArgumentType.getString($$0x, "var"))))
               ))
            .then(
               eu.a("create")
                  .then(
                     ((RequiredArgumentBuilder)eu.a("testName", StringArgumentType.word())
                           .suggests(tr::a)
                           .executes($$0x -> a((et)$$0x.getSource(), StringArgumentType.getString($$0x, "testName"), 5, 5, 5)))
                        .then(
                           ((RequiredArgumentBuilder)eu.a("width", IntegerArgumentType.integer())
                                 .executes(
                                    $$0x -> a(
                                          (et)$$0x.getSource(),
                                          StringArgumentType.getString($$0x, "testName"),
                                          IntegerArgumentType.getInteger($$0x, "width"),
                                          IntegerArgumentType.getInteger($$0x, "width"),
                                          IntegerArgumentType.getInteger($$0x, "width")
                                       )
                                 ))
                              .then(
                                 eu.a("height", IntegerArgumentType.integer())
                                    .then(
                                       eu.a("depth", IntegerArgumentType.integer())
                                          .executes(
                                             $$0x -> a(
                                                   (et)$$0x.getSource(),
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

   private static int a(sw $$0) {
      $$0.f().a_(null, $$0.d()).stream().forEach($$0x -> $$0x.a(bsq.c.b));
      $$0.e().c($$0.f());
      tm.a($$0.d(), $$0.f());
      a($$0.f(), "Reset succeded for: " + $$0.b(), n.k);
      return 1;
   }

   static Stream<sw> a(et $$0, tj $$1, tk $$2) {
      return $$2.findStructureBlockPos().map($$2x -> a($$2x, $$0.e(), $$1)).flatMap(Optional::stream);
   }

   static Stream<sw> a(et $$0, tj $$1, ts $$2, int $$3) {
      return $$2.findTestFunctions().filter($$1x -> a($$0.e(), $$1x.d())).map($$3x -> new sw($$3x, tm.a($$3), $$0.e(), $$1));
   }

   private static Optional<sw> a(jd $$0, aqt $$1, tj $$2) {
      drv $$3 = (drv)$$1.c_($$0);
      if ($$3 == null) {
         a($$1, "Structure block entity could not be found", n.m);
         return Optional.empty();
      } else {
         String $$4 = $$3.u();
         Optional<tq> $$5 = sy.e($$4);
         if ($$5.isEmpty()) {
            a($$1, "Test function for test " + $$4 + " could not be found", n.m);
            return Optional.empty();
         } else {
            tq $$6 = $$5.get();
            sw $$7 = new sw($$6, $$3.l(), $$1, $$2);
            $$7.a($$0);
            return !a($$1, $$7.s()) ? Optional.empty() : Optional.of($$7);
         }
      }
   }

   private static int a(et $$0, String $$1, int $$2, int $$3, int $$4) {
      if ($$2 <= 48 && $$3 <= 48 && $$4 <= 48) {
         aqt $$5 = $$0.e();
         jd $$6 = a($$0).d();
         tm.a($$1.toLowerCase(), $$6, new kh($$2, $$3, $$4), dmk.a, $$5);
         jd $$7 = $$6.c();
         jd $$8 = $$7.b($$2 - 1, 0, $$4 - 1);
         jd.d($$7, $$8).forEach($$1x -> $$5.b($$1x, dfy.F.o()));
         tm.a($$6, new jd(1, 0, -1), dmk.a, $$5);
         return 0;
      } else {
         throw new IllegalArgumentException("The structure must be less than 48 blocks big in each axis");
      }
   }

   private static int a(et $$0, String $$1) throws CommandSyntaxException {
      ews $$2 = (ews)$$0.h().a(10.0, 1.0F, false);
      jd $$3 = $$2.a();
      aqt $$4 = $$0.e();
      Optional<jd> $$5 = tm.a($$3, 15, $$4);
      if ($$5.isEmpty()) {
         $$5 = tm.a($$3, 200, $$4);
      }

      if ($$5.isEmpty()) {
         $$0.b(wy.b("Can't find a structure block that contains the targeted pos " + $$3));
         return 0;
      } else {
         drv $$6 = (drv)$$4.c_($$5.get());
         if ($$6 == null) {
            a($$4, "Structure block entity could not be found", n.m);
            return 0;
         } else {
            jd $$7 = $$3.b($$5.get());
            String $$8 = $$7.u() + ", " + $$7.v() + ", " + $$7.w();
            String $$9 = $$6.u();
            wy $$10 = wy.b($$8)
               .b(
                  xv.a
                     .a(true)
                     .a(n.k)
                     .a(new xe(xe.a.a, wy.b("Click to copy to clipboard")))
                     .a(new ww(ww.a.f, "final BlockPos " + $$1 + " = new BlockPos(" + $$8 + ");"))
               );
            $$0.a(() -> wy.b("Position relative to " + $$9 + ": ").b($$10), false);
            age.a($$4, new jd($$3), $$8, -2147418368, 10000);
            return 1;
         }
      }
   }

   static int a() {
      tc.a.a();
      return 1;
   }

   static int a(et $$0, aqt $$1, sz $$2) {
      $$2.a(new to.b($$0));
      th $$3 = new th($$2.a());
      $$3.a(new to.c($$1, $$3));
      $$3.a($$0x -> sy.a($$0x.u()));
      $$2.b();
      return 1;
   }

   static int a(et $$0, drv $$1) {
      String $$2 = $$1.c();
      if (!$$1.b(true)) {
         c($$0, "Failed to save structure " + $$2);
      }

      return b($$0, $$2);
   }

   private static int b(et $$0, String $$1) {
      Path $$2 = Paths.get(tm.c);
      akq $$3 = akq.a($$1);
      Path $$4 = $$0.e().q().a($$3, ".nbt");
      Path $$5 = pe.a(ly.a, $$4, $$3.a(), $$2);
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

   private static boolean a(aqt $$0, String $$1) {
      if ($$0.q().b(akq.a($$1)).isEmpty()) {
         a($$0, "Test structure " + $$1 + " could not be found", n.m);
         return false;
      } else {
         return true;
      }
   }

   static jd a(et $$0) {
      jd $$1 = jd.a((jw)$$0.d());
      int $$2 = $$0.e().a(dyv.a.b, $$1).v();
      return new jd($$1.u(), $$2 + 1, $$1.w() + 3);
   }

   static void c(et $$0, String $$1) {
      $$0.a(() -> wy.b($$1), false);
   }

   private static int d(et $$0, String $$1) {
      Path $$2 = Paths.get(tm.c, $$1 + ".snbt");
      akq $$3 = akq.b($$1);
      Path $$4 = $$0.e().q().a($$3, ".nbt");

      try {
         BufferedReader $$5 = Files.newBufferedReader($$2);
         String $$6 = IOUtils.toString($$5);
         Files.createDirectories($$4.getParent());

         try (OutputStream $$7 = Files.newOutputStream($$4)) {
            un.a(up.a($$6), $$7);
         }

         $$0.e().q().d($$3);
         c($$0, "Imported to " + $$4.toAbsolutePath());
         return 0;
      } catch (CommandSyntaxException | IOException var12) {
         c.error("Failed to load structure {}", $$1, var12);
         return 1;
      }
   }

   static void a(aqt $$0, String $$1, n $$2) {
      $$0.a($$0x -> true).forEach($$2x -> $$2x.a(wy.b($$1).a($$2)));
   }

   public static class a {
      private final tp<to.a> a;

      public a(tp<to.a> $$0) {
         this.a = $$0;
      }

      public int a() {
         to.a();
         return to.a(this.a.a(), tj.a(), this.a).map(to::a).toList().isEmpty() ? 0 : 1;
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
         to.a();
         et $$0 = this.a.a();
         aqt $$1 = $$0.e();
         sz.a($$1);
         this.a(this.a.findStructureBlockPos(), $$1x -> {
            drv $$2 = (drv)$$1.c_($$1x);
            if ($$2 == null) {
               return 0;
            } else {
               eje $$3 = tm.b($$2);
               tm.a($$3, $$1);
               return 1;
            }
         }, () -> to.a($$1, "Could not find any structures to clear", n.m), $$1x -> to.c($$0, "Cleared " + $$1x + " structures"));
         return 1;
      }

      public int c() {
         MutableBoolean $$0 = new MutableBoolean(true);
         et $$1 = this.a.a();
         aqt $$2 = $$1.e();
         this.a(this.a.findStructureBlockPos(), $$3 -> {
            drv $$4 = (drv)$$2.c_($$3);
            if ($$4 == null) {
               to.a($$2, "Structure block entity could not be found", n.m);
               $$0.setFalse();
               return 0;
            } else {
               if (to.a($$1, $$4) != 0) {
                  $$0.setFalse();
               }

               return 1;
            }
         }, () -> to.a($$2, "Could not find any structures to export", n.m), $$1x -> to.c($$1, "Exported " + $$1x + " structures"));
         return $$0.getValue() ? 0 : 1;
      }

      public int a(tj $$0, int $$1, int $$2) {
         to.a();
         et $$3 = this.a.a();
         aqt $$4 = $$3.e();
         jd $$5 = to.a($$3);
         Collection<sw> $$6 = Stream.concat(to.a($$3, $$0, this.a), to.a($$3, $$0, this.a, $$1)).toList();
         if ($$6.isEmpty()) {
            to.c($$3, "No tests found");
            return 0;
         } else {
            sz.a($$4);
            sy.d();
            to.c($$3, "Running " + $$6.size() + " tests...");
            sz $$7 = sz.a.b($$6, $$4).a(new tl($$5, $$2)).a();
            return to.a($$3, $$4, $$7);
         }
      }

      public int a(int $$0, int $$1) {
         return this.a(tj.a(), $$0, $$1);
      }

      public int a(int $$0) {
         return this.a(tj.a(), $$0, 8);
      }

      public int a(tj $$0, int $$1) {
         return this.a($$0, $$1, 8);
      }

      public int a(tj $$0) {
         return this.a($$0, 0, 8);
      }

      public int d() {
         return this.a(tj.a());
      }

      public int e() {
         to.c(this.a.a(), "Started locating test structures, this might take a while..");
         MutableInt $$0 = new MutableInt(0);
         jd $$1 = jd.a((jw)this.a.a().d());
         this.a
            .findStructureBlockPos()
            .forEach(
               $$2x -> {
                  drv $$3 = (drv)this.a.a().e().c_($$2x);
                  if ($$3 != null) {
                     ji $$4 = $$3.l().a(ji.c);
                     jd $$5 = $$3.az_().a($$4, 2);
                     int $$6 = (int)$$4.g().p();
                     String $$7 = String.format("/tp @s %d %d %d %d 0", $$5.u(), $$5.v(), $$5.w(), $$6);
                     int $$8 = $$1.u() - $$2x.u();
                     int $$9 = $$1.w() - $$2x.w();
                     int $$10 = ayn.d(ayn.c((float)($$8 * $$8 + $$9 * $$9)));
                     wy $$11 = xb.a((wy)wy.a("chat.coordinates", $$2x.u(), $$2x.v(), $$2x.w()))
                        .a($$1xx -> $$1xx.a(n.k).a(new ww(ww.a.d, $$7)).a(new xe(xe.a.a, wy.c("chat.coordinates.tooltip"))));
                     wy $$12 = wy.b("Found structure at: ").b($$11).f(" (distance: " + $$10 + ")");
                     this.a.a().a(() -> $$12, false);
                     $$0.increment();
                  }
               }
            );
         int $$2 = $$0.intValue();
         if ($$2 == 0) {
            to.a(this.a.a().e(), "No such test structure found", n.m);
            return 0;
         } else {
            to.a(this.a.a().e(), "Finished locating, found " + $$2 + " structure(s)", n.k);
            return 1;
         }
      }
   }

   static record b(et a) implements ss {
      @Override
      public void a(sq $$0) {
         to.c(this.a, "Starting batch: " + $$0.a());
      }

      @Override
      public void b(sq $$0) {
      }
   }

   public static record c(aqt a, th b) implements sx {
      @Override
      public void a(sw $$0) {
      }

      @Override
      public void a(sw $$0, sz $$1) {
         a(this.a, this.b);
      }

      @Override
      public void b(sw $$0, sz $$1) {
         a(this.a, this.b);
      }

      @Override
      public void a(sw $$0, sw $$1, sz $$2) {
         this.b.a($$1);
      }

      private static void a(aqt $$0, th $$1) {
         if ($$1.i()) {
            to.a($$0, "GameTest done! " + $$1.h() + " tests were run", n.p);
            if ($$1.d()) {
               to.a($$0, $$1.a() + " required tests failed :(", n.m);
            } else {
               to.a($$0, "All required tests passed :)", n.k);
            }

            if ($$1.e()) {
               to.a($$0, $$1.b() + " optional tests failed", n.h);
            }
         }
      }
   }
}
