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

public class ug {
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
   private static final uh.a<ug.a> l = new uh.a<>(ug.a::new);

   private static ArgumentBuilder<ep, ?> a(
      ArgumentBuilder<ep, ?> $$0, Function<CommandContext<ep>, ug.a> $$1, Function<ArgumentBuilder<ep, ?>, ArgumentBuilder<ep, ?>> $$2
   ) {
      return $$0.executes($$1x -> $$1.apply($$1x).d())
         .then(
            ((RequiredArgumentBuilder)eq.a("numberOfTimes", IntegerArgumentType.integer(0))
                  .executes($$1x -> $$1.apply($$1x).a(new ub(IntegerArgumentType.getInteger($$1x, "numberOfTimes"), false))))
               .then(
                  $$2.apply(
                     eq.a("untilFailed", BoolArgumentType.bool())
                        .executes(
                           $$1x -> $$1.apply($$1x)
                                 .a(new ub(IntegerArgumentType.getInteger($$1x, "numberOfTimes"), BoolArgumentType.getBool($$1x, "untilFailed")))
                        )
                  )
               )
         );
   }

   private static ArgumentBuilder<ep, ?> a(ArgumentBuilder<ep, ?> $$0, Function<CommandContext<ep>, ug.a> $$1) {
      return a($$0, $$1, $$0x -> $$0x);
   }

   private static ArgumentBuilder<ep, ?> b(ArgumentBuilder<ep, ?> $$0, Function<CommandContext<ep>, ug.a> $$1) {
      return a(
         $$0,
         $$1,
         $$1x -> $$1x.then(
               ((RequiredArgumentBuilder)eq.a("rotationSteps", IntegerArgumentType.integer())
                     .executes(
                        $$1xx -> $$1.apply($$1xx)
                              .a(
                                 new ub(IntegerArgumentType.getInteger($$1xx, "numberOfTimes"), BoolArgumentType.getBool($$1xx, "untilFailed")),
                                 IntegerArgumentType.getInteger($$1xx, "rotationSteps")
                              )
                     ))
                  .then(
                     eq.a("testsPerRow", IntegerArgumentType.integer())
                        .executes(
                           $$1xx -> $$1.apply($$1xx)
                                 .a(
                                    new ub(IntegerArgumentType.getInteger($$1xx, "numberOfTimes"), BoolArgumentType.getBool($$1xx, "untilFailed")),
                                    IntegerArgumentType.getInteger($$1xx, "rotationSteps"),
                                    IntegerArgumentType.getInteger($$1xx, "testsPerRow")
                                 )
                        )
                  )
            )
      );
   }

   public static void a(CommandDispatcher<ep> $$0) {
      ArgumentBuilder<ep, ?> $$1 = b(eq.a("onlyRequiredTests", BoolArgumentType.bool()), $$0x -> l.a($$0x, BoolArgumentType.getBool($$0x, "onlyRequiredTests")));
      ArgumentBuilder<ep, ?> $$2 = b(eq.a("testClassName", uf.a()), $$0x -> l.a($$0x, uf.a($$0x, "testClassName")));
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)eq.a(
                                                                              "test"
                                                                           )
                                                                           .then(eq.a("run").then(b(eq.a("testName", uj.a()), $$0x -> l.b($$0x, "testName")))))
                                                                        .then(
                                                                           eq.a("runmultiple")
                                                                              .then(
                                                                                 ((RequiredArgumentBuilder)eq.a("testName", uj.a())
                                                                                       .executes($$0x -> l.b($$0x, "testName").d()))
                                                                                    .then(
                                                                                       eq.a("amount", IntegerArgumentType.integer())
                                                                                          .executes(
                                                                                             $$0x -> l.a(IntegerArgumentType.getInteger($$0x, "amount"))
                                                                                                   .b($$0x, "testName")
                                                                                                   .d()
                                                                                          )
                                                                                    )
                                                                              )
                                                                        ))
                                                                     .then(b(eq.a("runall").then($$2), l::d)))
                                                                  .then(a(eq.a("runthese"), l::b)))
                                                               .then(a(eq.a("runclosest"), l::a)))
                                                            .then(a(eq.a("runthat"), l::c)))
                                                         .then(b(eq.a("runfailed").then($$1), l::e)))
                                                      .then(
                                                         eq.a("locate")
                                                            .then(
                                                               eq.a("testName", uj.a())
                                                                  .executes($$0x -> l.c($$0x, "minecraft:" + uj.a($$0x, "testName").d()).e())
                                                            )
                                                      ))
                                                   .then(eq.a("resetclosest").executes($$0x -> l.a($$0x).a())))
                                                .then(eq.a("resetthese").executes($$0x -> l.b($$0x).a())))
                                             .then(eq.a("resetthat").executes($$0x -> l.c($$0x).a())))
                                          .then(
                                             eq.a("export")
                                                .then(
                                                   eq.a("testName", StringArgumentType.word())
                                                      .executes($$0x -> b((ep)$$0x.getSource(), "minecraft:" + StringArgumentType.getString($$0x, "testName")))
                                                )
                                          ))
                                       .then(eq.a("exportclosest").executes($$0x -> l.a($$0x).c())))
                                    .then(eq.a("exportthese").executes($$0x -> l.b($$0x).c())))
                                 .then(eq.a("exportthat").executes($$0x -> l.c($$0x).c())))
                              .then(eq.a("clearthat").executes($$0x -> l.c($$0x).b())))
                           .then(eq.a("clearthese").executes($$0x -> l.b($$0x).b())))
                        .then(
                           ((LiteralArgumentBuilder)eq.a("clearall").executes($$0x -> l.a($$0x, 200).b()))
                              .then(
                                 eq.a("radius", IntegerArgumentType.integer())
                                    .executes($$0x -> l.a($$0x, ayz.a(IntegerArgumentType.getInteger($$0x, "radius"), 0, 1024)).b())
                              )
                        ))
                     .then(
                        eq.a("import")
                           .then(
                              eq.a("testName", StringArgumentType.word())
                                 .executes($$0x -> d((ep)$$0x.getSource(), StringArgumentType.getString($$0x, "testName")))
                           )
                     ))
                  .then(eq.a("stop").executes($$0x -> a())))
               .then(
                  ((LiteralArgumentBuilder)eq.a("pos").executes($$0x -> a((ep)$$0x.getSource(), "pos")))
                     .then(eq.a("var", StringArgumentType.word()).executes($$0x -> a((ep)$$0x.getSource(), StringArgumentType.getString($$0x, "var"))))
               ))
            .then(
               eq.a("create")
                  .then(
                     ((RequiredArgumentBuilder)eq.a("testName", StringArgumentType.word())
                           .suggests(uj::a)
                           .executes($$0x -> a((ep)$$0x.getSource(), StringArgumentType.getString($$0x, "testName"), 5, 5, 5)))
                        .then(
                           ((RequiredArgumentBuilder)eq.a("width", IntegerArgumentType.integer())
                                 .executes(
                                    $$0x -> a(
                                          (ep)$$0x.getSource(),
                                          StringArgumentType.getString($$0x, "testName"),
                                          IntegerArgumentType.getInteger($$0x, "width"),
                                          IntegerArgumentType.getInteger($$0x, "width"),
                                          IntegerArgumentType.getInteger($$0x, "width")
                                       )
                                 ))
                              .then(
                                 eq.a("height", IntegerArgumentType.integer())
                                    .then(
                                       eq.a("depth", IntegerArgumentType.integer())
                                          .executes(
                                             $$0x -> a(
                                                   (ep)$$0x.getSource(),
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

   private static int a(to $$0) {
      $$0.f().a_(null, $$0.d()).stream().forEach($$0x -> $$0x.a(bsv.c.b));
      $$0.e().c($$0.f());
      ue.a($$0.d(), $$0.f());
      a($$0.f(), "Reset succeded for: " + $$0.b(), n.k);
      return 1;
   }

   static Stream<to> a(ep $$0, ub $$1, uc $$2) {
      return $$2.findStructureBlockPos().map($$2x -> a($$2x, $$0.e(), $$1)).flatMap(Optional::stream);
   }

   static Stream<to> a(ep $$0, ub $$1, uk $$2, int $$3) {
      return $$2.findTestFunctions().filter($$1x -> a($$0.e(), $$1x.d())).map($$3x -> new to($$3x, ue.a($$3), $$0.e(), $$1));
   }

   private static Optional<to> a(iz $$0, arf $$1, ub $$2) {
      dqx $$3 = (dqx)$$1.c_($$0);
      if ($$3 == null) {
         a($$1, "Structure block entity could not be found", n.m);
         return Optional.empty();
      } else {
         String $$4 = $$3.u();
         Optional<ui> $$5 = tq.e($$4);
         if ($$5.isEmpty()) {
            a($$1, "Test function for test " + $$4 + " could not be found", n.m);
            return Optional.empty();
         } else {
            ui $$6 = $$5.get();
            to $$7 = new to($$6, $$3.l(), $$1, $$2);
            $$7.a($$0);
            return !a($$1, $$7.s()) ? Optional.empty() : Optional.of($$7);
         }
      }
   }

   private static int a(ep $$0, String $$1, int $$2, int $$3, int $$4) {
      if ($$2 <= 48 && $$3 <= 48 && $$4 <= 48) {
         arf $$5 = $$0.e();
         iz $$6 = a($$0).d();
         ue.a($$1.toLowerCase(), $$6, new kd($$2, $$3, $$4), dln.a, $$5);
         iz $$7 = $$6.c();
         iz $$8 = $$7.b($$2 - 1, 0, $$4 - 1);
         iz.d($$7, $$8).forEach($$1x -> $$5.b($$1x, dfc.F.o()));
         ue.a($$6, new iz(1, 0, -1), dln.a, $$5);
         return 0;
      } else {
         throw new IllegalArgumentException("The structure must be less than 48 blocks big in each axis");
      }
   }

   private static int a(ep $$0, String $$1) throws CommandSyntaxException {
      evo $$2 = (evo)$$0.h().a(10.0, 1.0F, false);
      iz $$3 = $$2.a();
      arf $$4 = $$0.e();
      Optional<iz> $$5 = ue.a($$3, 15, $$4);
      if ($$5.isEmpty()) {
         $$5 = ue.a($$3, 200, $$4);
      }

      if ($$5.isEmpty()) {
         $$0.b(xp.b("Can't find a structure block that contains the targeted pos " + $$3));
         return 0;
      } else {
         dqx $$6 = (dqx)$$4.c_($$5.get());
         if ($$6 == null) {
            a($$4, "Structure block entity could not be found", n.m);
            return 0;
         } else {
            iz $$7 = $$3.b($$5.get());
            String $$8 = $$7.u() + ", " + $$7.v() + ", " + $$7.w();
            String $$9 = $$6.u();
            xp $$10 = xp.b($$8)
               .b(
                  ym.a
                     .a(true)
                     .a(n.k)
                     .a(new xv(xv.a.a, xp.b("Click to copy to clipboard")))
                     .a(new xn(xn.a.f, "final BlockPos " + $$1 + " = new BlockPos(" + $$8 + ");"))
               );
            $$0.a(() -> xp.b("Position relative to " + $$9 + ": ").b($$10), false);
            agt.a($$4, new iz($$3), $$8, -2147418368, 10000);
            return 1;
         }
      }
   }

   static int a() {
      tu.a.a();
      return 1;
   }

   static int a(ep $$0, arf $$1, tr $$2) {
      $$2.a(new ug.b($$0));
      tz $$3 = new tz($$2.a());
      $$3.a(new ug.c($$1, $$3));
      $$3.a($$0x -> tq.a($$0x.u()));
      $$2.b();
      return 1;
   }

   static int a(ep $$0, dqx $$1) {
      String $$2 = $$1.c();
      if (!$$1.b(true)) {
         c($$0, "Failed to save structure " + $$2);
      }

      return b($$0, $$2);
   }

   private static int b(ep $$0, String $$1) {
      Path $$2 = Paths.get(ue.c);
      alf $$3 = new alf($$1);
      Path $$4 = $$0.e().q().a($$3, ".nbt");
      Path $$5 = pj.a(lu.a, $$4, $$3.a(), $$2);
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

   private static boolean a(arf $$0, String $$1) {
      if ($$0.q().b(new alf($$1)).isEmpty()) {
         a($$0, "Test structure " + $$1 + " could not be found", n.m);
         return false;
      } else {
         return true;
      }
   }

   static iz a(ep $$0) {
      iz $$1 = iz.a($$0.d());
      int $$2 = $$0.e().a(dxv.a.b, $$1).v();
      return new iz($$1.u(), $$2 + 1, $$1.w() + 3);
   }

   static void c(ep $$0, String $$1) {
      $$0.a(() -> xp.b($$1), false);
   }

   private static int d(ep $$0, String $$1) {
      Path $$2 = Paths.get(ue.c, $$1 + ".snbt");
      alf $$3 = new alf("minecraft", $$1);
      Path $$4 = $$0.e().q().a($$3, ".nbt");

      try {
         BufferedReader $$5 = Files.newBufferedReader($$2);
         String $$6 = IOUtils.toString($$5);
         Files.createDirectories($$4.getParent());

         try (OutputStream $$7 = Files.newOutputStream($$4)) {
            vf.a(vh.a($$6), $$7);
         }

         $$0.e().q().d($$3);
         c($$0, "Imported to " + $$4.toAbsolutePath());
         return 0;
      } catch (CommandSyntaxException | IOException var12) {
         c.error("Failed to load structure {}", $$1, var12);
         return 1;
      }
   }

   static void a(arf $$0, String $$1, n $$2) {
      $$0.a($$0x -> true).forEach($$2x -> $$2x.a(xp.b($$1).a($$2)));
   }

   public static class a {
      private final uh<ug.a> a;

      public a(uh<ug.a> $$0) {
         this.a = $$0;
      }

      public int a() {
         ug.a();
         return ug.a(this.a.a(), ub.a(), this.a).map(ug::a).toList().isEmpty() ? 0 : 1;
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
         ug.a();
         ep $$0 = this.a.a();
         arf $$1 = $$0.e();
         tr.a($$1);
         this.a(this.a.findStructureBlockPos(), $$1x -> {
            dqx $$2 = (dqx)$$1.c_($$1x);
            if ($$2 == null) {
               return 0;
            } else {
               eid $$3 = ue.b($$2);
               ue.a($$3, $$1);
               return 1;
            }
         }, () -> ug.a($$1, "Could not find any structures to clear", n.m), $$1x -> ug.c($$0, "Cleared " + $$1x + " structures"));
         return 1;
      }

      public int c() {
         MutableBoolean $$0 = new MutableBoolean(true);
         ep $$1 = this.a.a();
         arf $$2 = $$1.e();
         this.a(this.a.findStructureBlockPos(), $$3 -> {
            dqx $$4 = (dqx)$$2.c_($$3);
            if ($$4 == null) {
               ug.a($$2, "Structure block entity could not be found", n.m);
               $$0.setFalse();
               return 0;
            } else {
               if (ug.a($$1, $$4) != 0) {
                  $$0.setFalse();
               }

               return 1;
            }
         }, () -> ug.a($$2, "Could not find any structures to export", n.m), $$1x -> ug.c($$1, "Exported " + $$1x + " structures"));
         return $$0.getValue() ? 0 : 1;
      }

      public int a(ub $$0, int $$1, int $$2) {
         ug.a();
         ep $$3 = this.a.a();
         arf $$4 = $$3.e();
         iz $$5 = ug.a($$3);
         Collection<to> $$6 = Stream.concat(ug.a($$3, $$0, this.a), ug.a($$3, $$0, this.a, $$1)).toList();
         if ($$6.isEmpty()) {
            ug.c($$3, "No tests found");
            return 0;
         } else {
            tr.a($$4);
            tq.d();
            ug.c($$3, "Running " + $$6.size() + " tests...");
            tr $$7 = tr.a.b($$6, $$4).a(new ud($$5, $$2)).a();
            return ug.a($$3, $$4, $$7);
         }
      }

      public int a(int $$0, int $$1) {
         return this.a(ub.a(), $$0, $$1);
      }

      public int a(int $$0) {
         return this.a(ub.a(), $$0, 8);
      }

      public int a(ub $$0, int $$1) {
         return this.a($$0, $$1, 8);
      }

      public int a(ub $$0) {
         return this.a($$0, 0, 8);
      }

      public int d() {
         return this.a(ub.a());
      }

      public int e() {
         ug.c(this.a.a(), "Started locating test structures, this might take a while..");
         MutableInt $$0 = new MutableInt(0);
         iz $$1 = iz.a(this.a.a().d());
         this.a
            .findStructureBlockPos()
            .forEach(
               $$2x -> {
                  dqx $$3 = (dqx)this.a.a().e().c_($$2x);
                  if ($$3 != null) {
                     je $$4 = $$3.l().a(je.c);
                     iz $$5 = $$3.ay_().a($$4, 2);
                     int $$6 = (int)$$4.g().p();
                     String $$7 = String.format("/tp @s %d %d %d %d 0", $$5.u(), $$5.v(), $$5.w(), $$6);
                     int $$8 = $$1.u() - $$2x.u();
                     int $$9 = $$1.w() - $$2x.w();
                     int $$10 = ayz.d(ayz.c((float)($$8 * $$8 + $$9 * $$9)));
                     xp $$11 = xs.a((xp)xp.a("chat.coordinates", $$2x.u(), $$2x.v(), $$2x.w()))
                        .a($$1xx -> $$1xx.a(n.k).a(new xn(xn.a.d, $$7)).a(new xv(xv.a.a, xp.c("chat.coordinates.tooltip"))));
                     xp $$12 = xp.b("Found structure at: ").b($$11).f(" (distance: " + $$10 + ")");
                     this.a.a().a(() -> $$12, false);
                     $$0.increment();
                  }
               }
            );
         int $$2 = $$0.intValue();
         if ($$2 == 0) {
            ug.a(this.a.a().e(), "No such test structure found", n.m);
            return 0;
         } else {
            ug.a(this.a.a().e(), "Finished locating, found " + $$2 + " structure(s)", n.k);
            return 1;
         }
      }
   }

   static record b(ep a) implements tk {
      @Override
      public void a(ti $$0) {
         ug.c(this.a, "Starting batch: " + $$0.a());
      }

      @Override
      public void b(ti $$0) {
      }
   }

   public static record c(arf a, tz b) implements tp {
      @Override
      public void a(to $$0) {
      }

      @Override
      public void a(to $$0, tr $$1) {
         a(this.a, this.b);
      }

      @Override
      public void b(to $$0, tr $$1) {
         a(this.a, this.b);
      }

      @Override
      public void a(to $$0, to $$1, tr $$2) {
         this.b.a($$1);
      }

      private static void a(arf $$0, tz $$1) {
         if ($$1.i()) {
            ug.a($$0, "GameTest done! " + $$1.h() + " tests were run", n.p);
            if ($$1.d()) {
               ug.a($$0, $$1.a() + " required tests failed :(", n.m);
            } else {
               ug.a($$0, "All required tests passed :)", n.k);
            }

            if ($$1.e()) {
               ug.a($$0, $$1.b() + " optional tests failed", n.h);
            }
         }
      }
   }
}
