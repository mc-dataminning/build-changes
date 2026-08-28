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
import java.util.ArrayList;
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

public class tx {
   public static final int a = 15;
   public static final int b = 200;
   public static final int c = 10;
   public static final int d = 100;
   private static final Logger e = LogUtils.getLogger();
   private static final int f = 200;
   private static final int g = 1024;
   private static final int h = 3;
   private static final int i = 10000;
   private static final int j = 5;
   private static final int k = 5;
   private static final int l = 5;
   private static final String m = "Structure block entity could not be found";
   private static final ty.a<tx.a> n = new ty.a<>(tx.a::new);

   private static ArgumentBuilder<ew, ?> a(
      ArgumentBuilder<ew, ?> $$0, Function<CommandContext<ew>, tx.a> $$1, Function<ArgumentBuilder<ew, ?>, ArgumentBuilder<ew, ?>> $$2
   ) {
      return $$0.executes($$1x -> $$1.apply($$1x).d())
         .then(
            ((RequiredArgumentBuilder)ex.a("numberOfTimes", IntegerArgumentType.integer(0))
                  .executes($$1x -> $$1.apply($$1x).a(new ts(IntegerArgumentType.getInteger($$1x, "numberOfTimes"), false))))
               .then(
                  $$2.apply(
                     ex.a("untilFailed", BoolArgumentType.bool())
                        .executes(
                           $$1x -> $$1.apply($$1x)
                                 .a(new ts(IntegerArgumentType.getInteger($$1x, "numberOfTimes"), BoolArgumentType.getBool($$1x, "untilFailed")))
                        )
                  )
               )
         );
   }

   private static ArgumentBuilder<ew, ?> a(ArgumentBuilder<ew, ?> $$0, Function<CommandContext<ew>, tx.a> $$1) {
      return a($$0, $$1, $$0x -> $$0x);
   }

   private static ArgumentBuilder<ew, ?> b(ArgumentBuilder<ew, ?> $$0, Function<CommandContext<ew>, tx.a> $$1) {
      return a(
         $$0,
         $$1,
         $$1x -> $$1x.then(
               ((RequiredArgumentBuilder)ex.a("rotationSteps", IntegerArgumentType.integer())
                     .executes(
                        $$1xx -> $$1.apply($$1xx)
                              .a(
                                 new ts(IntegerArgumentType.getInteger($$1xx, "numberOfTimes"), BoolArgumentType.getBool($$1xx, "untilFailed")),
                                 IntegerArgumentType.getInteger($$1xx, "rotationSteps")
                              )
                     ))
                  .then(
                     ex.a("testsPerRow", IntegerArgumentType.integer())
                        .executes(
                           $$1xx -> $$1.apply($$1xx)
                                 .a(
                                    new ts(IntegerArgumentType.getInteger($$1xx, "numberOfTimes"), BoolArgumentType.getBool($$1xx, "untilFailed")),
                                    IntegerArgumentType.getInteger($$1xx, "rotationSteps"),
                                    IntegerArgumentType.getInteger($$1xx, "testsPerRow")
                                 )
                        )
                  )
            )
      );
   }

   public static void a(CommandDispatcher<ew> $$0) {
      ArgumentBuilder<ew, ?> $$1 = b(ex.a("onlyRequiredTests", BoolArgumentType.bool()), $$0x -> n.a($$0x, BoolArgumentType.getBool($$0x, "onlyRequiredTests")));
      ArgumentBuilder<ew, ?> $$2 = b(ex.a("testClassName", tw.a()), $$0x -> n.a($$0x, tw.a($$0x, "testClassName")));
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ex.a(
                                                                                    "test"
                                                                                 )
                                                                                 .then(
                                                                                    ex.a("run")
                                                                                       .then(b(ex.a("testName", ua.a()), $$0x -> n.b($$0x, "testName")))
                                                                                 ))
                                                                              .then(
                                                                                 ex.a("runmultiple")
                                                                                    .then(
                                                                                       ((RequiredArgumentBuilder)ex.a("testName", ua.a())
                                                                                             .executes($$0x -> n.b($$0x, "testName").d()))
                                                                                          .then(
                                                                                             ex.a("amount", IntegerArgumentType.integer())
                                                                                                .executes(
                                                                                                   $$0x -> n.a(IntegerArgumentType.getInteger($$0x, "amount"))
                                                                                                         .b($$0x, "testName")
                                                                                                         .d()
                                                                                                )
                                                                                          )
                                                                                    )
                                                                              ))
                                                                           .then(b(ex.a("runall").then($$2), n::d)))
                                                                        .then(a(ex.a("runthese"), n::b)))
                                                                     .then(a(ex.a("runclosest"), n::a)))
                                                                  .then(a(ex.a("runthat"), n::c)))
                                                               .then(b(ex.a("runfailed").then($$1), n::e)))
                                                            .then(ex.a("verify").then(ex.a("testName", ua.a()).executes($$0x -> n.b($$0x, "testName").f()))))
                                                         .then(
                                                            ex.a("verifyclass")
                                                               .then(ex.a("testClassName", tw.a()).executes($$0x -> n.a($$0x, tw.a($$0x, "testClassName")).f()))
                                                         ))
                                                      .then(
                                                         ex.a("locate")
                                                            .then(
                                                               ex.a("testName", ua.a())
                                                                  .executes($$0x -> n.c($$0x, "minecraft:" + ua.a($$0x, "testName").d()).e())
                                                            )
                                                      ))
                                                   .then(ex.a("resetclosest").executes($$0x -> n.a($$0x).a())))
                                                .then(ex.a("resetthese").executes($$0x -> n.b($$0x).a())))
                                             .then(ex.a("resetthat").executes($$0x -> n.c($$0x).a())))
                                          .then(
                                             ex.a("export")
                                                .then(
                                                   ex.a("testName", StringArgumentType.word())
                                                      .executes($$0x -> b((ew)$$0x.getSource(), "minecraft:" + StringArgumentType.getString($$0x, "testName")))
                                                )
                                          ))
                                       .then(ex.a("exportclosest").executes($$0x -> n.a($$0x).c())))
                                    .then(ex.a("exportthese").executes($$0x -> n.b($$0x).c())))
                                 .then(ex.a("exportthat").executes($$0x -> n.c($$0x).c())))
                              .then(ex.a("clearthat").executes($$0x -> n.c($$0x).b())))
                           .then(ex.a("clearthese").executes($$0x -> n.b($$0x).b())))
                        .then(
                           ((LiteralArgumentBuilder)ex.a("clearall").executes($$0x -> n.a($$0x, 200).b()))
                              .then(
                                 ex.a("radius", IntegerArgumentType.integer())
                                    .executes($$0x -> n.a($$0x, azk.a(IntegerArgumentType.getInteger($$0x, "radius"), 0, 1024)).b())
                              )
                        ))
                     .then(
                        ex.a("import")
                           .then(
                              ex.a("testName", StringArgumentType.word())
                                 .executes($$0x -> d((ew)$$0x.getSource(), StringArgumentType.getString($$0x, "testName")))
                           )
                     ))
                  .then(ex.a("stop").executes($$0x -> a())))
               .then(
                  ((LiteralArgumentBuilder)ex.a("pos").executes($$0x -> a((ew)$$0x.getSource(), "pos")))
                     .then(ex.a("var", StringArgumentType.word()).executes($$0x -> a((ew)$$0x.getSource(), StringArgumentType.getString($$0x, "var"))))
               ))
            .then(
               ex.a("create")
                  .then(
                     ((RequiredArgumentBuilder)ex.a("testName", StringArgumentType.word())
                           .suggests(ua::a)
                           .executes($$0x -> a((ew)$$0x.getSource(), StringArgumentType.getString($$0x, "testName"), 5, 5, 5)))
                        .then(
                           ((RequiredArgumentBuilder)ex.a("width", IntegerArgumentType.integer())
                                 .executes(
                                    $$0x -> a(
                                          (ew)$$0x.getSource(),
                                          StringArgumentType.getString($$0x, "testName"),
                                          IntegerArgumentType.getInteger($$0x, "width"),
                                          IntegerArgumentType.getInteger($$0x, "width"),
                                          IntegerArgumentType.getInteger($$0x, "width")
                                       )
                                 ))
                              .then(
                                 ex.a("height", IntegerArgumentType.integer())
                                    .then(
                                       ex.a("depth", IntegerArgumentType.integer())
                                          .executes(
                                             $$0x -> a(
                                                   (ew)$$0x.getSource(),
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

   private static int a(tf $$0) {
      $$0.f().a_(null, $$0.d()).stream().forEach($$0x -> $$0x.a(bue.c.b));
      $$0.e().c($$0.f());
      tv.a($$0.d(), $$0.f());
      a($$0.f(), "Reset succeded for: " + $$0.b(), n.k);
      return 1;
   }

   static Stream<tf> a(ew $$0, ts $$1, tt $$2) {
      return $$2.findStructureBlockPos().map($$2x -> a($$2x, $$0.e(), $$1)).flatMap(Optional::stream);
   }

   static Stream<tf> a(ew $$0, ts $$1, ub $$2, int $$3) {
      return $$2.findTestFunctions().filter($$1x -> a($$0.e(), $$1x.d())).map($$3x -> new tf($$3x, tv.a($$3), $$0.e(), $$1));
   }

   private static Optional<tf> a(jh $$0, arn $$1, ts $$2) {
      dud $$3 = (dud)$$1.c_($$0);
      if ($$3 == null) {
         a($$1, "Structure block entity could not be found", n.m);
         return Optional.empty();
      } else {
         String $$4 = $$3.u();
         Optional<tz> $$5 = th.e($$4);
         if ($$5.isEmpty()) {
            a($$1, "Test function for test " + $$4 + " could not be found", n.m);
            return Optional.empty();
         } else {
            tz $$6 = $$5.get();
            tf $$7 = new tf($$6, $$3.t(), $$1, $$2);
            $$7.a($$0);
            return !a($$1, $$7.s()) ? Optional.empty() : Optional.of($$7);
         }
      }
   }

   private static int a(ew $$0, String $$1, int $$2, int $$3, int $$4) {
      if ($$2 <= 48 && $$3 <= 48 && $$4 <= 48) {
         arn $$5 = $$0.e();
         jh $$6 = a($$0).e();
         tv.a($$1.toLowerCase(), $$6, new kl($$2, $$3, $$4), dor.a, $$5);
         jh $$7 = $$6.d();
         jh $$8 = $$7.b($$2 - 1, 0, $$4 - 1);
         jh.d($$7, $$8).forEach($$1x -> $$5.b($$1x, dig.F.m()));
         tv.a($$6, new jh(1, 0, -1), dor.a, $$5);
         return 0;
      } else {
         throw new IllegalArgumentException("The structure must be less than 48 blocks big in each axis");
      }
   }

   private static int a(ew $$0, String $$1) throws CommandSyntaxException {
      ezj $$2 = (ezj)$$0.h().a(10.0, 1.0F, false);
      jh $$3 = $$2.b();
      arn $$4 = $$0.e();
      Optional<jh> $$5 = tv.a($$3, 15, $$4);
      if ($$5.isEmpty()) {
         $$5 = tv.a($$3, 200, $$4);
      }

      if ($$5.isEmpty()) {
         $$0.b(xi.b("Can't find a structure block that contains the targeted pos " + $$3));
         return 0;
      } else {
         dud $$6 = (dud)$$4.c_($$5.get());
         if ($$6 == null) {
            a($$4, "Structure block entity could not be found", n.m);
            return 0;
         } else {
            jh $$7 = $$3.b($$5.get());
            String $$8 = $$7.u() + ", " + $$7.v() + ", " + $$7.w();
            String $$9 = $$6.u();
            xi $$10 = xi.b($$8)
               .b(
                  yf.a
                     .a(true)
                     .a(n.k)
                     .a(new xo(xo.a.a, xi.b("Click to copy to clipboard")))
                     .a(new xg(xg.a.f, "final BlockPos " + $$1 + " = new BlockPos(" + $$8 + ");"))
               );
            $$0.a(() -> xi.b("Position relative to " + $$9 + ": ").b($$10), false);
            ags.a($$4, new jh($$3), $$8, -2147418368, 10000);
            return 1;
         }
      }
   }

   static int a() {
      tl.a.a();
      return 1;
   }

   static int a(ew $$0, arn $$1, ti $$2) {
      $$2.a(new tx.b($$0));
      tq $$3 = new tq($$2.a());
      $$3.a(new tx.c($$1, $$3));
      $$3.a($$0x -> th.a($$0x.u()));
      $$2.b();
      return 1;
   }

   static int a(ew $$0, dud $$1) {
      String $$2 = $$1.c();
      if (!$$1.b(true)) {
         c($$0, "Failed to save structure " + $$2);
      }

      return b($$0, $$2);
   }

   private static int b(ew $$0, String $$1) {
      Path $$2 = Paths.get(tv.c);
      ali $$3 = ali.a($$1);
      Path $$4 = $$0.e().q().a($$3, ".nbt");
      Path $$5 = pn.a(md.a, $$4, $$3.a(), $$2);
      if ($$5 == null) {
         c($$0, "Failed to export " + $$4);
         return 1;
      } else {
         try {
            v.c($$5.getParent());
         } catch (IOException var7) {
            c($$0, "Could not create folder " + $$5.getParent());
            e.error("Could not create export folder", var7);
            return 1;
         }

         c($$0, "Exported " + $$1 + " to " + $$5.toAbsolutePath());
         return 0;
      }
   }

   private static boolean a(arn $$0, String $$1) {
      if ($$0.q().b(ali.a($$1)).isEmpty()) {
         a($$0, "Test structure " + $$1 + " could not be found", n.m);
         return false;
      } else {
         return true;
      }
   }

   static jh a(ew $$0) {
      jh $$1 = jh.a((ka)$$0.d());
      int $$2 = $$0.e().a(ebf.a.b, $$1).v();
      return new jh($$1.u(), $$2 + 1, $$1.w() + 3);
   }

   static void c(ew $$0, String $$1) {
      $$0.a(() -> xi.b($$1), false);
   }

   private static int d(ew $$0, String $$1) {
      Path $$2 = Paths.get(tv.c, $$1 + ".snbt");
      ali $$3 = ali.b($$1);
      Path $$4 = $$0.e().q().a($$3, ".nbt");

      try {
         BufferedReader $$5 = Files.newBufferedReader($$2);
         String $$6 = IOUtils.toString($$5);
         Files.createDirectories($$4.getParent());

         try (OutputStream $$7 = Files.newOutputStream($$4)) {
            ux.a(uz.a($$6), $$7);
         }

         $$0.e().q().d($$3);
         c($$0, "Imported to " + $$4.toAbsolutePath());
         return 0;
      } catch (CommandSyntaxException | IOException var12) {
         e.error("Failed to load structure {}", $$1, var12);
         return 1;
      }
   }

   static void a(arn $$0, String $$1, n $$2) {
      $$0.a($$0x -> true).forEach($$2x -> $$2x.a(xi.b($$1).a($$2)));
   }

   public static class a {
      private final ty<tx.a> a;

      public a(ty<tx.a> $$0) {
         this.a = $$0;
      }

      public int a() {
         tx.a();
         return tx.a(this.a.a(), ts.a(), this.a).map(tx::a).toList().isEmpty() ? 0 : 1;
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
         tx.a();
         ew $$0 = this.a.a();
         arn $$1 = $$0.e();
         ti.a($$1);
         this.a(this.a.findStructureBlockPos(), $$1x -> {
            dud $$2 = (dud)$$1.c_($$1x);
            if ($$2 == null) {
               return 0;
            } else {
               elp $$3 = tv.b($$2);
               tv.a($$3, $$1);
               return 1;
            }
         }, () -> tx.a($$1, "Could not find any structures to clear", n.m), $$1x -> tx.c($$0, "Cleared " + $$1x + " structures"));
         return 1;
      }

      public int c() {
         MutableBoolean $$0 = new MutableBoolean(true);
         ew $$1 = this.a.a();
         arn $$2 = $$1.e();
         this.a(this.a.findStructureBlockPos(), $$3 -> {
            dud $$4 = (dud)$$2.c_($$3);
            if ($$4 == null) {
               tx.a($$2, "Structure block entity could not be found", n.m);
               $$0.setFalse();
               return 0;
            } else {
               if (tx.a($$1, $$4) != 0) {
                  $$0.setFalse();
               }

               return 1;
            }
         }, () -> tx.a($$2, "Could not find any structures to export", n.m), $$1x -> tx.c($$1, "Exported " + $$1x + " structures"));
         return $$0.getValue() ? 0 : 1;
      }

      int f() {
         tx.a();
         ew $$0 = this.a.a();
         arn $$1 = $$0.e();
         jh $$2 = tx.a($$0);
         Collection<tf> $$3 = Stream.concat(tx.a($$0, ts.a(), this.a), tx.a($$0, ts.a(), this.a, 0)).toList();
         ti.a($$1);
         th.d();
         Collection<sz> $$4 = new ArrayList<>();

         for (tf $$5 : $$3) {
            for (dor $$6 : dor.values()) {
               Collection<tf> $$7 = new ArrayList<>();

               for (int $$8 = 0; $$8 < 100; $$8++) {
                  tf $$9 = new tf($$5.u(), $$6, $$1, new ts(1, true));
                  $$7.add($$9);
               }

               sz $$10 = ta.a($$7, $$5.u().b(), (long)$$6.ordinal());
               $$4.add($$10);
            }
         }

         tu $$11 = new tu($$2, 10, true);
         ti $$12 = ti.a.a($$4, $$1).a(ta.a(100)).a((ti.c)$$11).a($$11).a(true).a();
         return tx.a($$0, $$1, $$12);
      }

      public int a(ts $$0, int $$1, int $$2) {
         tx.a();
         ew $$3 = this.a.a();
         arn $$4 = $$3.e();
         jh $$5 = tx.a($$3);
         Collection<tf> $$6 = Stream.concat(tx.a($$3, $$0, this.a), tx.a($$3, $$0, this.a, $$1)).toList();
         if ($$6.isEmpty()) {
            tx.c($$3, "No tests found");
            return 0;
         } else {
            ti.a($$4);
            th.d();
            tx.c($$3, "Running " + $$6.size() + " tests...");
            ti $$7 = ti.a.b($$6, $$4).a((ti.c)(new tu($$5, $$2, false))).a();
            return tx.a($$3, $$4, $$7);
         }
      }

      public int a(int $$0, int $$1) {
         return this.a(ts.a(), $$0, $$1);
      }

      public int a(int $$0) {
         return this.a(ts.a(), $$0, 8);
      }

      public int a(ts $$0, int $$1) {
         return this.a($$0, $$1, 8);
      }

      public int a(ts $$0) {
         return this.a($$0, 0, 8);
      }

      public int d() {
         return this.a(ts.a());
      }

      public int e() {
         tx.c(this.a.a(), "Started locating test structures, this might take a while..");
         MutableInt $$0 = new MutableInt(0);
         jh $$1 = jh.a((ka)this.a.a().d());
         this.a
            .findStructureBlockPos()
            .forEach(
               $$2x -> {
                  dud $$3 = (dud)this.a.a().e().c_($$2x);
                  if ($$3 != null) {
                     jm $$4 = $$3.t().a(jm.c);
                     jh $$5 = $$3.aB_().a($$4, 2);
                     int $$6 = (int)$$4.g().p();
                     String $$7 = String.format("/tp @s %d %d %d %d 0", $$5.u(), $$5.v(), $$5.w(), $$6);
                     int $$8 = $$1.u() - $$2x.u();
                     int $$9 = $$1.w() - $$2x.w();
                     int $$10 = azk.d(azk.c((float)($$8 * $$8 + $$9 * $$9)));
                     xi $$11 = xl.a((xi)xi.a("chat.coordinates", $$2x.u(), $$2x.v(), $$2x.w()))
                        .a($$1xx -> $$1xx.a(n.k).a(new xg(xg.a.d, $$7)).a(new xo(xo.a.a, xi.c("chat.coordinates.tooltip"))));
                     xi $$12 = xi.b("Found structure at: ").b($$11).f(" (distance: " + $$10 + ")");
                     this.a.a().a(() -> $$12, false);
                     $$0.increment();
                  }
               }
            );
         int $$2 = $$0.intValue();
         if ($$2 == 0) {
            tx.a(this.a.a().e(), "No such test structure found", n.m);
            return 0;
         } else {
            tx.a(this.a.a().e(), "Finished locating, found " + $$2 + " structure(s)", n.k);
            return 1;
         }
      }
   }

   static record b(ew a) implements tb {
      @Override
      public void a(sz $$0) {
         tx.c(this.a, "Starting batch: " + $$0.a());
      }

      @Override
      public void b(sz $$0) {
      }
   }

   public static record c(arn a, tq b) implements tg {
      @Override
      public void a(tf $$0) {
      }

      @Override
      public void a(tf $$0, ti $$1) {
         a(this.a, this.b);
      }

      @Override
      public void b(tf $$0, ti $$1) {
         a(this.a, this.b);
      }

      @Override
      public void a(tf $$0, tf $$1, ti $$2) {
         this.b.a($$1);
      }

      private static void a(arn $$0, tq $$1) {
         if ($$1.i()) {
            tx.a($$0, "GameTest done! " + $$1.h() + " tests were run", n.p);
            if ($$1.d()) {
               tx.a($$0, $$1.a() + " required tests failed :(", n.m);
            } else {
               tx.a($$0, "All required tests passed :)", n.k);
            }

            if ($$1.e()) {
               tx.a($$0, $$1.b() + " optional tests failed", n.h);
            }
         }
      }
   }
}
