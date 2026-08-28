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

public class ty {
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
   private static final tz.a<ty.a> n = new tz.a<>(ty.a::new);

   private static ArgumentBuilder<ew, ?> a(
      ArgumentBuilder<ew, ?> $$0, Function<CommandContext<ew>, ty.a> $$1, Function<ArgumentBuilder<ew, ?>, ArgumentBuilder<ew, ?>> $$2
   ) {
      return $$0.executes($$1x -> $$1.apply($$1x).d())
         .then(
            ((RequiredArgumentBuilder)ex.a("numberOfTimes", IntegerArgumentType.integer(0))
                  .executes($$1x -> $$1.apply($$1x).a(new tt(IntegerArgumentType.getInteger($$1x, "numberOfTimes"), false))))
               .then(
                  $$2.apply(
                     ex.a("untilFailed", BoolArgumentType.bool())
                        .executes(
                           $$1x -> $$1.apply($$1x)
                                 .a(new tt(IntegerArgumentType.getInteger($$1x, "numberOfTimes"), BoolArgumentType.getBool($$1x, "untilFailed")))
                        )
                  )
               )
         );
   }

   private static ArgumentBuilder<ew, ?> a(ArgumentBuilder<ew, ?> $$0, Function<CommandContext<ew>, ty.a> $$1) {
      return a($$0, $$1, $$0x -> $$0x);
   }

   private static ArgumentBuilder<ew, ?> b(ArgumentBuilder<ew, ?> $$0, Function<CommandContext<ew>, ty.a> $$1) {
      return a(
         $$0,
         $$1,
         $$1x -> $$1x.then(
               ((RequiredArgumentBuilder)ex.a("rotationSteps", IntegerArgumentType.integer())
                     .executes(
                        $$1xx -> $$1.apply($$1xx)
                              .a(
                                 new tt(IntegerArgumentType.getInteger($$1xx, "numberOfTimes"), BoolArgumentType.getBool($$1xx, "untilFailed")),
                                 IntegerArgumentType.getInteger($$1xx, "rotationSteps")
                              )
                     ))
                  .then(
                     ex.a("testsPerRow", IntegerArgumentType.integer())
                        .executes(
                           $$1xx -> $$1.apply($$1xx)
                                 .a(
                                    new tt(IntegerArgumentType.getInteger($$1xx, "numberOfTimes"), BoolArgumentType.getBool($$1xx, "untilFailed")),
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
      ArgumentBuilder<ew, ?> $$2 = b(ex.a("testClassName", tx.a()), $$0x -> n.a($$0x, tx.a($$0x, "testClassName")));
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ex.a(
                                                                                    "test"
                                                                                 )
                                                                                 .then(
                                                                                    ex.a("run")
                                                                                       .then(b(ex.a("testName", ub.a()), $$0x -> n.b($$0x, "testName")))
                                                                                 ))
                                                                              .then(
                                                                                 ex.a("runmultiple")
                                                                                    .then(
                                                                                       ((RequiredArgumentBuilder)ex.a("testName", ub.a())
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
                                                            .then(ex.a("verify").then(ex.a("testName", ub.a()).executes($$0x -> n.b($$0x, "testName").f()))))
                                                         .then(
                                                            ex.a("verifyclass")
                                                               .then(ex.a("testClassName", tx.a()).executes($$0x -> n.a($$0x, tx.a($$0x, "testClassName")).f()))
                                                         ))
                                                      .then(
                                                         ex.a("locate")
                                                            .then(
                                                               ex.a("testName", ub.a())
                                                                  .executes($$0x -> n.c($$0x, "minecraft:" + ub.a($$0x, "testName").d()).e())
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
                                    .executes($$0x -> n.a($$0x, azm.a(IntegerArgumentType.getInteger($$0x, "radius"), 0, 1024)).b())
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
                           .suggests(ub::a)
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

   private static int a(tg $$0) {
      $$0.g().a_(null, $$0.e()).stream().forEach($$0x -> $$0x.a(bul.c.b));
      $$0.f().c($$0.g());
      tw.a($$0.e(), $$0.g());
      a($$0.g(), "Reset succeded for: " + $$0.b(), n.k);
      return 1;
   }

   static Stream<tg> a(ew $$0, tt $$1, tu $$2) {
      return $$2.findStructureBlockPos().map($$2x -> a($$2x, $$0.e(), $$1)).flatMap(Optional::stream);
   }

   static Stream<tg> a(ew $$0, tt $$1, uc $$2, int $$3) {
      return $$2.findTestFunctions().filter($$1x -> a($$0.e(), $$1x.d())).map($$3x -> new tg($$3x, tw.a($$3), $$0.e(), $$1));
   }

   private static Optional<tg> a(jh $$0, arp $$1, tt $$2) {
      dup $$3 = (dup)$$1.c_($$0);
      if ($$3 == null) {
         a($$1, "Structure block entity could not be found", n.m);
         return Optional.empty();
      } else {
         String $$4 = $$3.u();
         Optional<ua> $$5 = ti.e($$4);
         if ($$5.isEmpty()) {
            a($$1, "Test function for test " + $$4 + " could not be found", n.m);
            return Optional.empty();
         } else {
            ua $$6 = $$5.get();
            tg $$7 = new tg($$6, $$3.t(), $$1, $$2);
            $$7.a($$0);
            return !a($$1, $$7.t()) ? Optional.empty() : Optional.of($$7);
         }
      }
   }

   private static int a(ew $$0, String $$1, int $$2, int $$3, int $$4) {
      if ($$2 <= 48 && $$3 <= 48 && $$4 <= 48) {
         arp $$5 = $$0.e();
         jh $$6 = a($$0).e();
         tw.a($$1.toLowerCase(), $$6, new kl($$2, $$3, $$4), dpd.a, $$5);
         jh $$7 = $$6.d();
         jh $$8 = $$7.b($$2 - 1, 0, $$4 - 1);
         jh.d($$7, $$8).forEach($$1x -> $$5.b($$1x, dis.F.m()));
         tw.a($$6, new jh(1, 0, -1), dpd.a, $$5);
         return 0;
      } else {
         throw new IllegalArgumentException("The structure must be less than 48 blocks big in each axis");
      }
   }

   private static int a(ew $$0, String $$1) throws CommandSyntaxException {
      ezu $$2 = (ezu)$$0.h().a(10.0, 1.0F, false);
      jh $$3 = $$2.b();
      arp $$4 = $$0.e();
      Optional<jh> $$5 = tw.a($$3, 15, $$4);
      if ($$5.isEmpty()) {
         $$5 = tw.a($$3, 200, $$4);
      }

      if ($$5.isEmpty()) {
         $$0.b(xj.b("Can't find a structure block that contains the targeted pos " + $$3));
         return 0;
      } else {
         dup $$6 = (dup)$$4.c_($$5.get());
         if ($$6 == null) {
            a($$4, "Structure block entity could not be found", n.m);
            return 0;
         } else {
            jh $$7 = $$3.b($$5.get());
            String $$8 = $$7.u() + ", " + $$7.v() + ", " + $$7.w();
            String $$9 = $$6.u();
            xj $$10 = xj.b($$8)
               .b(
                  yg.a
                     .a(true)
                     .a(n.k)
                     .a(new xp(xp.a.a, xj.b("Click to copy to clipboard")))
                     .a(new xh(xh.a.f, "final BlockPos " + $$1 + " = new BlockPos(" + $$8 + ");"))
               );
            $$0.a(() -> xj.b("Position relative to " + $$9 + ": ").b($$10), false);
            agt.a($$4, new jh($$3), $$8, -2147418368, 10000);
            return 1;
         }
      }
   }

   static int a() {
      tm.a.a();
      return 1;
   }

   static int a(ew $$0, arp $$1, tj $$2) {
      $$2.a(new ty.b($$0));
      tr $$3 = new tr($$2.a());
      $$3.a(new ty.c($$1, $$3));
      $$3.a($$0x -> ti.a($$0x.v()));
      $$2.b();
      return 1;
   }

   static int a(ew $$0, dup $$1) {
      String $$2 = $$1.c();
      if (!$$1.b(true)) {
         c($$0, "Failed to save structure " + $$2);
      }

      return b($$0, $$2);
   }

   private static int b(ew $$0, String $$1) {
      Path $$2 = Paths.get(tw.c);
      alj $$3 = alj.a($$1);
      Path $$4 = $$0.e().r().a($$3, ".nbt");
      Path $$5 = po.a(me.a, $$4, $$3.a(), $$2);
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

   private static boolean a(arp $$0, String $$1) {
      if ($$0.r().b(alj.a($$1)).isEmpty()) {
         a($$0, "Test structure " + $$1 + " could not be found", n.m);
         return false;
      } else {
         return true;
      }
   }

   static jh a(ew $$0) {
      jh $$1 = jh.a((ka)$$0.d());
      int $$2 = $$0.e().a(ebq.a.b, $$1).v();
      return new jh($$1.u(), $$2 + 1, $$1.w() + 3);
   }

   static void c(ew $$0, String $$1) {
      $$0.a(() -> xj.b($$1), false);
   }

   private static int d(ew $$0, String $$1) {
      Path $$2 = Paths.get(tw.c, $$1 + ".snbt");
      alj $$3 = alj.b($$1);
      Path $$4 = $$0.e().r().a($$3, ".nbt");

      try {
         BufferedReader $$5 = Files.newBufferedReader($$2);
         String $$6 = IOUtils.toString($$5);
         Files.createDirectories($$4.getParent());

         try (OutputStream $$7 = Files.newOutputStream($$4)) {
            uy.a(va.a($$6), $$7);
         }

         $$0.e().r().d($$3);
         c($$0, "Imported to " + $$4.toAbsolutePath());
         return 0;
      } catch (CommandSyntaxException | IOException var12) {
         e.error("Failed to load structure {}", $$1, var12);
         return 1;
      }
   }

   static void a(arp $$0, String $$1, n $$2) {
      $$0.a($$0x -> true).forEach($$2x -> $$2x.a(xj.b($$1).a($$2)));
   }

   public static class a {
      private final tz<ty.a> a;

      public a(tz<ty.a> $$0) {
         this.a = $$0;
      }

      public int a() {
         ty.a();
         return ty.a(this.a.a(), tt.a(), this.a).map(ty::a).toList().isEmpty() ? 0 : 1;
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
         ty.a();
         ew $$0 = this.a.a();
         arp $$1 = $$0.e();
         tj.a($$1);
         this.a(this.a.findStructureBlockPos(), $$1x -> {
            dup $$2 = (dup)$$1.c_($$1x);
            if ($$2 == null) {
               return 0;
            } else {
               ema $$3 = tw.b($$2);
               tw.a($$3, $$1);
               return 1;
            }
         }, () -> ty.a($$1, "Could not find any structures to clear", n.m), $$1x -> ty.c($$0, "Cleared " + $$1x + " structures"));
         return 1;
      }

      public int c() {
         MutableBoolean $$0 = new MutableBoolean(true);
         ew $$1 = this.a.a();
         arp $$2 = $$1.e();
         this.a(this.a.findStructureBlockPos(), $$3 -> {
            dup $$4 = (dup)$$2.c_($$3);
            if ($$4 == null) {
               ty.a($$2, "Structure block entity could not be found", n.m);
               $$0.setFalse();
               return 0;
            } else {
               if (ty.a($$1, $$4) != 0) {
                  $$0.setFalse();
               }

               return 1;
            }
         }, () -> ty.a($$2, "Could not find any structures to export", n.m), $$1x -> ty.c($$1, "Exported " + $$1x + " structures"));
         return $$0.getValue() ? 0 : 1;
      }

      int f() {
         ty.a();
         ew $$0 = this.a.a();
         arp $$1 = $$0.e();
         jh $$2 = ty.a($$0);
         Collection<tg> $$3 = Stream.concat(ty.a($$0, tt.a(), this.a), ty.a($$0, tt.a(), this.a, 0)).toList();
         tj.a($$1);
         ti.d();
         Collection<ta> $$4 = new ArrayList<>();

         for (tg $$5 : $$3) {
            for (dpd $$6 : dpd.values()) {
               Collection<tg> $$7 = new ArrayList<>();

               for (int $$8 = 0; $$8 < 100; $$8++) {
                  tg $$9 = new tg($$5.v(), $$6, $$1, new tt(1, true));
                  $$7.add($$9);
               }

               ta $$10 = tb.a($$7, $$5.v().b(), (long)$$6.ordinal());
               $$4.add($$10);
            }
         }

         tv $$11 = new tv($$2, 10, true);
         tj $$12 = tj.a.a($$4, $$1).a(tb.a(100)).a((tj.c)$$11).a($$11).a(true).a();
         return ty.a($$0, $$1, $$12);
      }

      public int a(tt $$0, int $$1, int $$2) {
         ty.a();
         ew $$3 = this.a.a();
         arp $$4 = $$3.e();
         jh $$5 = ty.a($$3);
         Collection<tg> $$6 = Stream.concat(ty.a($$3, $$0, this.a), ty.a($$3, $$0, this.a, $$1)).toList();
         if ($$6.isEmpty()) {
            ty.c($$3, "No tests found");
            return 0;
         } else {
            tj.a($$4);
            ti.d();
            ty.c($$3, "Running " + $$6.size() + " tests...");
            tj $$7 = tj.a.b($$6, $$4).a((tj.c)(new tv($$5, $$2, false))).a();
            return ty.a($$3, $$4, $$7);
         }
      }

      public int a(int $$0, int $$1) {
         return this.a(tt.a(), $$0, $$1);
      }

      public int a(int $$0) {
         return this.a(tt.a(), $$0, 8);
      }

      public int a(tt $$0, int $$1) {
         return this.a($$0, $$1, 8);
      }

      public int a(tt $$0) {
         return this.a($$0, 0, 8);
      }

      public int d() {
         return this.a(tt.a());
      }

      public int e() {
         ty.c(this.a.a(), "Started locating test structures, this might take a while..");
         MutableInt $$0 = new MutableInt(0);
         jh $$1 = jh.a((ka)this.a.a().d());
         this.a
            .findStructureBlockPos()
            .forEach(
               $$2x -> {
                  dup $$3 = (dup)this.a.a().e().c_($$2x);
                  if ($$3 != null) {
                     jm $$4 = $$3.t().a(jm.c);
                     jh $$5 = $$3.aA_().a($$4, 2);
                     int $$6 = (int)$$4.g().p();
                     String $$7 = String.format("/tp @s %d %d %d %d 0", $$5.u(), $$5.v(), $$5.w(), $$6);
                     int $$8 = $$1.u() - $$2x.u();
                     int $$9 = $$1.w() - $$2x.w();
                     int $$10 = azm.d(azm.c((float)($$8 * $$8 + $$9 * $$9)));
                     xj $$11 = xm.a((xj)xj.a("chat.coordinates", $$2x.u(), $$2x.v(), $$2x.w()))
                        .a($$1xx -> $$1xx.a(n.k).a(new xh(xh.a.d, $$7)).a(new xp(xp.a.a, xj.c("chat.coordinates.tooltip"))));
                     xj $$12 = xj.b("Found structure at: ").b($$11).f(" (distance: " + $$10 + ")");
                     this.a.a().a(() -> $$12, false);
                     $$0.increment();
                  }
               }
            );
         int $$2 = $$0.intValue();
         if ($$2 == 0) {
            ty.a(this.a.a().e(), "No such test structure found", n.m);
            return 0;
         } else {
            ty.a(this.a.a().e(), "Finished locating, found " + $$2 + " structure(s)", n.k);
            return 1;
         }
      }
   }

   static record b(ew a) implements tc {
      @Override
      public void a(ta $$0) {
         ty.c(this.a, "Starting batch: " + $$0.a());
      }

      @Override
      public void b(ta $$0) {
      }
   }

   public static record c(arp a, tr b) implements th {
      @Override
      public void a(tg $$0) {
      }

      @Override
      public void a(tg $$0, tj $$1) {
         a(this.a, this.b);
      }

      @Override
      public void b(tg $$0, tj $$1) {
         a(this.a, this.b);
      }

      @Override
      public void a(tg $$0, tg $$1, tj $$2) {
         this.b.a($$1);
      }

      private static void a(arp $$0, tr $$1) {
         if ($$1.i()) {
            ty.a($$0, "GameTest done! " + $$1.h() + " tests were run", n.p);
            if ($$1.d()) {
               ty.a($$0, $$1.a() + " required tests failed :(", n.m);
            } else {
               ty.a($$0, "All required tests passed :)", n.k);
            }

            if ($$1.e()) {
               ty.a($$0, $$1.b() + " optional tests failed", n.h);
            }
         }
      }
   }
}
