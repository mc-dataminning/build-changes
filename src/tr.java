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

public class tr {
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
   private static final ts.a<tr.a> l = new ts.a<>(tr.a::new);

   private static ArgumentBuilder<ee, ?> a(
      ArgumentBuilder<ee, ?> $$0, Function<CommandContext<ee>, tr.a> $$1, Function<ArgumentBuilder<ee, ?>, ArgumentBuilder<ee, ?>> $$2
   ) {
      return $$0.executes($$1x -> $$1.apply($$1x).d())
         .then(
            ((RequiredArgumentBuilder)ef.a("numberOfTimes", IntegerArgumentType.integer(0))
                  .executes($$1x -> $$1.apply($$1x).a(new tm(IntegerArgumentType.getInteger($$1x, "numberOfTimes"), false))))
               .then(
                  $$2.apply(
                     ef.a("untilFailed", BoolArgumentType.bool())
                        .executes(
                           $$1x -> $$1.apply($$1x)
                                 .a(new tm(IntegerArgumentType.getInteger($$1x, "numberOfTimes"), BoolArgumentType.getBool($$1x, "untilFailed")))
                        )
                  )
               )
         );
   }

   private static ArgumentBuilder<ee, ?> a(ArgumentBuilder<ee, ?> $$0, Function<CommandContext<ee>, tr.a> $$1) {
      return a($$0, $$1, $$0x -> $$0x);
   }

   private static ArgumentBuilder<ee, ?> b(ArgumentBuilder<ee, ?> $$0, Function<CommandContext<ee>, tr.a> $$1) {
      return a(
         $$0,
         $$1,
         $$1x -> $$1x.then(
               ((RequiredArgumentBuilder)ef.a("rotationSteps", IntegerArgumentType.integer())
                     .executes(
                        $$1xx -> $$1.apply($$1xx)
                              .a(
                                 new tm(IntegerArgumentType.getInteger($$1xx, "numberOfTimes"), BoolArgumentType.getBool($$1xx, "untilFailed")),
                                 IntegerArgumentType.getInteger($$1xx, "rotationSteps")
                              )
                     ))
                  .then(
                     ef.a("testsPerRow", IntegerArgumentType.integer())
                        .executes(
                           $$1xx -> $$1.apply($$1xx)
                                 .a(
                                    new tm(IntegerArgumentType.getInteger($$1xx, "numberOfTimes"), BoolArgumentType.getBool($$1xx, "untilFailed")),
                                    IntegerArgumentType.getInteger($$1xx, "rotationSteps"),
                                    IntegerArgumentType.getInteger($$1xx, "testsPerRow")
                                 )
                        )
                  )
            )
      );
   }

   public static void a(CommandDispatcher<ee> $$0) {
      ArgumentBuilder<ee, ?> $$1 = b(ef.a("onlyRequiredTests", BoolArgumentType.bool()), $$0x -> l.a($$0x, BoolArgumentType.getBool($$0x, "onlyRequiredTests")));
      ArgumentBuilder<ee, ?> $$2 = b(ef.a("testClassName", tq.a()), $$0x -> l.a($$0x, tq.a($$0x, "testClassName")));
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ef.a(
                                                                           "test"
                                                                        )
                                                                        .then(ef.a("run").then(b(ef.a("testName", tu.a()), $$0x -> l.b($$0x, "testName")))))
                                                                     .then(
                                                                        ef.a("runmultiple")
                                                                           .then(
                                                                              ((RequiredArgumentBuilder)ef.a("testName", tu.a())
                                                                                    .executes($$0x -> l.b($$0x, "testName").d()))
                                                                                 .then(
                                                                                    ef.a("amount", IntegerArgumentType.integer())
                                                                                       .executes(
                                                                                          $$0x -> l.a(IntegerArgumentType.getInteger($$0x, "amount"))
                                                                                                .b($$0x, "testName")
                                                                                                .d()
                                                                                       )
                                                                                 )
                                                                           )
                                                                     ))
                                                                  .then(b(ef.a("runall").then($$2), l::d)))
                                                               .then(a(ef.a("runthese"), l::b)))
                                                            .then(a(ef.a("runclosest"), l::a)))
                                                         .then(a(ef.a("runthat"), l::c)))
                                                      .then(b(ef.a("runfailed").then($$1), l::e)))
                                                   .then(ef.a("resetclosest").executes($$0x -> l.a($$0x).a())))
                                                .then(ef.a("resetthese").executes($$0x -> l.b($$0x).a())))
                                             .then(ef.a("resetthat").executes($$0x -> l.c($$0x).a())))
                                          .then(
                                             ef.a("export")
                                                .then(
                                                   ef.a("testName", StringArgumentType.word())
                                                      .executes($$0x -> b((ee)$$0x.getSource(), "minecraft:" + StringArgumentType.getString($$0x, "testName")))
                                                )
                                          ))
                                       .then(ef.a("exportclosest").executes($$0x -> l.a($$0x).c())))
                                    .then(ef.a("exportthese").executes($$0x -> l.b($$0x).c())))
                                 .then(ef.a("exportthat").executes($$0x -> l.c($$0x).c())))
                              .then(ef.a("clearthat").executes($$0x -> l.c($$0x).b())))
                           .then(ef.a("clearthese").executes($$0x -> l.b($$0x).b())))
                        .then(
                           ((LiteralArgumentBuilder)ef.a("clearall").executes($$0x -> l.a($$0x, 200).b()))
                              .then(
                                 ef.a("radius", IntegerArgumentType.integer())
                                    .executes($$0x -> l.a($$0x, ayd.a(IntegerArgumentType.getInteger($$0x, "radius"), 0, 1024)).b())
                              )
                        ))
                     .then(
                        ef.a("import")
                           .then(
                              ef.a("testName", StringArgumentType.word())
                                 .executes($$0x -> d((ee)$$0x.getSource(), StringArgumentType.getString($$0x, "testName")))
                           )
                     ))
                  .then(ef.a("stop").executes($$0x -> a())))
               .then(
                  ((LiteralArgumentBuilder)ef.a("pos").executes($$0x -> a((ee)$$0x.getSource(), "pos")))
                     .then(ef.a("var", StringArgumentType.word()).executes($$0x -> a((ee)$$0x.getSource(), StringArgumentType.getString($$0x, "var"))))
               ))
            .then(
               ef.a("create")
                  .then(
                     ((RequiredArgumentBuilder)ef.a("testName", StringArgumentType.word())
                           .suggests(tu::a)
                           .executes($$0x -> a((ee)$$0x.getSource(), StringArgumentType.getString($$0x, "testName"), 5, 5, 5)))
                        .then(
                           ((RequiredArgumentBuilder)ef.a("width", IntegerArgumentType.integer())
                                 .executes(
                                    $$0x -> a(
                                          (ee)$$0x.getSource(),
                                          StringArgumentType.getString($$0x, "testName"),
                                          IntegerArgumentType.getInteger($$0x, "width"),
                                          IntegerArgumentType.getInteger($$0x, "width"),
                                          IntegerArgumentType.getInteger($$0x, "width")
                                       )
                                 ))
                              .then(
                                 ef.a("height", IntegerArgumentType.integer())
                                    .then(
                                       ef.a("depth", IntegerArgumentType.integer())
                                          .executes(
                                             $$0x -> a(
                                                   (ee)$$0x.getSource(),
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

   private static int a(sz $$0) {
      $$0.f().a_(null, $$0.d()).stream().forEach($$0x -> $$0x.a(bru.c.b));
      $$0.e().c($$0.f());
      tp.a($$0.d(), $$0.f());
      a($$0.f(), "Reset succeded for: " + $$0.b(), n.k);
      return 1;
   }

   static Stream<sz> a(ee $$0, tm $$1, tn $$2) {
      return $$2.findStructureBlockPos().map($$2x -> a($$2x, $$0.e(), $$1)).flatMap(Optional::stream);
   }

   static Stream<sz> a(ee $$0, tm $$1, tv $$2, int $$3) {
      return $$2.findTestFunctions().filter($$1x -> a($$0.e(), $$1x.d())).map($$3x -> new sz($$3x, tp.a($$3), $$0.e(), $$1));
   }

   private static Optional<sz> a(io $$0, aqm $$1, tm $$2) {
      dpv $$3 = (dpv)$$1.c_($$0);
      if ($$3 == null) {
         a($$1, "Structure block entity could not be found", n.m);
         return Optional.empty();
      } else {
         String $$4 = $$3.u();
         Optional<tt> $$5 = tb.e($$4);
         if ($$5.isEmpty()) {
            a($$1, "Test function for test " + $$4 + " could not be found", n.m);
            return Optional.empty();
         } else {
            tt $$6 = $$5.get();
            sz $$7 = new sz($$6, $$3.l(), $$1, $$2);
            $$7.a($$0);
            return !a($$1, $$7.s()) ? Optional.empty() : Optional.of($$7);
         }
      }
   }

   private static int a(ee $$0, String $$1, int $$2, int $$3, int $$4) {
      if ($$2 <= 48 && $$3 <= 48 && $$4 <= 48) {
         aqm $$5 = $$0.e();
         io $$6 = a($$0).d();
         tp.a($$1.toLowerCase(), $$6, new js($$2, $$3, $$4), dkl.a, $$5);
         io $$7 = $$6.c();
         io $$8 = $$7.b($$2 - 1, 0, $$4 - 1);
         io.d($$7, $$8).forEach($$1x -> $$5.b($$1x, dea.F.n()));
         tp.a($$6, new io(1, 0, -1), dkl.a, $$5);
         return 0;
      } else {
         throw new IllegalArgumentException("The structure must be less than 48 blocks big in each axis");
      }
   }

   private static int a(ee $$0, String $$1) throws CommandSyntaxException {
      eug $$2 = (eug)$$0.h().a(10.0, 1.0F, false);
      io $$3 = $$2.a();
      aqm $$4 = $$0.e();
      Optional<io> $$5 = tp.a($$3, 15, $$4);
      if ($$5.isEmpty()) {
         $$5 = tp.a($$3, 200, $$4);
      }

      if ($$5.isEmpty()) {
         $$0.b(wx.b("Can't find a structure block that contains the targeted pos " + $$3));
         return 0;
      } else {
         dpv $$6 = (dpv)$$4.c_($$5.get());
         if ($$6 == null) {
            a($$4, "Structure block entity could not be found", n.m);
            return 0;
         } else {
            io $$7 = $$3.b($$5.get());
            String $$8 = $$7.u() + ", " + $$7.v() + ", " + $$7.w();
            String $$9 = $$6.u();
            wx $$10 = wx.b($$8)
               .b(
                  xu.a
                     .a(true)
                     .a(n.k)
                     .a(new xd(xd.a.a, wx.b("Click to copy to clipboard")))
                     .a(new wv(wv.a.f, "final BlockPos " + $$1 + " = new BlockPos(" + $$8 + ");"))
               );
            $$0.a(() -> wx.b("Position relative to " + $$9 + ": ").b($$10), false);
            aga.a($$4, new io($$3), $$8, -2147418368, 10000);
            return 1;
         }
      }
   }

   static int a() {
      tf.a.a();
      return 1;
   }

   static int a(ee $$0, aqm $$1, tc $$2) {
      $$2.a(new tr.b($$0));
      tk $$3 = new tk($$2.a());
      $$3.a(new tr.c($$1, $$3));
      $$3.a($$0x -> tb.a($$0x.u()));
      $$2.b();
      return 1;
   }

   static int a(ee $$0, dpv $$1) {
      String $$2 = $$1.c();
      if (!$$1.b(true)) {
         c($$0, "Failed to save structure " + $$2);
      }

      return b($$0, $$2);
   }

   private static int b(ee $$0, String $$1) {
      Path $$2 = Paths.get(tp.b);
      akm $$3 = new akm($$1);
      Path $$4 = $$0.e().q().a($$3, ".nbt");
      Path $$5 = oy.a(lj.a, $$4, $$3.a(), $$2);
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

   private static boolean a(aqm $$0, String $$1) {
      if ($$0.q().b(new akm($$1)).isEmpty()) {
         a($$0, "Test structure " + $$1 + " could not be found", n.m);
         return false;
      } else {
         return true;
      }
   }

   static io a(ee $$0) {
      io $$1 = io.a($$0.d());
      int $$2 = $$0.e().a(dwt.a.b, $$1).v();
      return new io($$1.u(), $$2 + 1, $$1.w() + 3);
   }

   static void c(ee $$0, String $$1) {
      $$0.a(() -> wx.b($$1), false);
   }

   private static int d(ee $$0, String $$1) {
      Path $$2 = Paths.get(tp.b, $$1 + ".snbt");
      akm $$3 = new akm("minecraft", $$1);
      Path $$4 = $$0.e().q().a($$3, ".nbt");

      try {
         BufferedReader $$5 = Files.newBufferedReader($$2);
         String $$6 = IOUtils.toString($$5);
         Files.createDirectories($$4.getParent());

         try (OutputStream $$7 = Files.newOutputStream($$4)) {
            uq.a(us.a($$6), $$7);
         }

         $$0.e().q().d($$3);
         c($$0, "Imported to " + $$4.toAbsolutePath());
         return 0;
      } catch (CommandSyntaxException | IOException var12) {
         c.error("Failed to load structure {}", $$1, var12);
         return 1;
      }
   }

   static void a(aqm $$0, String $$1, n $$2) {
      $$0.a($$0x -> true).forEach($$2x -> $$2x.a(wx.b($$1).a($$2)));
   }

   public static class a {
      private final ts<tr.a> a;

      public a(ts<tr.a> $$0) {
         this.a = $$0;
      }

      public int a() {
         tr.a();
         return tr.a(this.a.a(), tm.a(), this.a).map(tr::a).toList().isEmpty() ? 0 : 1;
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
         tr.a();
         ee $$0 = this.a.a();
         aqm $$1 = $$0.e();
         tc.a($$1);
         this.a(this.a.findStructureBlockPos(), $$1x -> {
            dpv $$2 = (dpv)$$1.c_($$1x);
            if ($$2 == null) {
               return 0;
            } else {
               ehb $$3 = tp.b($$2);
               tp.a($$3, $$1);
               return 1;
            }
         }, () -> tr.a($$1, "Could not find any structures to clear", n.m), $$1x -> tr.c($$0, "Cleared " + $$1x + " structures"));
         return 1;
      }

      public int c() {
         MutableBoolean $$0 = new MutableBoolean(true);
         ee $$1 = this.a.a();
         aqm $$2 = $$1.e();
         this.a(this.a.findStructureBlockPos(), $$3 -> {
            dpv $$4 = (dpv)$$2.c_($$3);
            if ($$4 == null) {
               tr.a($$2, "Structure block entity could not be found", n.m);
               $$0.setFalse();
               return 0;
            } else {
               if (tr.a($$1, $$4) != 0) {
                  $$0.setFalse();
               }

               return 1;
            }
         }, () -> tr.a($$2, "Could not find any structures to export", n.m), $$1x -> tr.c($$1, "Exported " + $$1x + " structures"));
         return $$0.getValue() ? 0 : 1;
      }

      public int a(tm $$0, int $$1, int $$2) {
         tr.a();
         ee $$3 = this.a.a();
         aqm $$4 = $$3.e();
         io $$5 = tr.a($$3);
         Collection<sz> $$6 = Stream.concat(tr.a($$3, $$0, this.a), tr.a($$3, $$0, this.a, $$1)).toList();
         if ($$6.isEmpty()) {
            tr.c($$3, "No tests found");
            return 0;
         } else {
            tc.a($$4);
            tb.d();
            tr.c($$3, "Running " + $$6.size() + " tests...");
            tc $$7 = tc.a.b($$6, $$4).a(new to($$5, $$2)).a();
            return tr.a($$3, $$4, $$7);
         }
      }

      public int a(int $$0, int $$1) {
         return this.a(tm.a(), $$0, $$1);
      }

      public int a(int $$0) {
         return this.a(tm.a(), $$0, 8);
      }

      public int a(tm $$0, int $$1) {
         return this.a($$0, $$1, 8);
      }

      public int a(tm $$0) {
         return this.a($$0, 0, 8);
      }

      public int d() {
         return this.a(tm.a());
      }
   }

   static record b(ee a) implements sv {
      @Override
      public void a(st $$0) {
         tr.c(this.a, "Starting batch: " + $$0.a());
      }

      @Override
      public void b(st $$0) {
      }
   }

   public static record c(aqm a, tk b) implements ta {
      @Override
      public void a(sz $$0) {
      }

      @Override
      public void a(sz $$0, tc $$1) {
         a(this.a, this.b);
      }

      @Override
      public void b(sz $$0, tc $$1) {
         a(this.a, this.b);
      }

      @Override
      public void a(sz $$0, sz $$1, tc $$2) {
         this.b.a($$1);
      }

      private static void a(aqm $$0, tk $$1) {
         if ($$1.i()) {
            tr.a($$0, "GameTest done! " + $$1.h() + " tests were run", n.p);
            if ($$1.d()) {
               tr.a($$0, $$1.a() + " required tests failed :(", n.m);
            } else {
               tr.a($$0, "All required tests passed :)", n.k);
            }

            if ($$1.e()) {
               tr.a($$0, $$1.b() + " optional tests failed", n.h);
            }
         }
      }
   }
}
