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

public class tw {
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
   private static final tx.a<tw.a> n = new tx.a<>(tw.a::new);

   private static ArgumentBuilder<ev, ?> a(
      ArgumentBuilder<ev, ?> $$0, Function<CommandContext<ev>, tw.a> $$1, Function<ArgumentBuilder<ev, ?>, ArgumentBuilder<ev, ?>> $$2
   ) {
      return $$0.executes($$1x -> $$1.apply($$1x).d())
         .then(
            ((RequiredArgumentBuilder)ew.a("numberOfTimes", IntegerArgumentType.integer(0))
                  .executes($$1x -> $$1.apply($$1x).a(new tr(IntegerArgumentType.getInteger($$1x, "numberOfTimes"), false))))
               .then(
                  $$2.apply(
                     ew.a("untilFailed", BoolArgumentType.bool())
                        .executes(
                           $$1x -> $$1.apply($$1x)
                                 .a(new tr(IntegerArgumentType.getInteger($$1x, "numberOfTimes"), BoolArgumentType.getBool($$1x, "untilFailed")))
                        )
                  )
               )
         );
   }

   private static ArgumentBuilder<ev, ?> a(ArgumentBuilder<ev, ?> $$0, Function<CommandContext<ev>, tw.a> $$1) {
      return a($$0, $$1, $$0x -> $$0x);
   }

   private static ArgumentBuilder<ev, ?> b(ArgumentBuilder<ev, ?> $$0, Function<CommandContext<ev>, tw.a> $$1) {
      return a(
         $$0,
         $$1,
         $$1x -> $$1x.then(
               ((RequiredArgumentBuilder)ew.a("rotationSteps", IntegerArgumentType.integer())
                     .executes(
                        $$1xx -> $$1.apply($$1xx)
                              .a(
                                 new tr(IntegerArgumentType.getInteger($$1xx, "numberOfTimes"), BoolArgumentType.getBool($$1xx, "untilFailed")),
                                 IntegerArgumentType.getInteger($$1xx, "rotationSteps")
                              )
                     ))
                  .then(
                     ew.a("testsPerRow", IntegerArgumentType.integer())
                        .executes(
                           $$1xx -> $$1.apply($$1xx)
                                 .a(
                                    new tr(IntegerArgumentType.getInteger($$1xx, "numberOfTimes"), BoolArgumentType.getBool($$1xx, "untilFailed")),
                                    IntegerArgumentType.getInteger($$1xx, "rotationSteps"),
                                    IntegerArgumentType.getInteger($$1xx, "testsPerRow")
                                 )
                        )
                  )
            )
      );
   }

   public static void a(CommandDispatcher<ev> $$0) {
      ArgumentBuilder<ev, ?> $$1 = b(ew.a("onlyRequiredTests", BoolArgumentType.bool()), $$0x -> n.a($$0x, BoolArgumentType.getBool($$0x, "onlyRequiredTests")));
      ArgumentBuilder<ev, ?> $$2 = b(ew.a("testClassName", tv.a()), $$0x -> n.a($$0x, tv.a($$0x, "testClassName")));
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ew.a(
                                                                                    "test"
                                                                                 )
                                                                                 .then(
                                                                                    ew.a("run")
                                                                                       .then(b(ew.a("testName", tz.a()), $$0x -> n.b($$0x, "testName")))
                                                                                 ))
                                                                              .then(
                                                                                 ew.a("runmultiple")
                                                                                    .then(
                                                                                       ((RequiredArgumentBuilder)ew.a("testName", tz.a())
                                                                                             .executes($$0x -> n.b($$0x, "testName").d()))
                                                                                          .then(
                                                                                             ew.a("amount", IntegerArgumentType.integer())
                                                                                                .executes(
                                                                                                   $$0x -> n.a(IntegerArgumentType.getInteger($$0x, "amount"))
                                                                                                         .b($$0x, "testName")
                                                                                                         .d()
                                                                                                )
                                                                                          )
                                                                                    )
                                                                              ))
                                                                           .then(b(ew.a("runall").then($$2), n::d)))
                                                                        .then(a(ew.a("runthese"), n::b)))
                                                                     .then(a(ew.a("runclosest"), n::a)))
                                                                  .then(a(ew.a("runthat"), n::c)))
                                                               .then(b(ew.a("runfailed").then($$1), n::e)))
                                                            .then(ew.a("verify").then(ew.a("testName", tz.a()).executes($$0x -> n.b($$0x, "testName").f()))))
                                                         .then(
                                                            ew.a("verifyclass")
                                                               .then(ew.a("testClassName", tv.a()).executes($$0x -> n.a($$0x, tv.a($$0x, "testClassName")).f()))
                                                         ))
                                                      .then(
                                                         ew.a("locate")
                                                            .then(
                                                               ew.a("testName", tz.a())
                                                                  .executes($$0x -> n.c($$0x, "minecraft:" + tz.a($$0x, "testName").d()).e())
                                                            )
                                                      ))
                                                   .then(ew.a("resetclosest").executes($$0x -> n.a($$0x).a())))
                                                .then(ew.a("resetthese").executes($$0x -> n.b($$0x).a())))
                                             .then(ew.a("resetthat").executes($$0x -> n.c($$0x).a())))
                                          .then(
                                             ew.a("export")
                                                .then(
                                                   ew.a("testName", StringArgumentType.word())
                                                      .executes($$0x -> b((ev)$$0x.getSource(), "minecraft:" + StringArgumentType.getString($$0x, "testName")))
                                                )
                                          ))
                                       .then(ew.a("exportclosest").executes($$0x -> n.a($$0x).c())))
                                    .then(ew.a("exportthese").executes($$0x -> n.b($$0x).c())))
                                 .then(ew.a("exportthat").executes($$0x -> n.c($$0x).c())))
                              .then(ew.a("clearthat").executes($$0x -> n.c($$0x).b())))
                           .then(ew.a("clearthese").executes($$0x -> n.b($$0x).b())))
                        .then(
                           ((LiteralArgumentBuilder)ew.a("clearall").executes($$0x -> n.a($$0x, 200).b()))
                              .then(
                                 ew.a("radius", IntegerArgumentType.integer())
                                    .executes($$0x -> n.a($$0x, azj.a(IntegerArgumentType.getInteger($$0x, "radius"), 0, 1024)).b())
                              )
                        ))
                     .then(
                        ew.a("import")
                           .then(
                              ew.a("testName", StringArgumentType.word())
                                 .executes($$0x -> d((ev)$$0x.getSource(), StringArgumentType.getString($$0x, "testName")))
                           )
                     ))
                  .then(ew.a("stop").executes($$0x -> a())))
               .then(
                  ((LiteralArgumentBuilder)ew.a("pos").executes($$0x -> a((ev)$$0x.getSource(), "pos")))
                     .then(ew.a("var", StringArgumentType.word()).executes($$0x -> a((ev)$$0x.getSource(), StringArgumentType.getString($$0x, "var"))))
               ))
            .then(
               ew.a("create")
                  .then(
                     ((RequiredArgumentBuilder)ew.a("testName", StringArgumentType.word())
                           .suggests(tz::a)
                           .executes($$0x -> a((ev)$$0x.getSource(), StringArgumentType.getString($$0x, "testName"), 5, 5, 5)))
                        .then(
                           ((RequiredArgumentBuilder)ew.a("width", IntegerArgumentType.integer())
                                 .executes(
                                    $$0x -> a(
                                          (ev)$$0x.getSource(),
                                          StringArgumentType.getString($$0x, "testName"),
                                          IntegerArgumentType.getInteger($$0x, "width"),
                                          IntegerArgumentType.getInteger($$0x, "width"),
                                          IntegerArgumentType.getInteger($$0x, "width")
                                       )
                                 ))
                              .then(
                                 ew.a("height", IntegerArgumentType.integer())
                                    .then(
                                       ew.a("depth", IntegerArgumentType.integer())
                                          .executes(
                                             $$0x -> a(
                                                   (ev)$$0x.getSource(),
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

   private static int a(te $$0) {
      $$0.f().a_(null, $$0.d()).stream().forEach($$0x -> $$0x.a(btz.c.b));
      $$0.e().c($$0.f());
      tu.a($$0.d(), $$0.f());
      a($$0.f(), "Reset succeded for: " + $$0.b(), n.k);
      return 1;
   }

   static Stream<te> a(ev $$0, tr $$1, ts $$2) {
      return $$2.findStructureBlockPos().map($$2x -> a($$2x, $$0.e(), $$1)).flatMap(Optional::stream);
   }

   static Stream<te> a(ev $$0, tr $$1, ua $$2, int $$3) {
      return $$2.findTestFunctions().filter($$1x -> a($$0.e(), $$1x.d())).map($$3x -> new te($$3x, tu.a($$3), $$0.e(), $$1));
   }

   private static Optional<te> a(jg $$0, arm $$1, tr $$2) {
      dtx $$3 = (dtx)$$1.c_($$0);
      if ($$3 == null) {
         a($$1, "Structure block entity could not be found", n.m);
         return Optional.empty();
      } else {
         String $$4 = $$3.u();
         Optional<ty> $$5 = tg.e($$4);
         if ($$5.isEmpty()) {
            a($$1, "Test function for test " + $$4 + " could not be found", n.m);
            return Optional.empty();
         } else {
            ty $$6 = $$5.get();
            te $$7 = new te($$6, $$3.t(), $$1, $$2);
            $$7.a($$0);
            return !a($$1, $$7.s()) ? Optional.empty() : Optional.of($$7);
         }
      }
   }

   private static int a(ev $$0, String $$1, int $$2, int $$3, int $$4) {
      if ($$2 <= 48 && $$3 <= 48 && $$4 <= 48) {
         arm $$5 = $$0.e();
         jg $$6 = a($$0).e();
         tu.a($$1.toLowerCase(), $$6, new kk($$2, $$3, $$4), dol.a, $$5);
         jg $$7 = $$6.d();
         jg $$8 = $$7.b($$2 - 1, 0, $$4 - 1);
         jg.d($$7, $$8).forEach($$1x -> $$5.b($$1x, dia.F.m()));
         tu.a($$6, new jg(1, 0, -1), dol.a, $$5);
         return 0;
      } else {
         throw new IllegalArgumentException("The structure must be less than 48 blocks big in each axis");
      }
   }

   private static int a(ev $$0, String $$1) throws CommandSyntaxException {
      ezd $$2 = (ezd)$$0.h().a(10.0, 1.0F, false);
      jg $$3 = $$2.b();
      arm $$4 = $$0.e();
      Optional<jg> $$5 = tu.a($$3, 15, $$4);
      if ($$5.isEmpty()) {
         $$5 = tu.a($$3, 200, $$4);
      }

      if ($$5.isEmpty()) {
         $$0.b(xh.b("Can't find a structure block that contains the targeted pos " + $$3));
         return 0;
      } else {
         dtx $$6 = (dtx)$$4.c_($$5.get());
         if ($$6 == null) {
            a($$4, "Structure block entity could not be found", n.m);
            return 0;
         } else {
            jg $$7 = $$3.b($$5.get());
            String $$8 = $$7.u() + ", " + $$7.v() + ", " + $$7.w();
            String $$9 = $$6.u();
            xh $$10 = xh.b($$8)
               .b(
                  ye.a
                     .a(true)
                     .a(n.k)
                     .a(new xn(xn.a.a, xh.b("Click to copy to clipboard")))
                     .a(new xf(xf.a.f, "final BlockPos " + $$1 + " = new BlockPos(" + $$8 + ");"))
               );
            $$0.a(() -> xh.b("Position relative to " + $$9 + ": ").b($$10), false);
            agr.a($$4, new jg($$3), $$8, -2147418368, 10000);
            return 1;
         }
      }
   }

   static int a() {
      tk.a.a();
      return 1;
   }

   static int a(ev $$0, arm $$1, th $$2) {
      $$2.a(new tw.b($$0));
      tp $$3 = new tp($$2.a());
      $$3.a(new tw.c($$1, $$3));
      $$3.a($$0x -> tg.a($$0x.u()));
      $$2.b();
      return 1;
   }

   static int a(ev $$0, dtx $$1) {
      String $$2 = $$1.c();
      if (!$$1.b(true)) {
         c($$0, "Failed to save structure " + $$2);
      }

      return b($$0, $$2);
   }

   private static int b(ev $$0, String $$1) {
      Path $$2 = Paths.get(tu.c);
      alh $$3 = alh.a($$1);
      Path $$4 = $$0.e().q().a($$3, ".nbt");
      Path $$5 = pm.a(mc.a, $$4, $$3.a(), $$2);
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

   private static boolean a(arm $$0, String $$1) {
      if ($$0.q().b(alh.a($$1)).isEmpty()) {
         a($$0, "Test structure " + $$1 + " could not be found", n.m);
         return false;
      } else {
         return true;
      }
   }

   static jg a(ev $$0) {
      jg $$1 = jg.a((jz)$$0.d());
      int $$2 = $$0.e().a(eaz.a.b, $$1).v();
      return new jg($$1.u(), $$2 + 1, $$1.w() + 3);
   }

   static void c(ev $$0, String $$1) {
      $$0.a(() -> xh.b($$1), false);
   }

   private static int d(ev $$0, String $$1) {
      Path $$2 = Paths.get(tu.c, $$1 + ".snbt");
      alh $$3 = alh.b($$1);
      Path $$4 = $$0.e().q().a($$3, ".nbt");

      try {
         BufferedReader $$5 = Files.newBufferedReader($$2);
         String $$6 = IOUtils.toString($$5);
         Files.createDirectories($$4.getParent());

         try (OutputStream $$7 = Files.newOutputStream($$4)) {
            uw.a(uy.a($$6), $$7);
         }

         $$0.e().q().d($$3);
         c($$0, "Imported to " + $$4.toAbsolutePath());
         return 0;
      } catch (CommandSyntaxException | IOException var12) {
         e.error("Failed to load structure {}", $$1, var12);
         return 1;
      }
   }

   static void a(arm $$0, String $$1, n $$2) {
      $$0.a($$0x -> true).forEach($$2x -> $$2x.a(xh.b($$1).a($$2)));
   }

   public static class a {
      private final tx<tw.a> a;

      public a(tx<tw.a> $$0) {
         this.a = $$0;
      }

      public int a() {
         tw.a();
         return tw.a(this.a.a(), tr.a(), this.a).map(tw::a).toList().isEmpty() ? 0 : 1;
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
         tw.a();
         ev $$0 = this.a.a();
         arm $$1 = $$0.e();
         th.a($$1);
         this.a(this.a.findStructureBlockPos(), $$1x -> {
            dtx $$2 = (dtx)$$1.c_($$1x);
            if ($$2 == null) {
               return 0;
            } else {
               elj $$3 = tu.b($$2);
               tu.a($$3, $$1);
               return 1;
            }
         }, () -> tw.a($$1, "Could not find any structures to clear", n.m), $$1x -> tw.c($$0, "Cleared " + $$1x + " structures"));
         return 1;
      }

      public int c() {
         MutableBoolean $$0 = new MutableBoolean(true);
         ev $$1 = this.a.a();
         arm $$2 = $$1.e();
         this.a(this.a.findStructureBlockPos(), $$3 -> {
            dtx $$4 = (dtx)$$2.c_($$3);
            if ($$4 == null) {
               tw.a($$2, "Structure block entity could not be found", n.m);
               $$0.setFalse();
               return 0;
            } else {
               if (tw.a($$1, $$4) != 0) {
                  $$0.setFalse();
               }

               return 1;
            }
         }, () -> tw.a($$2, "Could not find any structures to export", n.m), $$1x -> tw.c($$1, "Exported " + $$1x + " structures"));
         return $$0.getValue() ? 0 : 1;
      }

      int f() {
         tw.a();
         ev $$0 = this.a.a();
         arm $$1 = $$0.e();
         jg $$2 = tw.a($$0);
         Collection<te> $$3 = Stream.concat(tw.a($$0, tr.a(), this.a), tw.a($$0, tr.a(), this.a, 0)).toList();
         th.a($$1);
         tg.d();
         Collection<sy> $$4 = new ArrayList<>();

         for (te $$5 : $$3) {
            for (dol $$6 : dol.values()) {
               Collection<te> $$7 = new ArrayList<>();

               for (int $$8 = 0; $$8 < 100; $$8++) {
                  te $$9 = new te($$5.u(), $$6, $$1, new tr(1, true));
                  $$7.add($$9);
               }

               sy $$10 = sz.a($$7, $$5.u().b(), (long)$$6.ordinal());
               $$4.add($$10);
            }
         }

         tt $$11 = new tt($$2, 10, true);
         th $$12 = th.a.a($$4, $$1).a(sz.a(100)).a((th.c)$$11).a($$11).a(true).a();
         return tw.a($$0, $$1, $$12);
      }

      public int a(tr $$0, int $$1, int $$2) {
         tw.a();
         ev $$3 = this.a.a();
         arm $$4 = $$3.e();
         jg $$5 = tw.a($$3);
         Collection<te> $$6 = Stream.concat(tw.a($$3, $$0, this.a), tw.a($$3, $$0, this.a, $$1)).toList();
         if ($$6.isEmpty()) {
            tw.c($$3, "No tests found");
            return 0;
         } else {
            th.a($$4);
            tg.d();
            tw.c($$3, "Running " + $$6.size() + " tests...");
            th $$7 = th.a.b($$6, $$4).a((th.c)(new tt($$5, $$2, false))).a();
            return tw.a($$3, $$4, $$7);
         }
      }

      public int a(int $$0, int $$1) {
         return this.a(tr.a(), $$0, $$1);
      }

      public int a(int $$0) {
         return this.a(tr.a(), $$0, 8);
      }

      public int a(tr $$0, int $$1) {
         return this.a($$0, $$1, 8);
      }

      public int a(tr $$0) {
         return this.a($$0, 0, 8);
      }

      public int d() {
         return this.a(tr.a());
      }

      public int e() {
         tw.c(this.a.a(), "Started locating test structures, this might take a while..");
         MutableInt $$0 = new MutableInt(0);
         jg $$1 = jg.a((jz)this.a.a().d());
         this.a
            .findStructureBlockPos()
            .forEach(
               $$2x -> {
                  dtx $$3 = (dtx)this.a.a().e().c_($$2x);
                  if ($$3 != null) {
                     jl $$4 = $$3.t().a(jl.c);
                     jg $$5 = $$3.aC_().a($$4, 2);
                     int $$6 = (int)$$4.g().p();
                     String $$7 = String.format("/tp @s %d %d %d %d 0", $$5.u(), $$5.v(), $$5.w(), $$6);
                     int $$8 = $$1.u() - $$2x.u();
                     int $$9 = $$1.w() - $$2x.w();
                     int $$10 = azj.d(azj.c((float)($$8 * $$8 + $$9 * $$9)));
                     xh $$11 = xk.a((xh)xh.a("chat.coordinates", $$2x.u(), $$2x.v(), $$2x.w()))
                        .a($$1xx -> $$1xx.a(n.k).a(new xf(xf.a.d, $$7)).a(new xn(xn.a.a, xh.c("chat.coordinates.tooltip"))));
                     xh $$12 = xh.b("Found structure at: ").b($$11).f(" (distance: " + $$10 + ")");
                     this.a.a().a(() -> $$12, false);
                     $$0.increment();
                  }
               }
            );
         int $$2 = $$0.intValue();
         if ($$2 == 0) {
            tw.a(this.a.a().e(), "No such test structure found", n.m);
            return 0;
         } else {
            tw.a(this.a.a().e(), "Finished locating, found " + $$2 + " structure(s)", n.k);
            return 1;
         }
      }
   }

   static record b(ev a) implements ta {
      @Override
      public void a(sy $$0) {
         tw.c(this.a, "Starting batch: " + $$0.a());
      }

      @Override
      public void b(sy $$0) {
      }
   }

   public static record c(arm a, tp b) implements tf {
      @Override
      public void a(te $$0) {
      }

      @Override
      public void a(te $$0, th $$1) {
         a(this.a, this.b);
      }

      @Override
      public void b(te $$0, th $$1) {
         a(this.a, this.b);
      }

      @Override
      public void a(te $$0, te $$1, th $$2) {
         this.b.a($$1);
      }

      private static void a(arm $$0, tp $$1) {
         if ($$1.i()) {
            tw.a($$0, "GameTest done! " + $$1.h() + " tests were run", n.p);
            if ($$1.d()) {
               tw.a($$0, $$1.a() + " required tests failed :(", n.m);
            } else {
               tw.a($$0, "All required tests passed :)", n.k);
            }

            if ($$1.e()) {
               tw.a($$0, $$1.b() + " optional tests failed", n.h);
            }
         }
      }
   }
}
