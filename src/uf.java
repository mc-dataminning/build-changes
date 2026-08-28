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

public class uf {
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
   private static final ug.a<uf.a> l = new ug.a<>(uf.a::new);

   private static ArgumentBuilder<ep, ?> a(
      ArgumentBuilder<ep, ?> $$0, Function<CommandContext<ep>, uf.a> $$1, Function<ArgumentBuilder<ep, ?>, ArgumentBuilder<ep, ?>> $$2
   ) {
      return $$0.executes($$1x -> $$1.apply($$1x).d())
         .then(
            ((RequiredArgumentBuilder)eq.a("numberOfTimes", IntegerArgumentType.integer(0))
                  .executes($$1x -> $$1.apply($$1x).a(new ua(IntegerArgumentType.getInteger($$1x, "numberOfTimes"), false))))
               .then(
                  $$2.apply(
                     eq.a("untilFailed", BoolArgumentType.bool())
                        .executes(
                           $$1x -> $$1.apply($$1x)
                                 .a(new ua(IntegerArgumentType.getInteger($$1x, "numberOfTimes"), BoolArgumentType.getBool($$1x, "untilFailed")))
                        )
                  )
               )
         );
   }

   private static ArgumentBuilder<ep, ?> a(ArgumentBuilder<ep, ?> $$0, Function<CommandContext<ep>, uf.a> $$1) {
      return a($$0, $$1, $$0x -> $$0x);
   }

   private static ArgumentBuilder<ep, ?> b(ArgumentBuilder<ep, ?> $$0, Function<CommandContext<ep>, uf.a> $$1) {
      return a(
         $$0,
         $$1,
         $$1x -> $$1x.then(
               ((RequiredArgumentBuilder)eq.a("rotationSteps", IntegerArgumentType.integer())
                     .executes(
                        $$1xx -> $$1.apply($$1xx)
                              .a(
                                 new ua(IntegerArgumentType.getInteger($$1xx, "numberOfTimes"), BoolArgumentType.getBool($$1xx, "untilFailed")),
                                 IntegerArgumentType.getInteger($$1xx, "rotationSteps")
                              )
                     ))
                  .then(
                     eq.a("testsPerRow", IntegerArgumentType.integer())
                        .executes(
                           $$1xx -> $$1.apply($$1xx)
                                 .a(
                                    new ua(IntegerArgumentType.getInteger($$1xx, "numberOfTimes"), BoolArgumentType.getBool($$1xx, "untilFailed")),
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
      ArgumentBuilder<ep, ?> $$2 = b(eq.a("testClassName", ue.a()), $$0x -> l.a($$0x, ue.a($$0x, "testClassName")));
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)eq.a(
                                                                              "test"
                                                                           )
                                                                           .then(eq.a("run").then(b(eq.a("testName", ui.a()), $$0x -> l.b($$0x, "testName")))))
                                                                        .then(
                                                                           eq.a("runmultiple")
                                                                              .then(
                                                                                 ((RequiredArgumentBuilder)eq.a("testName", ui.a())
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
                                                               eq.a("testName", ui.a())
                                                                  .executes($$0x -> l.c($$0x, "minecraft:" + ui.a($$0x, "testName").d()).e())
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
                                    .executes($$0x -> l.a($$0x, ayy.a(IntegerArgumentType.getInteger($$0x, "radius"), 0, 1024)).b())
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
                           .suggests(ui::a)
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

   private static int a(tn $$0) {
      $$0.f().a_(null, $$0.d()).stream().forEach($$0x -> $$0x.a(bst.c.b));
      $$0.e().c($$0.f());
      ud.a($$0.d(), $$0.f());
      a($$0.f(), "Reset succeded for: " + $$0.b(), n.k);
      return 1;
   }

   static Stream<tn> a(ep $$0, ua $$1, ub $$2) {
      return $$2.findStructureBlockPos().map($$2x -> a($$2x, $$0.e(), $$1)).flatMap(Optional::stream);
   }

   static Stream<tn> a(ep $$0, ua $$1, uj $$2, int $$3) {
      return $$2.findTestFunctions().filter($$1x -> a($$0.e(), $$1x.d())).map($$3x -> new tn($$3x, ud.a($$3), $$0.e(), $$1));
   }

   private static Optional<tn> a(iz $$0, are $$1, ua $$2) {
      dqv $$3 = (dqv)$$1.c_($$0);
      if ($$3 == null) {
         a($$1, "Structure block entity could not be found", n.m);
         return Optional.empty();
      } else {
         String $$4 = $$3.u();
         Optional<uh> $$5 = tp.e($$4);
         if ($$5.isEmpty()) {
            a($$1, "Test function for test " + $$4 + " could not be found", n.m);
            return Optional.empty();
         } else {
            uh $$6 = $$5.get();
            tn $$7 = new tn($$6, $$3.l(), $$1, $$2);
            $$7.a($$0);
            return !a($$1, $$7.s()) ? Optional.empty() : Optional.of($$7);
         }
      }
   }

   private static int a(ep $$0, String $$1, int $$2, int $$3, int $$4) {
      if ($$2 <= 48 && $$3 <= 48 && $$4 <= 48) {
         are $$5 = $$0.e();
         iz $$6 = a($$0).d();
         ud.a($$1.toLowerCase(), $$6, new kd($$2, $$3, $$4), dll.a, $$5);
         iz $$7 = $$6.c();
         iz $$8 = $$7.b($$2 - 1, 0, $$4 - 1);
         iz.d($$7, $$8).forEach($$1x -> $$5.b($$1x, dfa.F.o()));
         ud.a($$6, new iz(1, 0, -1), dll.a, $$5);
         return 0;
      } else {
         throw new IllegalArgumentException("The structure must be less than 48 blocks big in each axis");
      }
   }

   private static int a(ep $$0, String $$1) throws CommandSyntaxException {
      evm $$2 = (evm)$$0.h().a(10.0, 1.0F, false);
      iz $$3 = $$2.a();
      are $$4 = $$0.e();
      Optional<iz> $$5 = ud.a($$3, 15, $$4);
      if ($$5.isEmpty()) {
         $$5 = ud.a($$3, 200, $$4);
      }

      if ($$5.isEmpty()) {
         $$0.b(xo.b("Can't find a structure block that contains the targeted pos " + $$3));
         return 0;
      } else {
         dqv $$6 = (dqv)$$4.c_($$5.get());
         if ($$6 == null) {
            a($$4, "Structure block entity could not be found", n.m);
            return 0;
         } else {
            iz $$7 = $$3.b($$5.get());
            String $$8 = $$7.u() + ", " + $$7.v() + ", " + $$7.w();
            String $$9 = $$6.u();
            xo $$10 = xo.b($$8)
               .b(
                  yl.a
                     .a(true)
                     .a(n.k)
                     .a(new xu(xu.a.a, xo.b("Click to copy to clipboard")))
                     .a(new xm(xm.a.f, "final BlockPos " + $$1 + " = new BlockPos(" + $$8 + ");"))
               );
            $$0.a(() -> xo.b("Position relative to " + $$9 + ": ").b($$10), false);
            ags.a($$4, new iz($$3), $$8, -2147418368, 10000);
            return 1;
         }
      }
   }

   static int a() {
      tt.a.a();
      return 1;
   }

   static int a(ep $$0, are $$1, tq $$2) {
      $$2.a(new uf.b($$0));
      ty $$3 = new ty($$2.a());
      $$3.a(new uf.c($$1, $$3));
      $$3.a($$0x -> tp.a($$0x.u()));
      $$2.b();
      return 1;
   }

   static int a(ep $$0, dqv $$1) {
      String $$2 = $$1.c();
      if (!$$1.b(true)) {
         c($$0, "Failed to save structure " + $$2);
      }

      return b($$0, $$2);
   }

   private static int b(ep $$0, String $$1) {
      Path $$2 = Paths.get(ud.c);
      ale $$3 = new ale($$1);
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

   private static boolean a(are $$0, String $$1) {
      if ($$0.q().b(new ale($$1)).isEmpty()) {
         a($$0, "Test structure " + $$1 + " could not be found", n.m);
         return false;
      } else {
         return true;
      }
   }

   static iz a(ep $$0) {
      iz $$1 = iz.a($$0.d());
      int $$2 = $$0.e().a(dxt.a.b, $$1).v();
      return new iz($$1.u(), $$2 + 1, $$1.w() + 3);
   }

   static void c(ep $$0, String $$1) {
      $$0.a(() -> xo.b($$1), false);
   }

   private static int d(ep $$0, String $$1) {
      Path $$2 = Paths.get(ud.c, $$1 + ".snbt");
      ale $$3 = new ale("minecraft", $$1);
      Path $$4 = $$0.e().q().a($$3, ".nbt");

      try {
         BufferedReader $$5 = Files.newBufferedReader($$2);
         String $$6 = IOUtils.toString($$5);
         Files.createDirectories($$4.getParent());

         try (OutputStream $$7 = Files.newOutputStream($$4)) {
            ve.a(vg.a($$6), $$7);
         }

         $$0.e().q().d($$3);
         c($$0, "Imported to " + $$4.toAbsolutePath());
         return 0;
      } catch (CommandSyntaxException | IOException var12) {
         c.error("Failed to load structure {}", $$1, var12);
         return 1;
      }
   }

   static void a(are $$0, String $$1, n $$2) {
      $$0.a($$0x -> true).forEach($$2x -> $$2x.a(xo.b($$1).a($$2)));
   }

   public static class a {
      private final ug<uf.a> a;

      public a(ug<uf.a> $$0) {
         this.a = $$0;
      }

      public int a() {
         uf.a();
         return uf.a(this.a.a(), ua.a(), this.a).map(uf::a).toList().isEmpty() ? 0 : 1;
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
         uf.a();
         ep $$0 = this.a.a();
         are $$1 = $$0.e();
         tq.a($$1);
         this.a(this.a.findStructureBlockPos(), $$1x -> {
            dqv $$2 = (dqv)$$1.c_($$1x);
            if ($$2 == null) {
               return 0;
            } else {
               eib $$3 = ud.b($$2);
               ud.a($$3, $$1);
               return 1;
            }
         }, () -> uf.a($$1, "Could not find any structures to clear", n.m), $$1x -> uf.c($$0, "Cleared " + $$1x + " structures"));
         return 1;
      }

      public int c() {
         MutableBoolean $$0 = new MutableBoolean(true);
         ep $$1 = this.a.a();
         are $$2 = $$1.e();
         this.a(this.a.findStructureBlockPos(), $$3 -> {
            dqv $$4 = (dqv)$$2.c_($$3);
            if ($$4 == null) {
               uf.a($$2, "Structure block entity could not be found", n.m);
               $$0.setFalse();
               return 0;
            } else {
               if (uf.a($$1, $$4) != 0) {
                  $$0.setFalse();
               }

               return 1;
            }
         }, () -> uf.a($$2, "Could not find any structures to export", n.m), $$1x -> uf.c($$1, "Exported " + $$1x + " structures"));
         return $$0.getValue() ? 0 : 1;
      }

      public int a(ua $$0, int $$1, int $$2) {
         uf.a();
         ep $$3 = this.a.a();
         are $$4 = $$3.e();
         iz $$5 = uf.a($$3);
         Collection<tn> $$6 = Stream.concat(uf.a($$3, $$0, this.a), uf.a($$3, $$0, this.a, $$1)).toList();
         if ($$6.isEmpty()) {
            uf.c($$3, "No tests found");
            return 0;
         } else {
            tq.a($$4);
            tp.d();
            uf.c($$3, "Running " + $$6.size() + " tests...");
            tq $$7 = tq.a.b($$6, $$4).a(new uc($$5, $$2)).a();
            return uf.a($$3, $$4, $$7);
         }
      }

      public int a(int $$0, int $$1) {
         return this.a(ua.a(), $$0, $$1);
      }

      public int a(int $$0) {
         return this.a(ua.a(), $$0, 8);
      }

      public int a(ua $$0, int $$1) {
         return this.a($$0, $$1, 8);
      }

      public int a(ua $$0) {
         return this.a($$0, 0, 8);
      }

      public int d() {
         return this.a(ua.a());
      }

      public int e() {
         uf.c(this.a.a(), "Started locating test structures, this might take a while..");
         MutableInt $$0 = new MutableInt(0);
         iz $$1 = iz.a(this.a.a().d());
         this.a
            .findStructureBlockPos()
            .forEach(
               $$2x -> {
                  dqv $$3 = (dqv)this.a.a().e().c_($$2x);
                  if ($$3 != null) {
                     je $$4 = $$3.l().a(je.c);
                     iz $$5 = $$3.ay_().a($$4, 2);
                     int $$6 = (int)$$4.g().p();
                     String $$7 = String.format("/tp @s %d %d %d %d 0", $$5.u(), $$5.v(), $$5.w(), $$6);
                     int $$8 = $$1.u() - $$2x.u();
                     int $$9 = $$1.w() - $$2x.w();
                     int $$10 = ayy.d(ayy.c((float)($$8 * $$8 + $$9 * $$9)));
                     xo $$11 = xr.a((xo)xo.a("chat.coordinates", $$2x.u(), $$2x.v(), $$2x.w()))
                        .a($$1xx -> $$1xx.a(n.k).a(new xm(xm.a.d, $$7)).a(new xu(xu.a.a, xo.c("chat.coordinates.tooltip"))));
                     xo $$12 = xo.b("Found structure at: ").b($$11).f(" (distance: " + $$10 + ")");
                     this.a.a().a(() -> $$12, false);
                     $$0.increment();
                  }
               }
            );
         int $$2 = $$0.intValue();
         if ($$2 == 0) {
            uf.a(this.a.a().e(), "No such test structure found", n.m);
            return 0;
         } else {
            uf.a(this.a.a().e(), "Finished locating, found " + $$2 + " structure(s)", n.k);
            return 1;
         }
      }
   }

   static record b(ep a) implements tj {
      @Override
      public void a(th $$0) {
         uf.c(this.a, "Starting batch: " + $$0.a());
      }

      @Override
      public void b(th $$0) {
      }
   }

   public static record c(are a, ty b) implements to {
      @Override
      public void a(tn $$0) {
      }

      @Override
      public void a(tn $$0, tq $$1) {
         a(this.a, this.b);
      }

      @Override
      public void b(tn $$0, tq $$1) {
         a(this.a, this.b);
      }

      @Override
      public void a(tn $$0, tn $$1, tq $$2) {
         this.b.a($$1);
      }

      private static void a(are $$0, ty $$1) {
         if ($$1.i()) {
            uf.a($$0, "GameTest done! " + $$1.h() + " tests were run", n.p);
            if ($$1.d()) {
               uf.a($$0, $$1.a() + " required tests failed :(", n.m);
            } else {
               uf.a($$0, "All required tests passed :)", n.k);
            }

            if ($$1.e()) {
               uf.a($$0, $$1.b() + " optional tests failed", n.h);
            }
         }
      }
   }
}
