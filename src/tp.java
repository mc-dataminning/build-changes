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

public class tp {
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
   private static final tq.a<tp.a> l = new tq.a<>(tp.a::new);

   private static ArgumentBuilder<et, ?> a(
      ArgumentBuilder<et, ?> $$0, Function<CommandContext<et>, tp.a> $$1, Function<ArgumentBuilder<et, ?>, ArgumentBuilder<et, ?>> $$2
   ) {
      return $$0.executes($$1x -> $$1.apply($$1x).d())
         .then(
            ((RequiredArgumentBuilder)eu.a("numberOfTimes", IntegerArgumentType.integer(0))
                  .executes($$1x -> $$1.apply($$1x).a(new tk(IntegerArgumentType.getInteger($$1x, "numberOfTimes"), false))))
               .then(
                  $$2.apply(
                     eu.a("untilFailed", BoolArgumentType.bool())
                        .executes(
                           $$1x -> $$1.apply($$1x)
                                 .a(new tk(IntegerArgumentType.getInteger($$1x, "numberOfTimes"), BoolArgumentType.getBool($$1x, "untilFailed")))
                        )
                  )
               )
         );
   }

   private static ArgumentBuilder<et, ?> a(ArgumentBuilder<et, ?> $$0, Function<CommandContext<et>, tp.a> $$1) {
      return a($$0, $$1, $$0x -> $$0x);
   }

   private static ArgumentBuilder<et, ?> b(ArgumentBuilder<et, ?> $$0, Function<CommandContext<et>, tp.a> $$1) {
      return a(
         $$0,
         $$1,
         $$1x -> $$1x.then(
               ((RequiredArgumentBuilder)eu.a("rotationSteps", IntegerArgumentType.integer())
                     .executes(
                        $$1xx -> $$1.apply($$1xx)
                              .a(
                                 new tk(IntegerArgumentType.getInteger($$1xx, "numberOfTimes"), BoolArgumentType.getBool($$1xx, "untilFailed")),
                                 IntegerArgumentType.getInteger($$1xx, "rotationSteps")
                              )
                     ))
                  .then(
                     eu.a("testsPerRow", IntegerArgumentType.integer())
                        .executes(
                           $$1xx -> $$1.apply($$1xx)
                                 .a(
                                    new tk(IntegerArgumentType.getInteger($$1xx, "numberOfTimes"), BoolArgumentType.getBool($$1xx, "untilFailed")),
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
      ArgumentBuilder<et, ?> $$2 = b(eu.a("testClassName", to.a()), $$0x -> l.a($$0x, to.a($$0x, "testClassName")));
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)eu.a(
                                                                                    "test"
                                                                                 )
                                                                                 .then(
                                                                                    eu.a("run")
                                                                                       .then(b(eu.a("testName", ts.a()), $$0x -> l.b($$0x, "testName")))
                                                                                 ))
                                                                              .then(
                                                                                 eu.a("runmultiple")
                                                                                    .then(
                                                                                       ((RequiredArgumentBuilder)eu.a("testName", ts.a())
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
                                                            .then(eu.a("verify").then(eu.a("testName", ts.a()).executes($$0x -> l.b($$0x, "testName").f()))))
                                                         .then(
                                                            eu.a("verifyclass")
                                                               .then(eu.a("testClassName", to.a()).executes($$0x -> l.a($$0x, to.a($$0x, "testClassName")).f()))
                                                         ))
                                                      .then(
                                                         eu.a("locate")
                                                            .then(
                                                               eu.a("testName", ts.a())
                                                                  .executes($$0x -> l.c($$0x, "minecraft:" + ts.a($$0x, "testName").d()).e())
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
                                    .executes($$0x -> l.a($$0x, ayo.a(IntegerArgumentType.getInteger($$0x, "radius"), 0, 1024)).b())
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
                           .suggests(ts::a)
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

   private static int a(sx $$0) {
      $$0.f().a_(null, $$0.d()).stream().forEach($$0x -> $$0x.a(bsr.c.b));
      $$0.e().c($$0.f());
      tn.a($$0.d(), $$0.f());
      a($$0.f(), "Reset succeded for: " + $$0.b(), n.k);
      return 1;
   }

   static Stream<sx> a(et $$0, tk $$1, tl $$2) {
      return $$2.findStructureBlockPos().map($$2x -> a($$2x, $$0.e(), $$1)).flatMap(Optional::stream);
   }

   static Stream<sx> a(et $$0, tk $$1, tt $$2, int $$3) {
      return $$2.findTestFunctions().filter($$1x -> a($$0.e(), $$1x.d())).map($$3x -> new sx($$3x, tn.a($$3), $$0.e(), $$1));
   }

   private static Optional<sx> a(jd $$0, aqu $$1, tk $$2) {
      drx $$3 = (drx)$$1.c_($$0);
      if ($$3 == null) {
         a($$1, "Structure block entity could not be found", n.m);
         return Optional.empty();
      } else {
         String $$4 = $$3.u();
         Optional<tr> $$5 = sz.e($$4);
         if ($$5.isEmpty()) {
            a($$1, "Test function for test " + $$4 + " could not be found", n.m);
            return Optional.empty();
         } else {
            tr $$6 = $$5.get();
            sx $$7 = new sx($$6, $$3.l(), $$1, $$2);
            $$7.a($$0);
            return !a($$1, $$7.s()) ? Optional.empty() : Optional.of($$7);
         }
      }
   }

   private static int a(et $$0, String $$1, int $$2, int $$3, int $$4) {
      if ($$2 <= 48 && $$3 <= 48 && $$4 <= 48) {
         aqu $$5 = $$0.e();
         jd $$6 = a($$0).e();
         tn.a($$1.toLowerCase(), $$6, new kh($$2, $$3, $$4), dmm.a, $$5);
         jd $$7 = $$6.d();
         jd $$8 = $$7.b($$2 - 1, 0, $$4 - 1);
         jd.d($$7, $$8).forEach($$1x -> $$5.b($$1x, dga.F.o()));
         tn.a($$6, new jd(1, 0, -1), dmm.a, $$5);
         return 0;
      } else {
         throw new IllegalArgumentException("The structure must be less than 48 blocks big in each axis");
      }
   }

   private static int a(et $$0, String $$1) throws CommandSyntaxException {
      eww $$2 = (eww)$$0.h().a(10.0, 1.0F, false);
      jd $$3 = $$2.a();
      aqu $$4 = $$0.e();
      Optional<jd> $$5 = tn.a($$3, 15, $$4);
      if ($$5.isEmpty()) {
         $$5 = tn.a($$3, 200, $$4);
      }

      if ($$5.isEmpty()) {
         $$0.b(wz.b("Can't find a structure block that contains the targeted pos " + $$3));
         return 0;
      } else {
         drx $$6 = (drx)$$4.c_($$5.get());
         if ($$6 == null) {
            a($$4, "Structure block entity could not be found", n.m);
            return 0;
         } else {
            jd $$7 = $$3.b($$5.get());
            String $$8 = $$7.u() + ", " + $$7.v() + ", " + $$7.w();
            String $$9 = $$6.u();
            wz $$10 = wz.b($$8)
               .b(
                  xw.a
                     .a(true)
                     .a(n.k)
                     .a(new xf(xf.a.a, wz.b("Click to copy to clipboard")))
                     .a(new wx(wx.a.f, "final BlockPos " + $$1 + " = new BlockPos(" + $$8 + ");"))
               );
            $$0.a(() -> wz.b("Position relative to " + $$9 + ": ").b($$10), false);
            agf.a($$4, new jd($$3), $$8, -2147418368, 10000);
            return 1;
         }
      }
   }

   static int a() {
      td.a.a();
      return 1;
   }

   static int a(et $$0, aqu $$1, ta $$2) {
      $$2.a(new tp.b($$0));
      ti $$3 = new ti($$2.a());
      $$3.a(new tp.c($$1, $$3));
      $$3.a($$0x -> sz.a($$0x.u()));
      $$2.b();
      return 1;
   }

   static int a(et $$0, drx $$1) {
      String $$2 = $$1.c();
      if (!$$1.b(true)) {
         c($$0, "Failed to save structure " + $$2);
      }

      return b($$0, $$2);
   }

   private static int b(et $$0, String $$1) {
      Path $$2 = Paths.get(tn.c);
      akr $$3 = akr.a($$1);
      Path $$4 = $$0.e().q().a($$3, ".nbt");
      Path $$5 = pf.a(ly.a, $$4, $$3.a(), $$2);
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

   private static boolean a(aqu $$0, String $$1) {
      if ($$0.q().b(akr.a($$1)).isEmpty()) {
         a($$0, "Test structure " + $$1 + " could not be found", n.m);
         return false;
      } else {
         return true;
      }
   }

   static jd a(et $$0) {
      jd $$1 = jd.a((jw)$$0.d());
      int $$2 = $$0.e().a(dyy.a.b, $$1).v();
      return new jd($$1.u(), $$2 + 1, $$1.w() + 3);
   }

   static void c(et $$0, String $$1) {
      $$0.a(() -> wz.b($$1), false);
   }

   private static int d(et $$0, String $$1) {
      Path $$2 = Paths.get(tn.c, $$1 + ".snbt");
      akr $$3 = akr.b($$1);
      Path $$4 = $$0.e().q().a($$3, ".nbt");

      try {
         BufferedReader $$5 = Files.newBufferedReader($$2);
         String $$6 = IOUtils.toString($$5);
         Files.createDirectories($$4.getParent());

         try (OutputStream $$7 = Files.newOutputStream($$4)) {
            uo.a(uq.a($$6), $$7);
         }

         $$0.e().q().d($$3);
         c($$0, "Imported to " + $$4.toAbsolutePath());
         return 0;
      } catch (CommandSyntaxException | IOException var12) {
         c.error("Failed to load structure {}", $$1, var12);
         return 1;
      }
   }

   static void a(aqu $$0, String $$1, n $$2) {
      $$0.a($$0x -> true).forEach($$2x -> $$2x.a(wz.b($$1).a($$2)));
   }

   public static class a {
      private final tq<tp.a> a;

      public a(tq<tp.a> $$0) {
         this.a = $$0;
      }

      public int a() {
         tp.a();
         return tp.a(this.a.a(), tk.a(), this.a).map(tp::a).toList().isEmpty() ? 0 : 1;
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
         tp.a();
         et $$0 = this.a.a();
         aqu $$1 = $$0.e();
         ta.a($$1);
         this.a(this.a.findStructureBlockPos(), $$1x -> {
            drx $$2 = (drx)$$1.c_($$1x);
            if ($$2 == null) {
               return 0;
            } else {
               ejh $$3 = tn.b($$2);
               tn.a($$3, $$1);
               return 1;
            }
         }, () -> tp.a($$1, "Could not find any structures to clear", n.m), $$1x -> tp.c($$0, "Cleared " + $$1x + " structures"));
         return 1;
      }

      public int c() {
         MutableBoolean $$0 = new MutableBoolean(true);
         et $$1 = this.a.a();
         aqu $$2 = $$1.e();
         this.a(this.a.findStructureBlockPos(), $$3 -> {
            drx $$4 = (drx)$$2.c_($$3);
            if ($$4 == null) {
               tp.a($$2, "Structure block entity could not be found", n.m);
               $$0.setFalse();
               return 0;
            } else {
               if (tp.a($$1, $$4) != 0) {
                  $$0.setFalse();
               }

               return 1;
            }
         }, () -> tp.a($$2, "Could not find any structures to export", n.m), $$1x -> tp.c($$1, "Exported " + $$1x + " structures"));
         return $$0.getValue() ? 0 : 1;
      }

      int f() {
         tp.a();
         et $$0 = this.a.a();
         aqu $$1 = $$0.e();
         jd $$2 = tp.a($$0);
         Collection<sx> $$3 = Stream.concat(tp.a($$0, tk.a(), this.a), tp.a($$0, tk.a(), this.a, 0)).toList();
         int $$4 = 10;
         ta.a($$1);
         sz.d();
         Collection<sr> $$5 = new ArrayList<>();

         for (sx $$6 : $$3) {
            for (dmm $$7 : dmm.values()) {
               Collection<sx> $$8 = new ArrayList<>();

               for (int $$9 = 0; $$9 < 100; $$9++) {
                  sx $$10 = new sx($$6.u(), $$7, $$1, new tk(1, true));
                  $$8.add($$10);
               }

               sr $$11 = ss.a($$8, $$6.u().b(), (long)$$7.ordinal());
               $$5.add($$11);
            }
         }

         tm $$12 = new tm($$2, 10, true);
         ta $$13 = ta.a.a($$5, $$1).a(ss.a(100)).a((ta.c)$$12).a($$12).a(true).a();
         return tp.a($$0, $$1, $$13);
      }

      public int a(tk $$0, int $$1, int $$2) {
         tp.a();
         et $$3 = this.a.a();
         aqu $$4 = $$3.e();
         jd $$5 = tp.a($$3);
         Collection<sx> $$6 = Stream.concat(tp.a($$3, $$0, this.a), tp.a($$3, $$0, this.a, $$1)).toList();
         if ($$6.isEmpty()) {
            tp.c($$3, "No tests found");
            return 0;
         } else {
            ta.a($$4);
            sz.d();
            tp.c($$3, "Running " + $$6.size() + " tests...");
            ta $$7 = ta.a.b($$6, $$4).a((ta.c)(new tm($$5, $$2, false))).a();
            return tp.a($$3, $$4, $$7);
         }
      }

      public int a(int $$0, int $$1) {
         return this.a(tk.a(), $$0, $$1);
      }

      public int a(int $$0) {
         return this.a(tk.a(), $$0, 8);
      }

      public int a(tk $$0, int $$1) {
         return this.a($$0, $$1, 8);
      }

      public int a(tk $$0) {
         return this.a($$0, 0, 8);
      }

      public int d() {
         return this.a(tk.a());
      }

      public int e() {
         tp.c(this.a.a(), "Started locating test structures, this might take a while..");
         MutableInt $$0 = new MutableInt(0);
         jd $$1 = jd.a((jw)this.a.a().d());
         this.a
            .findStructureBlockPos()
            .forEach(
               $$2x -> {
                  drx $$3 = (drx)this.a.a().e().c_($$2x);
                  if ($$3 != null) {
                     ji $$4 = $$3.l().a(ji.c);
                     jd $$5 = $$3.aD_().a($$4, 2);
                     int $$6 = (int)$$4.g().p();
                     String $$7 = String.format("/tp @s %d %d %d %d 0", $$5.u(), $$5.v(), $$5.w(), $$6);
                     int $$8 = $$1.u() - $$2x.u();
                     int $$9 = $$1.w() - $$2x.w();
                     int $$10 = ayo.d(ayo.c((float)($$8 * $$8 + $$9 * $$9)));
                     wz $$11 = xc.a((wz)wz.a("chat.coordinates", $$2x.u(), $$2x.v(), $$2x.w()))
                        .a($$1xx -> $$1xx.a(n.k).a(new wx(wx.a.d, $$7)).a(new xf(xf.a.a, wz.c("chat.coordinates.tooltip"))));
                     wz $$12 = wz.b("Found structure at: ").b($$11).f(" (distance: " + $$10 + ")");
                     this.a.a().a(() -> $$12, false);
                     $$0.increment();
                  }
               }
            );
         int $$2 = $$0.intValue();
         if ($$2 == 0) {
            tp.a(this.a.a().e(), "No such test structure found", n.m);
            return 0;
         } else {
            tp.a(this.a.a().e(), "Finished locating, found " + $$2 + " structure(s)", n.k);
            return 1;
         }
      }
   }

   static record b(et a) implements st {
      @Override
      public void a(sr $$0) {
         tp.c(this.a, "Starting batch: " + $$0.a());
      }

      @Override
      public void b(sr $$0) {
      }
   }

   public static record c(aqu a, ti b) implements sy {
      @Override
      public void a(sx $$0) {
      }

      @Override
      public void a(sx $$0, ta $$1) {
         a(this.a, this.b);
      }

      @Override
      public void b(sx $$0, ta $$1) {
         a(this.a, this.b);
      }

      @Override
      public void a(sx $$0, sx $$1, ta $$2) {
         this.b.a($$1);
      }

      private static void a(aqu $$0, ti $$1) {
         if ($$1.i()) {
            tp.a($$0, "GameTest done! " + $$1.h() + " tests were run", n.p);
            if ($$1.d()) {
               tp.a($$0, $$1.a() + " required tests failed :(", n.m);
            } else {
               tp.a($$0, "All required tests passed :)", n.k);
            }

            if ($$1.e()) {
               tp.a($$0, $$1.b() + " optional tests failed", n.h);
            }
         }
      }
   }
}
