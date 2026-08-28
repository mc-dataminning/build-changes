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

public class td {
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
   private static final te.a<td.a> n = new te.a<>(td.a::new);

   private static ArgumentBuilder<ex, ?> a(
      ArgumentBuilder<ex, ?> $$0, Function<CommandContext<ex>, td.a> $$1, Function<ArgumentBuilder<ex, ?>, ArgumentBuilder<ex, ?>> $$2
   ) {
      return $$0.executes($$1x -> $$1.apply($$1x).d())
         .then(
            ((RequiredArgumentBuilder)ey.a("numberOfTimes", IntegerArgumentType.integer(0))
                  .executes($$1x -> $$1.apply($$1x).a(new sy(IntegerArgumentType.getInteger($$1x, "numberOfTimes"), false))))
               .then(
                  $$2.apply(
                     ey.a("untilFailed", BoolArgumentType.bool())
                        .executes(
                           $$1x -> $$1.apply($$1x)
                                 .a(new sy(IntegerArgumentType.getInteger($$1x, "numberOfTimes"), BoolArgumentType.getBool($$1x, "untilFailed")))
                        )
                  )
               )
         );
   }

   private static ArgumentBuilder<ex, ?> a(ArgumentBuilder<ex, ?> $$0, Function<CommandContext<ex>, td.a> $$1) {
      return a($$0, $$1, $$0x -> $$0x);
   }

   private static ArgumentBuilder<ex, ?> b(ArgumentBuilder<ex, ?> $$0, Function<CommandContext<ex>, td.a> $$1) {
      return a(
         $$0,
         $$1,
         $$1x -> $$1x.then(
               ((RequiredArgumentBuilder)ey.a("rotationSteps", IntegerArgumentType.integer())
                     .executes(
                        $$1xx -> $$1.apply($$1xx)
                              .a(
                                 new sy(IntegerArgumentType.getInteger($$1xx, "numberOfTimes"), BoolArgumentType.getBool($$1xx, "untilFailed")),
                                 IntegerArgumentType.getInteger($$1xx, "rotationSteps")
                              )
                     ))
                  .then(
                     ey.a("testsPerRow", IntegerArgumentType.integer())
                        .executes(
                           $$1xx -> $$1.apply($$1xx)
                                 .a(
                                    new sy(IntegerArgumentType.getInteger($$1xx, "numberOfTimes"), BoolArgumentType.getBool($$1xx, "untilFailed")),
                                    IntegerArgumentType.getInteger($$1xx, "rotationSteps"),
                                    IntegerArgumentType.getInteger($$1xx, "testsPerRow")
                                 )
                        )
                  )
            )
      );
   }

   public static void a(CommandDispatcher<ex> $$0) {
      ArgumentBuilder<ex, ?> $$1 = b(ey.a("onlyRequiredTests", BoolArgumentType.bool()), $$0x -> n.a($$0x, BoolArgumentType.getBool($$0x, "onlyRequiredTests")));
      ArgumentBuilder<ex, ?> $$2 = b(ey.a("testClassName", tc.a()), $$0x -> n.a($$0x, tc.a($$0x, "testClassName")));
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ey.a(
                                                                                    "test"
                                                                                 )
                                                                                 .then(
                                                                                    ey.a("run")
                                                                                       .then(b(ey.a("testName", tg.a()), $$0x -> n.b($$0x, "testName")))
                                                                                 ))
                                                                              .then(
                                                                                 ey.a("runmultiple")
                                                                                    .then(
                                                                                       ((RequiredArgumentBuilder)ey.a("testName", tg.a())
                                                                                             .executes($$0x -> n.b($$0x, "testName").d()))
                                                                                          .then(
                                                                                             ey.a("amount", IntegerArgumentType.integer())
                                                                                                .executes(
                                                                                                   $$0x -> n.a(IntegerArgumentType.getInteger($$0x, "amount"))
                                                                                                         .b($$0x, "testName")
                                                                                                         .d()
                                                                                                )
                                                                                          )
                                                                                    )
                                                                              ))
                                                                           .then(b(ey.a("runall").then($$2), n::d)))
                                                                        .then(a(ey.a("runthese"), n::b)))
                                                                     .then(a(ey.a("runclosest"), n::a)))
                                                                  .then(a(ey.a("runthat"), n::c)))
                                                               .then(b(ey.a("runfailed").then($$1), n::e)))
                                                            .then(ey.a("verify").then(ey.a("testName", tg.a()).executes($$0x -> n.b($$0x, "testName").f()))))
                                                         .then(
                                                            ey.a("verifyclass")
                                                               .then(ey.a("testClassName", tc.a()).executes($$0x -> n.a($$0x, tc.a($$0x, "testClassName")).f()))
                                                         ))
                                                      .then(
                                                         ey.a("locate")
                                                            .then(
                                                               ey.a("testName", tg.a())
                                                                  .executes($$0x -> n.c($$0x, "minecraft:" + tg.a($$0x, "testName").d()).e())
                                                            )
                                                      ))
                                                   .then(ey.a("resetclosest").executes($$0x -> n.a($$0x).a())))
                                                .then(ey.a("resetthese").executes($$0x -> n.b($$0x).a())))
                                             .then(ey.a("resetthat").executes($$0x -> n.c($$0x).a())))
                                          .then(
                                             ey.a("export")
                                                .then(
                                                   ey.a("testName", StringArgumentType.word())
                                                      .executes($$0x -> b((ex)$$0x.getSource(), "minecraft:" + StringArgumentType.getString($$0x, "testName")))
                                                )
                                          ))
                                       .then(ey.a("exportclosest").executes($$0x -> n.a($$0x).c())))
                                    .then(ey.a("exportthese").executes($$0x -> n.b($$0x).c())))
                                 .then(ey.a("exportthat").executes($$0x -> n.c($$0x).c())))
                              .then(ey.a("clearthat").executes($$0x -> n.c($$0x).b())))
                           .then(ey.a("clearthese").executes($$0x -> n.b($$0x).b())))
                        .then(
                           ((LiteralArgumentBuilder)ey.a("clearall").executes($$0x -> n.a($$0x, 200).b()))
                              .then(
                                 ey.a("radius", IntegerArgumentType.integer())
                                    .executes($$0x -> n.a($$0x, ayz.a(IntegerArgumentType.getInteger($$0x, "radius"), 0, 1024)).b())
                              )
                        ))
                     .then(
                        ey.a("import")
                           .then(
                              ey.a("testName", StringArgumentType.word())
                                 .executes($$0x -> d((ex)$$0x.getSource(), StringArgumentType.getString($$0x, "testName")))
                           )
                     ))
                  .then(ey.a("stop").executes($$0x -> a())))
               .then(
                  ((LiteralArgumentBuilder)ey.a("pos").executes($$0x -> a((ex)$$0x.getSource(), "pos")))
                     .then(ey.a("var", StringArgumentType.word()).executes($$0x -> a((ex)$$0x.getSource(), StringArgumentType.getString($$0x, "var"))))
               ))
            .then(
               ey.a("create")
                  .then(
                     ((RequiredArgumentBuilder)ey.a("testName", StringArgumentType.word())
                           .suggests(tg::a)
                           .executes($$0x -> a((ex)$$0x.getSource(), StringArgumentType.getString($$0x, "testName"), 5, 5, 5)))
                        .then(
                           ((RequiredArgumentBuilder)ey.a("width", IntegerArgumentType.integer())
                                 .executes(
                                    $$0x -> a(
                                          (ex)$$0x.getSource(),
                                          StringArgumentType.getString($$0x, "testName"),
                                          IntegerArgumentType.getInteger($$0x, "width"),
                                          IntegerArgumentType.getInteger($$0x, "width"),
                                          IntegerArgumentType.getInteger($$0x, "width")
                                       )
                                 ))
                              .then(
                                 ey.a("height", IntegerArgumentType.integer())
                                    .then(
                                       ey.a("depth", IntegerArgumentType.integer())
                                          .executes(
                                             $$0x -> a(
                                                   (ex)$$0x.getSource(),
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

   private static int a(sl $$0) {
      $$0.g().a_(null, $$0.e()).stream().forEach($$0x -> $$0x.a(bum.d.b));
      $$0.f().c($$0.g());
      tb.a($$0.e(), $$0.g());
      a($$0.g(), "Reset succeded for: " + $$0.b(), n.k);
      return 1;
   }

   static Stream<sl> a(ex $$0, sy $$1, sz $$2) {
      return $$2.findStructureBlockPos().map($$2x -> a($$2x, $$0.e(), $$1)).flatMap(Optional::stream);
   }

   static Stream<sl> a(ex $$0, sy $$1, th $$2, int $$3) {
      return $$2.findTestFunctions().filter($$1x -> a($$0.e(), $$1x.d())).map($$3x -> new sl($$3x, tb.a($$3), $$0.e(), $$1));
   }

   private static Optional<sl> a(ji $$0, ard $$1, sy $$2) {
      dvs $$3 = (dvs)$$1.c_($$0);
      if ($$3 == null) {
         a($$1, "Structure block entity could not be found", n.m);
         return Optional.empty();
      } else {
         String $$4 = $$3.t();
         Optional<tf> $$5 = sn.e($$4);
         if ($$5.isEmpty()) {
            a($$1, "Test function for test " + $$4 + " could not be found", n.m);
            return Optional.empty();
         } else {
            tf $$6 = $$5.get();
            sl $$7 = new sl($$6, $$3.s(), $$1, $$2);
            $$7.a($$0);
            return !a($$1, $$7.t()) ? Optional.empty() : Optional.of($$7);
         }
      }
   }

   private static int a(ex $$0, String $$1, int $$2, int $$3, int $$4) {
      if ($$2 <= 48 && $$3 <= 48 && $$4 <= 48) {
         ard $$5 = $$0.e();
         ji $$6 = a($$0).e();
         tb.a($$1.toLowerCase(), $$6, new km($$2, $$3, $$4), dqf.a, $$5);
         ji $$7 = $$6.d();
         ji $$8 = $$7.b($$2 - 1, 0, $$4 - 1);
         ji.d($$7, $$8).forEach($$1x -> $$5.b($$1x, djp.I.m()));
         tb.a($$6, new ji(1, 0, -1), dqf.a, $$5);
         return 0;
      } else {
         throw new IllegalArgumentException("The structure must be less than 48 blocks big in each axis");
      }
   }

   private static int a(ex $$0, String $$1) throws CommandSyntaxException {
      fax $$2 = (fax)$$0.h().a(10.0, 1.0F, false);
      ji $$3 = $$2.b();
      ard $$4 = $$0.e();
      Optional<ji> $$5 = tb.a($$3, 15, $$4);
      if ($$5.isEmpty()) {
         $$5 = tb.a($$3, 200, $$4);
      }

      if ($$5.isEmpty()) {
         $$0.b(wp.b("Can't find a structure block that contains the targeted pos " + $$3));
         return 0;
      } else {
         dvs $$6 = (dvs)$$4.c_($$5.get());
         if ($$6 == null) {
            a($$4, "Structure block entity could not be found", n.m);
            return 0;
         } else {
            ji $$7 = $$3.b($$5.get());
            String $$8 = $$7.u() + ", " + $$7.v() + ", " + $$7.w();
            String $$9 = $$6.t();
            wp $$10 = wp.b($$8)
               .b(
                  xm.a
                     .a(true)
                     .a(n.k)
                     .a(new wv(wv.a.a, wp.b("Click to copy to clipboard")))
                     .a(new wn(wn.a.f, "final BlockPos " + $$1 + " = new BlockPos(" + $$8 + ");"))
               );
            $$0.a(() -> wp.b("Position relative to " + $$9 + ": ").b($$10), false);
            agd.a($$4, new ji($$3), $$8, -2147418368, 10000);
            return 1;
         }
      }
   }

   static int a() {
      sr.a.a();
      return 1;
   }

   static int a(ex $$0, ard $$1, so $$2) {
      $$2.a(new td.b($$0));
      sw $$3 = new sw($$2.a());
      $$3.a(new td.c($$1, $$3));
      $$3.a($$0x -> sn.a($$0x.v()));
      $$2.b();
      return 1;
   }

   static int a(ex $$0, dvs $$1) {
      String $$2 = $$1.c();
      if (!$$1.b(true)) {
         c($$0, "Failed to save structure " + $$2);
      }

      return b($$0, $$2);
   }

   private static int b(ex $$0, String $$1) {
      Path $$2 = Paths.get(tb.c);
      akv $$3 = akv.a($$1);
      Path $$4 = $$0.e().r().a($$3, ".nbt");
      Path $$5 = ot.a(mg.a, $$4, $$3.a(), $$2);
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

   private static boolean a(ard $$0, String $$1) {
      if ($$0.r().b(akv.a($$1)).isEmpty()) {
         a($$0, "Test structure " + $$1 + " could not be found", n.m);
         return false;
      } else {
         return true;
      }
   }

   static ji a(ex $$0) {
      ji $$1 = ji.a((kb)$$0.d());
      int $$2 = $$0.e().a(ect.a.b, $$1).v();
      return new ji($$1.u(), $$2 + 1, $$1.w() + 3);
   }

   static void c(ex $$0, String $$1) {
      $$0.a(() -> wp.b($$1), false);
   }

   private static int d(ex $$0, String $$1) {
      Path $$2 = Paths.get(tb.c, $$1 + ".snbt");
      akv $$3 = akv.b($$1);
      Path $$4 = $$0.e().r().a($$3, ".nbt");

      try {
         BufferedReader $$5 = Files.newBufferedReader($$2);
         String $$6 = IOUtils.toString($$5);
         Files.createDirectories($$4.getParent());

         try (OutputStream $$7 = Files.newOutputStream($$4)) {
            ud.a(uf.a($$6), $$7);
         }

         $$0.e().r().d($$3);
         c($$0, "Imported to " + $$4.toAbsolutePath());
         return 0;
      } catch (CommandSyntaxException | IOException var12) {
         e.error("Failed to load structure {}", $$1, var12);
         return 1;
      }
   }

   static void a(ard $$0, String $$1, n $$2) {
      $$0.a($$0x -> true).forEach($$2x -> $$2x.a(wp.b($$1).a($$2)));
   }

   public static class a {
      private final te<td.a> a;

      public a(te<td.a> $$0) {
         this.a = $$0;
      }

      public int a() {
         td.a();
         return td.a(this.a.a(), sy.a(), this.a).map(td::a).toList().isEmpty() ? 0 : 1;
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
         td.a();
         ex $$0 = this.a.a();
         ard $$1 = $$0.e();
         so.a($$1);
         this.a(this.a.findStructureBlockPos(), $$1x -> {
            dvs $$2 = (dvs)$$1.c_($$1x);
            if ($$2 == null) {
               return 0;
            } else {
               enf $$3 = tb.b($$2);
               tb.a($$3, $$1);
               return 1;
            }
         }, () -> td.a($$1, "Could not find any structures to clear", n.m), $$1x -> td.c($$0, "Cleared " + $$1x + " structures"));
         return 1;
      }

      public int c() {
         MutableBoolean $$0 = new MutableBoolean(true);
         ex $$1 = this.a.a();
         ard $$2 = $$1.e();
         this.a(this.a.findStructureBlockPos(), $$3 -> {
            dvs $$4 = (dvs)$$2.c_($$3);
            if ($$4 == null) {
               td.a($$2, "Structure block entity could not be found", n.m);
               $$0.setFalse();
               return 0;
            } else {
               if (td.a($$1, $$4) != 0) {
                  $$0.setFalse();
               }

               return 1;
            }
         }, () -> td.a($$2, "Could not find any structures to export", n.m), $$1x -> td.c($$1, "Exported " + $$1x + " structures"));
         return $$0.getValue() ? 0 : 1;
      }

      int f() {
         td.a();
         ex $$0 = this.a.a();
         ard $$1 = $$0.e();
         ji $$2 = td.a($$0);
         Collection<sl> $$3 = Stream.concat(td.a($$0, sy.a(), this.a), td.a($$0, sy.a(), this.a, 0)).toList();
         so.a($$1);
         sn.d();
         Collection<sf> $$4 = new ArrayList<>();

         for (sl $$5 : $$3) {
            for (dqf $$6 : dqf.values()) {
               Collection<sl> $$7 = new ArrayList<>();

               for (int $$8 = 0; $$8 < 100; $$8++) {
                  sl $$9 = new sl($$5.v(), $$6, $$1, new sy(1, true));
                  $$7.add($$9);
               }

               sf $$10 = sg.a($$7, $$5.v().b(), (long)$$6.ordinal());
               $$4.add($$10);
            }
         }

         ta $$11 = new ta($$2, 10, true);
         so $$12 = so.a.a($$4, $$1).a(sg.a(100)).a((so.c)$$11).a($$11).a(true).a();
         return td.a($$0, $$1, $$12);
      }

      public int a(sy $$0, int $$1, int $$2) {
         td.a();
         ex $$3 = this.a.a();
         ard $$4 = $$3.e();
         ji $$5 = td.a($$3);
         Collection<sl> $$6 = Stream.concat(td.a($$3, $$0, this.a), td.a($$3, $$0, this.a, $$1)).toList();
         if ($$6.isEmpty()) {
            td.c($$3, "No tests found");
            return 0;
         } else {
            so.a($$4);
            sn.d();
            td.c($$3, "Running " + $$6.size() + " tests...");
            so $$7 = so.a.b($$6, $$4).a((so.c)(new ta($$5, $$2, false))).a();
            return td.a($$3, $$4, $$7);
         }
      }

      public int a(int $$0, int $$1) {
         return this.a(sy.a(), $$0, $$1);
      }

      public int a(int $$0) {
         return this.a(sy.a(), $$0, 8);
      }

      public int a(sy $$0, int $$1) {
         return this.a($$0, $$1, 8);
      }

      public int a(sy $$0) {
         return this.a($$0, 0, 8);
      }

      public int d() {
         return this.a(sy.a());
      }

      public int e() {
         td.c(this.a.a(), "Started locating test structures, this might take a while..");
         MutableInt $$0 = new MutableInt(0);
         ji $$1 = ji.a((kb)this.a.a().d());
         this.a
            .findStructureBlockPos()
            .forEach(
               $$2x -> {
                  dvs $$3 = (dvs)this.a.a().e().c_($$2x);
                  if ($$3 != null) {
                     jn $$4 = $$3.s().a(jn.c);
                     ji $$5 = $$3.aA_().a($$4, 2);
                     int $$6 = (int)$$4.g().p();
                     String $$7 = String.format("/tp @s %d %d %d %d 0", $$5.u(), $$5.v(), $$5.w(), $$6);
                     int $$8 = $$1.u() - $$2x.u();
                     int $$9 = $$1.w() - $$2x.w();
                     int $$10 = ayz.d(ayz.c((float)($$8 * $$8 + $$9 * $$9)));
                     wp $$11 = ws.a((wp)wp.a("chat.coordinates", $$2x.u(), $$2x.v(), $$2x.w()))
                        .a($$1xx -> $$1xx.a(n.k).a(new wn(wn.a.d, $$7)).a(new wv(wv.a.a, wp.c("chat.coordinates.tooltip"))));
                     wp $$12 = wp.b("Found structure at: ").b($$11).f(" (distance: " + $$10 + ")");
                     this.a.a().a(() -> $$12, false);
                     $$0.increment();
                  }
               }
            );
         int $$2 = $$0.intValue();
         if ($$2 == 0) {
            td.a(this.a.a().e(), "No such test structure found", n.m);
            return 0;
         } else {
            td.a(this.a.a().e(), "Finished locating, found " + $$2 + " structure(s)", n.k);
            return 1;
         }
      }
   }

   static record b(ex a) implements sh {
      @Override
      public void a(sf $$0) {
         td.c(this.a, "Starting batch: " + $$0.a());
      }

      @Override
      public void b(sf $$0) {
      }
   }

   public static record c(ard a, sw b) implements sm {
      @Override
      public void a(sl $$0) {
      }

      @Override
      public void a(sl $$0, so $$1) {
         a(this.a, this.b);
      }

      @Override
      public void b(sl $$0, so $$1) {
         a(this.a, this.b);
      }

      @Override
      public void a(sl $$0, sl $$1, so $$2) {
         this.b.a($$1);
      }

      private static void a(ard $$0, sw $$1) {
         if ($$1.i()) {
            td.a($$0, "GameTest done! " + $$1.h() + " tests were run", n.p);
            if ($$1.d()) {
               td.a($$0, $$1.a() + " required tests failed :(", n.m);
            } else {
               td.a($$0, "All required tests passed :)", n.k);
            }

            if ($$1.e()) {
               td.a($$0, $$1.b() + " optional tests failed", n.h);
            }
         }
      }
   }
}
