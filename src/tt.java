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

public class tt {
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
   private static final tu.a<tt.a> n = new tu.a<>(tt.a::new);

   private static ArgumentBuilder<eu, ?> a(
      ArgumentBuilder<eu, ?> $$0, Function<CommandContext<eu>, tt.a> $$1, Function<ArgumentBuilder<eu, ?>, ArgumentBuilder<eu, ?>> $$2
   ) {
      return $$0.executes($$1x -> $$1.apply($$1x).d())
         .then(
            ((RequiredArgumentBuilder)ev.a("numberOfTimes", IntegerArgumentType.integer(0))
                  .executes($$1x -> $$1.apply($$1x).a(new to(IntegerArgumentType.getInteger($$1x, "numberOfTimes"), false))))
               .then(
                  $$2.apply(
                     ev.a("untilFailed", BoolArgumentType.bool())
                        .executes(
                           $$1x -> $$1.apply($$1x)
                                 .a(new to(IntegerArgumentType.getInteger($$1x, "numberOfTimes"), BoolArgumentType.getBool($$1x, "untilFailed")))
                        )
                  )
               )
         );
   }

   private static ArgumentBuilder<eu, ?> a(ArgumentBuilder<eu, ?> $$0, Function<CommandContext<eu>, tt.a> $$1) {
      return a($$0, $$1, $$0x -> $$0x);
   }

   private static ArgumentBuilder<eu, ?> b(ArgumentBuilder<eu, ?> $$0, Function<CommandContext<eu>, tt.a> $$1) {
      return a(
         $$0,
         $$1,
         $$1x -> $$1x.then(
               ((RequiredArgumentBuilder)ev.a("rotationSteps", IntegerArgumentType.integer())
                     .executes(
                        $$1xx -> $$1.apply($$1xx)
                              .a(
                                 new to(IntegerArgumentType.getInteger($$1xx, "numberOfTimes"), BoolArgumentType.getBool($$1xx, "untilFailed")),
                                 IntegerArgumentType.getInteger($$1xx, "rotationSteps")
                              )
                     ))
                  .then(
                     ev.a("testsPerRow", IntegerArgumentType.integer())
                        .executes(
                           $$1xx -> $$1.apply($$1xx)
                                 .a(
                                    new to(IntegerArgumentType.getInteger($$1xx, "numberOfTimes"), BoolArgumentType.getBool($$1xx, "untilFailed")),
                                    IntegerArgumentType.getInteger($$1xx, "rotationSteps"),
                                    IntegerArgumentType.getInteger($$1xx, "testsPerRow")
                                 )
                        )
                  )
            )
      );
   }

   public static void a(CommandDispatcher<eu> $$0) {
      ArgumentBuilder<eu, ?> $$1 = b(ev.a("onlyRequiredTests", BoolArgumentType.bool()), $$0x -> n.a($$0x, BoolArgumentType.getBool($$0x, "onlyRequiredTests")));
      ArgumentBuilder<eu, ?> $$2 = b(ev.a("testClassName", ts.a()), $$0x -> n.a($$0x, ts.a($$0x, "testClassName")));
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ev.a(
                                                                                    "test"
                                                                                 )
                                                                                 .then(
                                                                                    ev.a("run")
                                                                                       .then(b(ev.a("testName", tw.a()), $$0x -> n.b($$0x, "testName")))
                                                                                 ))
                                                                              .then(
                                                                                 ev.a("runmultiple")
                                                                                    .then(
                                                                                       ((RequiredArgumentBuilder)ev.a("testName", tw.a())
                                                                                             .executes($$0x -> n.b($$0x, "testName").d()))
                                                                                          .then(
                                                                                             ev.a("amount", IntegerArgumentType.integer())
                                                                                                .executes(
                                                                                                   $$0x -> n.a(IntegerArgumentType.getInteger($$0x, "amount"))
                                                                                                         .b($$0x, "testName")
                                                                                                         .d()
                                                                                                )
                                                                                          )
                                                                                    )
                                                                              ))
                                                                           .then(b(ev.a("runall").then($$2), n::d)))
                                                                        .then(a(ev.a("runthese"), n::b)))
                                                                     .then(a(ev.a("runclosest"), n::a)))
                                                                  .then(a(ev.a("runthat"), n::c)))
                                                               .then(b(ev.a("runfailed").then($$1), n::e)))
                                                            .then(ev.a("verify").then(ev.a("testName", tw.a()).executes($$0x -> n.b($$0x, "testName").f()))))
                                                         .then(
                                                            ev.a("verifyclass")
                                                               .then(ev.a("testClassName", ts.a()).executes($$0x -> n.a($$0x, ts.a($$0x, "testClassName")).f()))
                                                         ))
                                                      .then(
                                                         ev.a("locate")
                                                            .then(
                                                               ev.a("testName", tw.a())
                                                                  .executes($$0x -> n.c($$0x, "minecraft:" + tw.a($$0x, "testName").d()).e())
                                                            )
                                                      ))
                                                   .then(ev.a("resetclosest").executes($$0x -> n.a($$0x).a())))
                                                .then(ev.a("resetthese").executes($$0x -> n.b($$0x).a())))
                                             .then(ev.a("resetthat").executes($$0x -> n.c($$0x).a())))
                                          .then(
                                             ev.a("export")
                                                .then(
                                                   ev.a("testName", StringArgumentType.word())
                                                      .executes($$0x -> b((eu)$$0x.getSource(), "minecraft:" + StringArgumentType.getString($$0x, "testName")))
                                                )
                                          ))
                                       .then(ev.a("exportclosest").executes($$0x -> n.a($$0x).c())))
                                    .then(ev.a("exportthese").executes($$0x -> n.b($$0x).c())))
                                 .then(ev.a("exportthat").executes($$0x -> n.c($$0x).c())))
                              .then(ev.a("clearthat").executes($$0x -> n.c($$0x).b())))
                           .then(ev.a("clearthese").executes($$0x -> n.b($$0x).b())))
                        .then(
                           ((LiteralArgumentBuilder)ev.a("clearall").executes($$0x -> n.a($$0x, 200).b()))
                              .then(
                                 ev.a("radius", IntegerArgumentType.integer())
                                    .executes($$0x -> n.a($$0x, azf.a(IntegerArgumentType.getInteger($$0x, "radius"), 0, 1024)).b())
                              )
                        ))
                     .then(
                        ev.a("import")
                           .then(
                              ev.a("testName", StringArgumentType.word())
                                 .executes($$0x -> d((eu)$$0x.getSource(), StringArgumentType.getString($$0x, "testName")))
                           )
                     ))
                  .then(ev.a("stop").executes($$0x -> a())))
               .then(
                  ((LiteralArgumentBuilder)ev.a("pos").executes($$0x -> a((eu)$$0x.getSource(), "pos")))
                     .then(ev.a("var", StringArgumentType.word()).executes($$0x -> a((eu)$$0x.getSource(), StringArgumentType.getString($$0x, "var"))))
               ))
            .then(
               ev.a("create")
                  .then(
                     ((RequiredArgumentBuilder)ev.a("testName", StringArgumentType.word())
                           .suggests(tw::a)
                           .executes($$0x -> a((eu)$$0x.getSource(), StringArgumentType.getString($$0x, "testName"), 5, 5, 5)))
                        .then(
                           ((RequiredArgumentBuilder)ev.a("width", IntegerArgumentType.integer())
                                 .executes(
                                    $$0x -> a(
                                          (eu)$$0x.getSource(),
                                          StringArgumentType.getString($$0x, "testName"),
                                          IntegerArgumentType.getInteger($$0x, "width"),
                                          IntegerArgumentType.getInteger($$0x, "width"),
                                          IntegerArgumentType.getInteger($$0x, "width")
                                       )
                                 ))
                              .then(
                                 ev.a("height", IntegerArgumentType.integer())
                                    .then(
                                       ev.a("depth", IntegerArgumentType.integer())
                                          .executes(
                                             $$0x -> a(
                                                   (eu)$$0x.getSource(),
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

   private static int a(tb $$0) {
      $$0.f().a_(null, $$0.d()).stream().forEach($$0x -> $$0x.a(btr.c.b));
      $$0.e().c($$0.f());
      tr.a($$0.d(), $$0.f());
      a($$0.f(), "Reset succeded for: " + $$0.b(), n.k);
      return 1;
   }

   static Stream<tb> a(eu $$0, to $$1, tp $$2) {
      return $$2.findStructureBlockPos().map($$2x -> a($$2x, $$0.e(), $$1)).flatMap(Optional::stream);
   }

   static Stream<tb> a(eu $$0, to $$1, tx $$2, int $$3) {
      return $$2.findTestFunctions().filter($$1x -> a($$0.e(), $$1x.d())).map($$3x -> new tb($$3x, tr.a($$3), $$0.e(), $$1));
   }

   private static Optional<tb> a(jf $$0, arj $$1, to $$2) {
      dtm $$3 = (dtm)$$1.c_($$0);
      if ($$3 == null) {
         a($$1, "Structure block entity could not be found", n.m);
         return Optional.empty();
      } else {
         String $$4 = $$3.u();
         Optional<tv> $$5 = td.e($$4);
         if ($$5.isEmpty()) {
            a($$1, "Test function for test " + $$4 + " could not be found", n.m);
            return Optional.empty();
         } else {
            tv $$6 = $$5.get();
            tb $$7 = new tb($$6, $$3.t(), $$1, $$2);
            $$7.a($$0);
            return !a($$1, $$7.s()) ? Optional.empty() : Optional.of($$7);
         }
      }
   }

   private static int a(eu $$0, String $$1, int $$2, int $$3, int $$4) {
      if ($$2 <= 48 && $$3 <= 48 && $$4 <= 48) {
         arj $$5 = $$0.e();
         jf $$6 = a($$0).e();
         tr.a($$1.toLowerCase(), $$6, new kj($$2, $$3, $$4), doa.a, $$5);
         jf $$7 = $$6.d();
         jf $$8 = $$7.b($$2 - 1, 0, $$4 - 1);
         jf.d($$7, $$8).forEach($$1x -> $$5.b($$1x, dho.F.n()));
         tr.a($$6, new jf(1, 0, -1), doa.a, $$5);
         return 0;
      } else {
         throw new IllegalArgumentException("The structure must be less than 48 blocks big in each axis");
      }
   }

   private static int a(eu $$0, String $$1) throws CommandSyntaxException {
      eys $$2 = (eys)$$0.h().a(10.0, 1.0F, false);
      jf $$3 = $$2.b();
      arj $$4 = $$0.e();
      Optional<jf> $$5 = tr.a($$3, 15, $$4);
      if ($$5.isEmpty()) {
         $$5 = tr.a($$3, 200, $$4);
      }

      if ($$5.isEmpty()) {
         $$0.b(xe.b("Can't find a structure block that contains the targeted pos " + $$3));
         return 0;
      } else {
         dtm $$6 = (dtm)$$4.c_($$5.get());
         if ($$6 == null) {
            a($$4, "Structure block entity could not be found", n.m);
            return 0;
         } else {
            jf $$7 = $$3.b($$5.get());
            String $$8 = $$7.u() + ", " + $$7.v() + ", " + $$7.w();
            String $$9 = $$6.u();
            xe $$10 = xe.b($$8)
               .b(
                  yb.a
                     .a(true)
                     .a(n.k)
                     .a(new xk(xk.a.a, xe.b("Click to copy to clipboard")))
                     .a(new xc(xc.a.f, "final BlockPos " + $$1 + " = new BlockPos(" + $$8 + ");"))
               );
            $$0.a(() -> xe.b("Position relative to " + $$9 + ": ").b($$10), false);
            ago.a($$4, new jf($$3), $$8, -2147418368, 10000);
            return 1;
         }
      }
   }

   static int a() {
      th.a.a();
      return 1;
   }

   static int a(eu $$0, arj $$1, te $$2) {
      $$2.a(new tt.b($$0));
      tm $$3 = new tm($$2.a());
      $$3.a(new tt.c($$1, $$3));
      $$3.a($$0x -> td.a($$0x.u()));
      $$2.b();
      return 1;
   }

   static int a(eu $$0, dtm $$1) {
      String $$2 = $$1.c();
      if (!$$1.b(true)) {
         c($$0, "Failed to save structure " + $$2);
      }

      return b($$0, $$2);
   }

   private static int b(eu $$0, String $$1) {
      Path $$2 = Paths.get(tr.c);
      ale $$3 = ale.a($$1);
      Path $$4 = $$0.e().q().a($$3, ".nbt");
      Path $$5 = pj.a(ma.a, $$4, $$3.a(), $$2);
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

   private static boolean a(arj $$0, String $$1) {
      if ($$0.q().b(ale.a($$1)).isEmpty()) {
         a($$0, "Test structure " + $$1 + " could not be found", n.m);
         return false;
      } else {
         return true;
      }
   }

   static jf a(eu $$0) {
      jf $$1 = jf.a((jy)$$0.d());
      int $$2 = $$0.e().a(eao.a.b, $$1).v();
      return new jf($$1.u(), $$2 + 1, $$1.w() + 3);
   }

   static void c(eu $$0, String $$1) {
      $$0.a(() -> xe.b($$1), false);
   }

   private static int d(eu $$0, String $$1) {
      Path $$2 = Paths.get(tr.c, $$1 + ".snbt");
      ale $$3 = ale.b($$1);
      Path $$4 = $$0.e().q().a($$3, ".nbt");

      try {
         BufferedReader $$5 = Files.newBufferedReader($$2);
         String $$6 = IOUtils.toString($$5);
         Files.createDirectories($$4.getParent());

         try (OutputStream $$7 = Files.newOutputStream($$4)) {
            ut.a(uv.a($$6), $$7);
         }

         $$0.e().q().d($$3);
         c($$0, "Imported to " + $$4.toAbsolutePath());
         return 0;
      } catch (CommandSyntaxException | IOException var12) {
         e.error("Failed to load structure {}", $$1, var12);
         return 1;
      }
   }

   static void a(arj $$0, String $$1, n $$2) {
      $$0.a($$0x -> true).forEach($$2x -> $$2x.a(xe.b($$1).a($$2)));
   }

   public static class a {
      private final tu<tt.a> a;

      public a(tu<tt.a> $$0) {
         this.a = $$0;
      }

      public int a() {
         tt.a();
         return tt.a(this.a.a(), to.a(), this.a).map(tt::a).toList().isEmpty() ? 0 : 1;
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
         tt.a();
         eu $$0 = this.a.a();
         arj $$1 = $$0.e();
         te.a($$1);
         this.a(this.a.findStructureBlockPos(), $$1x -> {
            dtm $$2 = (dtm)$$1.c_($$1x);
            if ($$2 == null) {
               return 0;
            } else {
               eky $$3 = tr.b($$2);
               tr.a($$3, $$1);
               return 1;
            }
         }, () -> tt.a($$1, "Could not find any structures to clear", n.m), $$1x -> tt.c($$0, "Cleared " + $$1x + " structures"));
         return 1;
      }

      public int c() {
         MutableBoolean $$0 = new MutableBoolean(true);
         eu $$1 = this.a.a();
         arj $$2 = $$1.e();
         this.a(this.a.findStructureBlockPos(), $$3 -> {
            dtm $$4 = (dtm)$$2.c_($$3);
            if ($$4 == null) {
               tt.a($$2, "Structure block entity could not be found", n.m);
               $$0.setFalse();
               return 0;
            } else {
               if (tt.a($$1, $$4) != 0) {
                  $$0.setFalse();
               }

               return 1;
            }
         }, () -> tt.a($$2, "Could not find any structures to export", n.m), $$1x -> tt.c($$1, "Exported " + $$1x + " structures"));
         return $$0.getValue() ? 0 : 1;
      }

      int f() {
         tt.a();
         eu $$0 = this.a.a();
         arj $$1 = $$0.e();
         jf $$2 = tt.a($$0);
         Collection<tb> $$3 = Stream.concat(tt.a($$0, to.a(), this.a), tt.a($$0, to.a(), this.a, 0)).toList();
         te.a($$1);
         td.d();
         Collection<sv> $$4 = new ArrayList<>();

         for (tb $$5 : $$3) {
            for (doa $$6 : doa.values()) {
               Collection<tb> $$7 = new ArrayList<>();

               for (int $$8 = 0; $$8 < 100; $$8++) {
                  tb $$9 = new tb($$5.u(), $$6, $$1, new to(1, true));
                  $$7.add($$9);
               }

               sv $$10 = sw.a($$7, $$5.u().b(), (long)$$6.ordinal());
               $$4.add($$10);
            }
         }

         tq $$11 = new tq($$2, 10, true);
         te $$12 = te.a.a($$4, $$1).a(sw.a(100)).a((te.c)$$11).a($$11).a(true).a();
         return tt.a($$0, $$1, $$12);
      }

      public int a(to $$0, int $$1, int $$2) {
         tt.a();
         eu $$3 = this.a.a();
         arj $$4 = $$3.e();
         jf $$5 = tt.a($$3);
         Collection<tb> $$6 = Stream.concat(tt.a($$3, $$0, this.a), tt.a($$3, $$0, this.a, $$1)).toList();
         if ($$6.isEmpty()) {
            tt.c($$3, "No tests found");
            return 0;
         } else {
            te.a($$4);
            td.d();
            tt.c($$3, "Running " + $$6.size() + " tests...");
            te $$7 = te.a.b($$6, $$4).a((te.c)(new tq($$5, $$2, false))).a();
            return tt.a($$3, $$4, $$7);
         }
      }

      public int a(int $$0, int $$1) {
         return this.a(to.a(), $$0, $$1);
      }

      public int a(int $$0) {
         return this.a(to.a(), $$0, 8);
      }

      public int a(to $$0, int $$1) {
         return this.a($$0, $$1, 8);
      }

      public int a(to $$0) {
         return this.a($$0, 0, 8);
      }

      public int d() {
         return this.a(to.a());
      }

      public int e() {
         tt.c(this.a.a(), "Started locating test structures, this might take a while..");
         MutableInt $$0 = new MutableInt(0);
         jf $$1 = jf.a((jy)this.a.a().d());
         this.a
            .findStructureBlockPos()
            .forEach(
               $$2x -> {
                  dtm $$3 = (dtm)this.a.a().e().c_($$2x);
                  if ($$3 != null) {
                     jk $$4 = $$3.t().a(jk.c);
                     jf $$5 = $$3.aC_().a($$4, 2);
                     int $$6 = (int)$$4.g().p();
                     String $$7 = String.format("/tp @s %d %d %d %d 0", $$5.u(), $$5.v(), $$5.w(), $$6);
                     int $$8 = $$1.u() - $$2x.u();
                     int $$9 = $$1.w() - $$2x.w();
                     int $$10 = azf.d(azf.c((float)($$8 * $$8 + $$9 * $$9)));
                     xe $$11 = xh.a((xe)xe.a("chat.coordinates", $$2x.u(), $$2x.v(), $$2x.w()))
                        .a($$1xx -> $$1xx.a(n.k).a(new xc(xc.a.d, $$7)).a(new xk(xk.a.a, xe.c("chat.coordinates.tooltip"))));
                     xe $$12 = xe.b("Found structure at: ").b($$11).f(" (distance: " + $$10 + ")");
                     this.a.a().a(() -> $$12, false);
                     $$0.increment();
                  }
               }
            );
         int $$2 = $$0.intValue();
         if ($$2 == 0) {
            tt.a(this.a.a().e(), "No such test structure found", n.m);
            return 0;
         } else {
            tt.a(this.a.a().e(), "Finished locating, found " + $$2 + " structure(s)", n.k);
            return 1;
         }
      }
   }

   static record b(eu a) implements sx {
      @Override
      public void a(sv $$0) {
         tt.c(this.a, "Starting batch: " + $$0.a());
      }

      @Override
      public void b(sv $$0) {
      }
   }

   public static record c(arj a, tm b) implements tc {
      @Override
      public void a(tb $$0) {
      }

      @Override
      public void a(tb $$0, te $$1) {
         a(this.a, this.b);
      }

      @Override
      public void b(tb $$0, te $$1) {
         a(this.a, this.b);
      }

      @Override
      public void a(tb $$0, tb $$1, te $$2) {
         this.b.a($$1);
      }

      private static void a(arj $$0, tm $$1) {
         if ($$1.i()) {
            tt.a($$0, "GameTest done! " + $$1.h() + " tests were run", n.p);
            if ($$1.d()) {
               tt.a($$0, $$1.a() + " required tests failed :(", n.m);
            } else {
               tt.a($$0, "All required tests passed :)", n.k);
            }

            if ($$1.e()) {
               tt.a($$0, $$1.b() + " optional tests failed", n.h);
            }
         }
      }
   }
}
