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

public class ts {
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
   private static final tt.a<ts.a> n = new tt.a<>(ts.a::new);

   private static ArgumentBuilder<et, ?> a(
      ArgumentBuilder<et, ?> $$0, Function<CommandContext<et>, ts.a> $$1, Function<ArgumentBuilder<et, ?>, ArgumentBuilder<et, ?>> $$2
   ) {
      return $$0.executes($$1x -> $$1.apply($$1x).d())
         .then(
            ((RequiredArgumentBuilder)eu.a("numberOfTimes", IntegerArgumentType.integer(0))
                  .executes($$1x -> $$1.apply($$1x).a(new tn(IntegerArgumentType.getInteger($$1x, "numberOfTimes"), false))))
               .then(
                  $$2.apply(
                     eu.a("untilFailed", BoolArgumentType.bool())
                        .executes(
                           $$1x -> $$1.apply($$1x)
                                 .a(new tn(IntegerArgumentType.getInteger($$1x, "numberOfTimes"), BoolArgumentType.getBool($$1x, "untilFailed")))
                        )
                  )
               )
         );
   }

   private static ArgumentBuilder<et, ?> a(ArgumentBuilder<et, ?> $$0, Function<CommandContext<et>, ts.a> $$1) {
      return a($$0, $$1, $$0x -> $$0x);
   }

   private static ArgumentBuilder<et, ?> b(ArgumentBuilder<et, ?> $$0, Function<CommandContext<et>, ts.a> $$1) {
      return a(
         $$0,
         $$1,
         $$1x -> $$1x.then(
               ((RequiredArgumentBuilder)eu.a("rotationSteps", IntegerArgumentType.integer())
                     .executes(
                        $$1xx -> $$1.apply($$1xx)
                              .a(
                                 new tn(IntegerArgumentType.getInteger($$1xx, "numberOfTimes"), BoolArgumentType.getBool($$1xx, "untilFailed")),
                                 IntegerArgumentType.getInteger($$1xx, "rotationSteps")
                              )
                     ))
                  .then(
                     eu.a("testsPerRow", IntegerArgumentType.integer())
                        .executes(
                           $$1xx -> $$1.apply($$1xx)
                                 .a(
                                    new tn(IntegerArgumentType.getInteger($$1xx, "numberOfTimes"), BoolArgumentType.getBool($$1xx, "untilFailed")),
                                    IntegerArgumentType.getInteger($$1xx, "rotationSteps"),
                                    IntegerArgumentType.getInteger($$1xx, "testsPerRow")
                                 )
                        )
                  )
            )
      );
   }

   public static void a(CommandDispatcher<et> $$0) {
      ArgumentBuilder<et, ?> $$1 = b(eu.a("onlyRequiredTests", BoolArgumentType.bool()), $$0x -> n.a($$0x, BoolArgumentType.getBool($$0x, "onlyRequiredTests")));
      ArgumentBuilder<et, ?> $$2 = b(eu.a("testClassName", tr.a()), $$0x -> n.a($$0x, tr.a($$0x, "testClassName")));
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)eu.a(
                                                                                    "test"
                                                                                 )
                                                                                 .then(
                                                                                    eu.a("run")
                                                                                       .then(b(eu.a("testName", tv.a()), $$0x -> n.b($$0x, "testName")))
                                                                                 ))
                                                                              .then(
                                                                                 eu.a("runmultiple")
                                                                                    .then(
                                                                                       ((RequiredArgumentBuilder)eu.a("testName", tv.a())
                                                                                             .executes($$0x -> n.b($$0x, "testName").d()))
                                                                                          .then(
                                                                                             eu.a("amount", IntegerArgumentType.integer())
                                                                                                .executes(
                                                                                                   $$0x -> n.a(IntegerArgumentType.getInteger($$0x, "amount"))
                                                                                                         .b($$0x, "testName")
                                                                                                         .d()
                                                                                                )
                                                                                          )
                                                                                    )
                                                                              ))
                                                                           .then(b(eu.a("runall").then($$2), n::d)))
                                                                        .then(a(eu.a("runthese"), n::b)))
                                                                     .then(a(eu.a("runclosest"), n::a)))
                                                                  .then(a(eu.a("runthat"), n::c)))
                                                               .then(b(eu.a("runfailed").then($$1), n::e)))
                                                            .then(eu.a("verify").then(eu.a("testName", tv.a()).executes($$0x -> n.b($$0x, "testName").f()))))
                                                         .then(
                                                            eu.a("verifyclass")
                                                               .then(eu.a("testClassName", tr.a()).executes($$0x -> n.a($$0x, tr.a($$0x, "testClassName")).f()))
                                                         ))
                                                      .then(
                                                         eu.a("locate")
                                                            .then(
                                                               eu.a("testName", tv.a())
                                                                  .executes($$0x -> n.c($$0x, "minecraft:" + tv.a($$0x, "testName").d()).e())
                                                            )
                                                      ))
                                                   .then(eu.a("resetclosest").executes($$0x -> n.a($$0x).a())))
                                                .then(eu.a("resetthese").executes($$0x -> n.b($$0x).a())))
                                             .then(eu.a("resetthat").executes($$0x -> n.c($$0x).a())))
                                          .then(
                                             eu.a("export")
                                                .then(
                                                   eu.a("testName", StringArgumentType.word())
                                                      .executes($$0x -> b((et)$$0x.getSource(), "minecraft:" + StringArgumentType.getString($$0x, "testName")))
                                                )
                                          ))
                                       .then(eu.a("exportclosest").executes($$0x -> n.a($$0x).c())))
                                    .then(eu.a("exportthese").executes($$0x -> n.b($$0x).c())))
                                 .then(eu.a("exportthat").executes($$0x -> n.c($$0x).c())))
                              .then(eu.a("clearthat").executes($$0x -> n.c($$0x).b())))
                           .then(eu.a("clearthese").executes($$0x -> n.b($$0x).b())))
                        .then(
                           ((LiteralArgumentBuilder)eu.a("clearall").executes($$0x -> n.a($$0x, 200).b()))
                              .then(
                                 eu.a("radius", IntegerArgumentType.integer())
                                    .executes($$0x -> n.a($$0x, azd.a(IntegerArgumentType.getInteger($$0x, "radius"), 0, 1024)).b())
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
                           .suggests(tv::a)
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

   private static int a(ta $$0) {
      $$0.f().a_(null, $$0.d()).stream().forEach($$0x -> $$0x.a(bto.c.b));
      $$0.e().c($$0.f());
      tq.a($$0.d(), $$0.f());
      a($$0.f(), "Reset succeded for: " + $$0.b(), n.k);
      return 1;
   }

   static Stream<ta> a(et $$0, tn $$1, to $$2) {
      return $$2.findStructureBlockPos().map($$2x -> a($$2x, $$0.e(), $$1)).flatMap(Optional::stream);
   }

   static Stream<ta> a(et $$0, tn $$1, tw $$2, int $$3) {
      return $$2.findTestFunctions().filter($$1x -> a($$0.e(), $$1x.d())).map($$3x -> new ta($$3x, tq.a($$3), $$0.e(), $$1));
   }

   private static Optional<ta> a(je $$0, arh $$1, tn $$2) {
      dtj $$3 = (dtj)$$1.c_($$0);
      if ($$3 == null) {
         a($$1, "Structure block entity could not be found", n.m);
         return Optional.empty();
      } else {
         String $$4 = $$3.u();
         Optional<tu> $$5 = tc.e($$4);
         if ($$5.isEmpty()) {
            a($$1, "Test function for test " + $$4 + " could not be found", n.m);
            return Optional.empty();
         } else {
            tu $$6 = $$5.get();
            ta $$7 = new ta($$6, $$3.t(), $$1, $$2);
            $$7.a($$0);
            return !a($$1, $$7.s()) ? Optional.empty() : Optional.of($$7);
         }
      }
   }

   private static int a(et $$0, String $$1, int $$2, int $$3, int $$4) {
      if ($$2 <= 48 && $$3 <= 48 && $$4 <= 48) {
         arh $$5 = $$0.e();
         je $$6 = a($$0).e();
         tq.a($$1.toLowerCase(), $$6, new ki($$2, $$3, $$4), dnx.a, $$5);
         je $$7 = $$6.d();
         je $$8 = $$7.b($$2 - 1, 0, $$4 - 1);
         je.d($$7, $$8).forEach($$1x -> $$5.b($$1x, dhl.F.o()));
         tq.a($$6, new je(1, 0, -1), dnx.a, $$5);
         return 0;
      } else {
         throw new IllegalArgumentException("The structure must be less than 48 blocks big in each axis");
      }
   }

   private static int a(et $$0, String $$1) throws CommandSyntaxException {
      eyo $$2 = (eyo)$$0.h().a(10.0, 1.0F, false);
      je $$3 = $$2.b();
      arh $$4 = $$0.e();
      Optional<je> $$5 = tq.a($$3, 15, $$4);
      if ($$5.isEmpty()) {
         $$5 = tq.a($$3, 200, $$4);
      }

      if ($$5.isEmpty()) {
         $$0.b(xd.b("Can't find a structure block that contains the targeted pos " + $$3));
         return 0;
      } else {
         dtj $$6 = (dtj)$$4.c_($$5.get());
         if ($$6 == null) {
            a($$4, "Structure block entity could not be found", n.m);
            return 0;
         } else {
            je $$7 = $$3.b($$5.get());
            String $$8 = $$7.u() + ", " + $$7.v() + ", " + $$7.w();
            String $$9 = $$6.u();
            xd $$10 = xd.b($$8)
               .b(
                  ya.a
                     .a(true)
                     .a(n.k)
                     .a(new xj(xj.a.a, xd.b("Click to copy to clipboard")))
                     .a(new xb(xb.a.f, "final BlockPos " + $$1 + " = new BlockPos(" + $$8 + ");"))
               );
            $$0.a(() -> xd.b("Position relative to " + $$9 + ": ").b($$10), false);
            agn.a($$4, new je($$3), $$8, -2147418368, 10000);
            return 1;
         }
      }
   }

   static int a() {
      tg.a.a();
      return 1;
   }

   static int a(et $$0, arh $$1, td $$2) {
      $$2.a(new ts.b($$0));
      tl $$3 = new tl($$2.a());
      $$3.a(new ts.c($$1, $$3));
      $$3.a($$0x -> tc.a($$0x.u()));
      $$2.b();
      return 1;
   }

   static int a(et $$0, dtj $$1) {
      String $$2 = $$1.c();
      if (!$$1.b(true)) {
         c($$0, "Failed to save structure " + $$2);
      }

      return b($$0, $$2);
   }

   private static int b(et $$0, String $$1) {
      Path $$2 = Paths.get(tq.c);
      alc $$3 = alc.a($$1);
      Path $$4 = $$0.e().q().a($$3, ".nbt");
      Path $$5 = pi.a(lz.a, $$4, $$3.a(), $$2);
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

   private static boolean a(arh $$0, String $$1) {
      if ($$0.q().b(alc.a($$1)).isEmpty()) {
         a($$0, "Test structure " + $$1 + " could not be found", n.m);
         return false;
      } else {
         return true;
      }
   }

   static je a(et $$0) {
      je $$1 = je.a((jx)$$0.d());
      int $$2 = $$0.e().a(eak.a.b, $$1).v();
      return new je($$1.u(), $$2 + 1, $$1.w() + 3);
   }

   static void c(et $$0, String $$1) {
      $$0.a(() -> xd.b($$1), false);
   }

   private static int d(et $$0, String $$1) {
      Path $$2 = Paths.get(tq.c, $$1 + ".snbt");
      alc $$3 = alc.b($$1);
      Path $$4 = $$0.e().q().a($$3, ".nbt");

      try {
         BufferedReader $$5 = Files.newBufferedReader($$2);
         String $$6 = IOUtils.toString($$5);
         Files.createDirectories($$4.getParent());

         try (OutputStream $$7 = Files.newOutputStream($$4)) {
            us.a(uu.a($$6), $$7);
         }

         $$0.e().q().d($$3);
         c($$0, "Imported to " + $$4.toAbsolutePath());
         return 0;
      } catch (CommandSyntaxException | IOException var12) {
         e.error("Failed to load structure {}", $$1, var12);
         return 1;
      }
   }

   static void a(arh $$0, String $$1, n $$2) {
      $$0.a($$0x -> true).forEach($$2x -> $$2x.a(xd.b($$1).a($$2)));
   }

   public static class a {
      private final tt<ts.a> a;

      public a(tt<ts.a> $$0) {
         this.a = $$0;
      }

      public int a() {
         ts.a();
         return ts.a(this.a.a(), tn.a(), this.a).map(ts::a).toList().isEmpty() ? 0 : 1;
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
         ts.a();
         et $$0 = this.a.a();
         arh $$1 = $$0.e();
         td.a($$1);
         this.a(this.a.findStructureBlockPos(), $$1x -> {
            dtj $$2 = (dtj)$$1.c_($$1x);
            if ($$2 == null) {
               return 0;
            } else {
               eku $$3 = tq.b($$2);
               tq.a($$3, $$1);
               return 1;
            }
         }, () -> ts.a($$1, "Could not find any structures to clear", n.m), $$1x -> ts.c($$0, "Cleared " + $$1x + " structures"));
         return 1;
      }

      public int c() {
         MutableBoolean $$0 = new MutableBoolean(true);
         et $$1 = this.a.a();
         arh $$2 = $$1.e();
         this.a(this.a.findStructureBlockPos(), $$3 -> {
            dtj $$4 = (dtj)$$2.c_($$3);
            if ($$4 == null) {
               ts.a($$2, "Structure block entity could not be found", n.m);
               $$0.setFalse();
               return 0;
            } else {
               if (ts.a($$1, $$4) != 0) {
                  $$0.setFalse();
               }

               return 1;
            }
         }, () -> ts.a($$2, "Could not find any structures to export", n.m), $$1x -> ts.c($$1, "Exported " + $$1x + " structures"));
         return $$0.getValue() ? 0 : 1;
      }

      int f() {
         ts.a();
         et $$0 = this.a.a();
         arh $$1 = $$0.e();
         je $$2 = ts.a($$0);
         Collection<ta> $$3 = Stream.concat(ts.a($$0, tn.a(), this.a), ts.a($$0, tn.a(), this.a, 0)).toList();
         td.a($$1);
         tc.d();
         Collection<su> $$4 = new ArrayList<>();

         for (ta $$5 : $$3) {
            for (dnx $$6 : dnx.values()) {
               Collection<ta> $$7 = new ArrayList<>();

               for (int $$8 = 0; $$8 < 100; $$8++) {
                  ta $$9 = new ta($$5.u(), $$6, $$1, new tn(1, true));
                  $$7.add($$9);
               }

               su $$10 = sv.a($$7, $$5.u().b(), (long)$$6.ordinal());
               $$4.add($$10);
            }
         }

         tp $$11 = new tp($$2, 10, true);
         td $$12 = td.a.a($$4, $$1).a(sv.a(100)).a((td.c)$$11).a($$11).a(true).a();
         return ts.a($$0, $$1, $$12);
      }

      public int a(tn $$0, int $$1, int $$2) {
         ts.a();
         et $$3 = this.a.a();
         arh $$4 = $$3.e();
         je $$5 = ts.a($$3);
         Collection<ta> $$6 = Stream.concat(ts.a($$3, $$0, this.a), ts.a($$3, $$0, this.a, $$1)).toList();
         if ($$6.isEmpty()) {
            ts.c($$3, "No tests found");
            return 0;
         } else {
            td.a($$4);
            tc.d();
            ts.c($$3, "Running " + $$6.size() + " tests...");
            td $$7 = td.a.b($$6, $$4).a((td.c)(new tp($$5, $$2, false))).a();
            return ts.a($$3, $$4, $$7);
         }
      }

      public int a(int $$0, int $$1) {
         return this.a(tn.a(), $$0, $$1);
      }

      public int a(int $$0) {
         return this.a(tn.a(), $$0, 8);
      }

      public int a(tn $$0, int $$1) {
         return this.a($$0, $$1, 8);
      }

      public int a(tn $$0) {
         return this.a($$0, 0, 8);
      }

      public int d() {
         return this.a(tn.a());
      }

      public int e() {
         ts.c(this.a.a(), "Started locating test structures, this might take a while..");
         MutableInt $$0 = new MutableInt(0);
         je $$1 = je.a((jx)this.a.a().d());
         this.a
            .findStructureBlockPos()
            .forEach(
               $$2x -> {
                  dtj $$3 = (dtj)this.a.a().e().c_($$2x);
                  if ($$3 != null) {
                     jj $$4 = $$3.t().a(jj.c);
                     je $$5 = $$3.aB_().a($$4, 2);
                     int $$6 = (int)$$4.g().p();
                     String $$7 = String.format("/tp @s %d %d %d %d 0", $$5.u(), $$5.v(), $$5.w(), $$6);
                     int $$8 = $$1.u() - $$2x.u();
                     int $$9 = $$1.w() - $$2x.w();
                     int $$10 = azd.d(azd.c((float)($$8 * $$8 + $$9 * $$9)));
                     xd $$11 = xg.a((xd)xd.a("chat.coordinates", $$2x.u(), $$2x.v(), $$2x.w()))
                        .a($$1xx -> $$1xx.a(n.k).a(new xb(xb.a.d, $$7)).a(new xj(xj.a.a, xd.c("chat.coordinates.tooltip"))));
                     xd $$12 = xd.b("Found structure at: ").b($$11).f(" (distance: " + $$10 + ")");
                     this.a.a().a(() -> $$12, false);
                     $$0.increment();
                  }
               }
            );
         int $$2 = $$0.intValue();
         if ($$2 == 0) {
            ts.a(this.a.a().e(), "No such test structure found", n.m);
            return 0;
         } else {
            ts.a(this.a.a().e(), "Finished locating, found " + $$2 + " structure(s)", n.k);
            return 1;
         }
      }
   }

   static record b(et a) implements sw {
      @Override
      public void a(su $$0) {
         ts.c(this.a, "Starting batch: " + $$0.a());
      }

      @Override
      public void b(su $$0) {
      }
   }

   public static record c(arh a, tl b) implements tb {
      @Override
      public void a(ta $$0) {
      }

      @Override
      public void a(ta $$0, td $$1) {
         a(this.a, this.b);
      }

      @Override
      public void b(ta $$0, td $$1) {
         a(this.a, this.b);
      }

      @Override
      public void a(ta $$0, ta $$1, td $$2) {
         this.b.a($$1);
      }

      private static void a(arh $$0, tl $$1) {
         if ($$1.i()) {
            ts.a($$0, "GameTest done! " + $$1.h() + " tests were run", n.p);
            if ($$1.d()) {
               ts.a($$0, $$1.a() + " required tests failed :(", n.m);
            } else {
               ts.a($$0, "All required tests passed :)", n.k);
            }

            if ($$1.e()) {
               ts.a($$0, $$1.b() + " optional tests failed", n.h);
            }
         }
      }
   }
}
