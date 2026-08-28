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

public class tl {
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
   private static final tm.a<tl.a> l = new tm.a<>(tl.a::new);

   private static ArgumentBuilder<eq, ?> a(
      ArgumentBuilder<eq, ?> $$0, Function<CommandContext<eq>, tl.a> $$1, Function<ArgumentBuilder<eq, ?>, ArgumentBuilder<eq, ?>> $$2
   ) {
      return $$0.executes($$1x -> $$1.apply($$1x).d())
         .then(
            ((RequiredArgumentBuilder)er.a("numberOfTimes", IntegerArgumentType.integer(0))
                  .executes($$1x -> $$1.apply($$1x).a(new tg(IntegerArgumentType.getInteger($$1x, "numberOfTimes"), false))))
               .then(
                  $$2.apply(
                     er.a("untilFailed", BoolArgumentType.bool())
                        .executes(
                           $$1x -> $$1.apply($$1x)
                                 .a(new tg(IntegerArgumentType.getInteger($$1x, "numberOfTimes"), BoolArgumentType.getBool($$1x, "untilFailed")))
                        )
                  )
               )
         );
   }

   private static ArgumentBuilder<eq, ?> a(ArgumentBuilder<eq, ?> $$0, Function<CommandContext<eq>, tl.a> $$1) {
      return a($$0, $$1, $$0x -> $$0x);
   }

   private static ArgumentBuilder<eq, ?> b(ArgumentBuilder<eq, ?> $$0, Function<CommandContext<eq>, tl.a> $$1) {
      return a(
         $$0,
         $$1,
         $$1x -> $$1x.then(
               ((RequiredArgumentBuilder)er.a("rotationSteps", IntegerArgumentType.integer())
                     .executes(
                        $$1xx -> $$1.apply($$1xx)
                              .a(
                                 new tg(IntegerArgumentType.getInteger($$1xx, "numberOfTimes"), BoolArgumentType.getBool($$1xx, "untilFailed")),
                                 IntegerArgumentType.getInteger($$1xx, "rotationSteps")
                              )
                     ))
                  .then(
                     er.a("testsPerRow", IntegerArgumentType.integer())
                        .executes(
                           $$1xx -> $$1.apply($$1xx)
                                 .a(
                                    new tg(IntegerArgumentType.getInteger($$1xx, "numberOfTimes"), BoolArgumentType.getBool($$1xx, "untilFailed")),
                                    IntegerArgumentType.getInteger($$1xx, "rotationSteps"),
                                    IntegerArgumentType.getInteger($$1xx, "testsPerRow")
                                 )
                        )
                  )
            )
      );
   }

   public static void a(CommandDispatcher<eq> $$0) {
      ArgumentBuilder<eq, ?> $$1 = b(er.a("onlyRequiredTests", BoolArgumentType.bool()), $$0x -> l.a($$0x, BoolArgumentType.getBool($$0x, "onlyRequiredTests")));
      ArgumentBuilder<eq, ?> $$2 = b(er.a("testClassName", tk.a()), $$0x -> l.a($$0x, tk.a($$0x, "testClassName")));
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)er.a(
                                                                              "test"
                                                                           )
                                                                           .then(er.a("run").then(b(er.a("testName", to.a()), $$0x -> l.b($$0x, "testName")))))
                                                                        .then(
                                                                           er.a("runmultiple")
                                                                              .then(
                                                                                 ((RequiredArgumentBuilder)er.a("testName", to.a())
                                                                                       .executes($$0x -> l.b($$0x, "testName").d()))
                                                                                    .then(
                                                                                       er.a("amount", IntegerArgumentType.integer())
                                                                                          .executes(
                                                                                             $$0x -> l.a(IntegerArgumentType.getInteger($$0x, "amount"))
                                                                                                   .b($$0x, "testName")
                                                                                                   .d()
                                                                                          )
                                                                                    )
                                                                              )
                                                                        ))
                                                                     .then(b(er.a("runall").then($$2), l::d)))
                                                                  .then(a(er.a("runthese"), l::b)))
                                                               .then(a(er.a("runclosest"), l::a)))
                                                            .then(a(er.a("runthat"), l::c)))
                                                         .then(b(er.a("runfailed").then($$1), l::e)))
                                                      .then(
                                                         er.a("locate")
                                                            .then(
                                                               er.a("testName", to.a())
                                                                  .executes($$0x -> l.c($$0x, "minecraft:" + to.a($$0x, "testName").d()).e())
                                                            )
                                                      ))
                                                   .then(er.a("resetclosest").executes($$0x -> l.a($$0x).a())))
                                                .then(er.a("resetthese").executes($$0x -> l.b($$0x).a())))
                                             .then(er.a("resetthat").executes($$0x -> l.c($$0x).a())))
                                          .then(
                                             er.a("export")
                                                .then(
                                                   er.a("testName", StringArgumentType.word())
                                                      .executes($$0x -> b((eq)$$0x.getSource(), "minecraft:" + StringArgumentType.getString($$0x, "testName")))
                                                )
                                          ))
                                       .then(er.a("exportclosest").executes($$0x -> l.a($$0x).c())))
                                    .then(er.a("exportthese").executes($$0x -> l.b($$0x).c())))
                                 .then(er.a("exportthat").executes($$0x -> l.c($$0x).c())))
                              .then(er.a("clearthat").executes($$0x -> l.c($$0x).b())))
                           .then(er.a("clearthese").executes($$0x -> l.b($$0x).b())))
                        .then(
                           ((LiteralArgumentBuilder)er.a("clearall").executes($$0x -> l.a($$0x, 200).b()))
                              .then(
                                 er.a("radius", IntegerArgumentType.integer())
                                    .executes($$0x -> l.a($$0x, ayg.a(IntegerArgumentType.getInteger($$0x, "radius"), 0, 1024)).b())
                              )
                        ))
                     .then(
                        er.a("import")
                           .then(
                              er.a("testName", StringArgumentType.word())
                                 .executes($$0x -> d((eq)$$0x.getSource(), StringArgumentType.getString($$0x, "testName")))
                           )
                     ))
                  .then(er.a("stop").executes($$0x -> a())))
               .then(
                  ((LiteralArgumentBuilder)er.a("pos").executes($$0x -> a((eq)$$0x.getSource(), "pos")))
                     .then(er.a("var", StringArgumentType.word()).executes($$0x -> a((eq)$$0x.getSource(), StringArgumentType.getString($$0x, "var"))))
               ))
            .then(
               er.a("create")
                  .then(
                     ((RequiredArgumentBuilder)er.a("testName", StringArgumentType.word())
                           .suggests(to::a)
                           .executes($$0x -> a((eq)$$0x.getSource(), StringArgumentType.getString($$0x, "testName"), 5, 5, 5)))
                        .then(
                           ((RequiredArgumentBuilder)er.a("width", IntegerArgumentType.integer())
                                 .executes(
                                    $$0x -> a(
                                          (eq)$$0x.getSource(),
                                          StringArgumentType.getString($$0x, "testName"),
                                          IntegerArgumentType.getInteger($$0x, "width"),
                                          IntegerArgumentType.getInteger($$0x, "width"),
                                          IntegerArgumentType.getInteger($$0x, "width")
                                       )
                                 ))
                              .then(
                                 er.a("height", IntegerArgumentType.integer())
                                    .then(
                                       er.a("depth", IntegerArgumentType.integer())
                                          .executes(
                                             $$0x -> a(
                                                   (eq)$$0x.getSource(),
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

   private static int a(st $$0) {
      $$0.f().a_(null, $$0.d()).stream().forEach($$0x -> $$0x.a(bsh.d.b));
      $$0.e().c($$0.f());
      tj.a($$0.d(), $$0.f());
      a($$0.f(), "Reset succeded for: " + $$0.b(), n.k);
      return 1;
   }

   static Stream<st> a(eq $$0, tg $$1, th $$2) {
      return $$2.findStructureBlockPos().map($$2x -> a($$2x, $$0.e(), $$1)).flatMap(Optional::stream);
   }

   static Stream<st> a(eq $$0, tg $$1, tp $$2, int $$3) {
      return $$2.findTestFunctions().filter($$1x -> a($$0.e(), $$1x.d())).map($$3x -> new st($$3x, tj.a($$3), $$0.e(), $$1));
   }

   private static Optional<st> a(ja $$0, aqm $$1, tg $$2) {
      drg $$3 = (drg)$$1.c_($$0);
      if ($$3 == null) {
         a($$1, "Structure block entity could not be found", n.m);
         return Optional.empty();
      } else {
         String $$4 = $$3.u();
         Optional<tn> $$5 = sv.e($$4);
         if ($$5.isEmpty()) {
            a($$1, "Test function for test " + $$4 + " could not be found", n.m);
            return Optional.empty();
         } else {
            tn $$6 = $$5.get();
            st $$7 = new st($$6, $$3.l(), $$1, $$2);
            $$7.a($$0);
            return !a($$1, $$7.s()) ? Optional.empty() : Optional.of($$7);
         }
      }
   }

   private static int a(eq $$0, String $$1, int $$2, int $$3, int $$4) {
      if ($$2 <= 48 && $$3 <= 48 && $$4 <= 48) {
         aqm $$5 = $$0.e();
         ja $$6 = a($$0).d();
         tj.a($$1.toLowerCase(), $$6, new ke($$2, $$3, $$4), dlv.a, $$5);
         ja $$7 = $$6.c();
         ja $$8 = $$7.b($$2 - 1, 0, $$4 - 1);
         ja.d($$7, $$8).forEach($$1x -> $$5.b($$1x, dfk.F.o()));
         tj.a($$6, new ja(1, 0, -1), dlv.a, $$5);
         return 0;
      } else {
         throw new IllegalArgumentException("The structure must be less than 48 blocks big in each axis");
      }
   }

   private static int a(eq $$0, String $$1) throws CommandSyntaxException {
      ewd $$2 = (ewd)$$0.h().a(10.0, 1.0F, false);
      ja $$3 = $$2.a();
      aqm $$4 = $$0.e();
      Optional<ja> $$5 = tj.a($$3, 15, $$4);
      if ($$5.isEmpty()) {
         $$5 = tj.a($$3, 200, $$4);
      }

      if ($$5.isEmpty()) {
         $$0.b(wu.b("Can't find a structure block that contains the targeted pos " + $$3));
         return 0;
      } else {
         drg $$6 = (drg)$$4.c_($$5.get());
         if ($$6 == null) {
            a($$4, "Structure block entity could not be found", n.m);
            return 0;
         } else {
            ja $$7 = $$3.b($$5.get());
            String $$8 = $$7.u() + ", " + $$7.v() + ", " + $$7.w();
            String $$9 = $$6.u();
            wu $$10 = wu.b($$8)
               .b(
                  xr.a
                     .a(true)
                     .a(n.k)
                     .a(new xa(xa.a.a, wu.b("Click to copy to clipboard")))
                     .a(new ws(ws.a.f, "final BlockPos " + $$1 + " = new BlockPos(" + $$8 + ");"))
               );
            $$0.a(() -> wu.b("Position relative to " + $$9 + ": ").b($$10), false);
            afy.a($$4, new ja($$3), $$8, -2147418368, 10000);
            return 1;
         }
      }
   }

   static int a() {
      sz.a.a();
      return 1;
   }

   static int a(eq $$0, aqm $$1, sw $$2) {
      $$2.a(new tl.b($$0));
      te $$3 = new te($$2.a());
      $$3.a(new tl.c($$1, $$3));
      $$3.a($$0x -> sv.a($$0x.u()));
      $$2.b();
      return 1;
   }

   static int a(eq $$0, drg $$1) {
      String $$2 = $$1.c();
      if (!$$1.b(true)) {
         c($$0, "Failed to save structure " + $$2);
      }

      return b($$0, $$2);
   }

   private static int b(eq $$0, String $$1) {
      Path $$2 = Paths.get(tj.c);
      akk $$3 = new akk($$1);
      Path $$4 = $$0.e().q().a($$3, ".nbt");
      Path $$5 = pb.a(lv.a, $$4, $$3.a(), $$2);
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
      if ($$0.q().b(new akk($$1)).isEmpty()) {
         a($$0, "Test structure " + $$1 + " could not be found", n.m);
         return false;
      } else {
         return true;
      }
   }

   static ja a(eq $$0) {
      ja $$1 = ja.a($$0.d());
      int $$2 = $$0.e().a(dyg.a.b, $$1).v();
      return new ja($$1.u(), $$2 + 1, $$1.w() + 3);
   }

   static void c(eq $$0, String $$1) {
      $$0.a(() -> wu.b($$1), false);
   }

   private static int d(eq $$0, String $$1) {
      Path $$2 = Paths.get(tj.c, $$1 + ".snbt");
      akk $$3 = new akk("minecraft", $$1);
      Path $$4 = $$0.e().q().a($$3, ".nbt");

      try {
         BufferedReader $$5 = Files.newBufferedReader($$2);
         String $$6 = IOUtils.toString($$5);
         Files.createDirectories($$4.getParent());

         try (OutputStream $$7 = Files.newOutputStream($$4)) {
            uk.a(um.a($$6), $$7);
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
      $$0.a($$0x -> true).forEach($$2x -> $$2x.a(wu.b($$1).a($$2)));
   }

   public static class a {
      private final tm<tl.a> a;

      public a(tm<tl.a> $$0) {
         this.a = $$0;
      }

      public int a() {
         tl.a();
         return tl.a(this.a.a(), tg.a(), this.a).map(tl::a).toList().isEmpty() ? 0 : 1;
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
         tl.a();
         eq $$0 = this.a.a();
         aqm $$1 = $$0.e();
         sw.a($$1);
         this.a(this.a.findStructureBlockPos(), $$1x -> {
            drg $$2 = (drg)$$1.c_($$1x);
            if ($$2 == null) {
               return 0;
            } else {
               eip $$3 = tj.b($$2);
               tj.a($$3, $$1);
               return 1;
            }
         }, () -> tl.a($$1, "Could not find any structures to clear", n.m), $$1x -> tl.c($$0, "Cleared " + $$1x + " structures"));
         return 1;
      }

      public int c() {
         MutableBoolean $$0 = new MutableBoolean(true);
         eq $$1 = this.a.a();
         aqm $$2 = $$1.e();
         this.a(this.a.findStructureBlockPos(), $$3 -> {
            drg $$4 = (drg)$$2.c_($$3);
            if ($$4 == null) {
               tl.a($$2, "Structure block entity could not be found", n.m);
               $$0.setFalse();
               return 0;
            } else {
               if (tl.a($$1, $$4) != 0) {
                  $$0.setFalse();
               }

               return 1;
            }
         }, () -> tl.a($$2, "Could not find any structures to export", n.m), $$1x -> tl.c($$1, "Exported " + $$1x + " structures"));
         return $$0.getValue() ? 0 : 1;
      }

      public int a(tg $$0, int $$1, int $$2) {
         tl.a();
         eq $$3 = this.a.a();
         aqm $$4 = $$3.e();
         ja $$5 = tl.a($$3);
         Collection<st> $$6 = Stream.concat(tl.a($$3, $$0, this.a), tl.a($$3, $$0, this.a, $$1)).toList();
         if ($$6.isEmpty()) {
            tl.c($$3, "No tests found");
            return 0;
         } else {
            sw.a($$4);
            sv.d();
            tl.c($$3, "Running " + $$6.size() + " tests...");
            sw $$7 = sw.a.b($$6, $$4).a(new ti($$5, $$2)).a();
            return tl.a($$3, $$4, $$7);
         }
      }

      public int a(int $$0, int $$1) {
         return this.a(tg.a(), $$0, $$1);
      }

      public int a(int $$0) {
         return this.a(tg.a(), $$0, 8);
      }

      public int a(tg $$0, int $$1) {
         return this.a($$0, $$1, 8);
      }

      public int a(tg $$0) {
         return this.a($$0, 0, 8);
      }

      public int d() {
         return this.a(tg.a());
      }

      public int e() {
         tl.c(this.a.a(), "Started locating test structures, this might take a while..");
         MutableInt $$0 = new MutableInt(0);
         ja $$1 = ja.a(this.a.a().d());
         this.a
            .findStructureBlockPos()
            .forEach(
               $$2x -> {
                  drg $$3 = (drg)this.a.a().e().c_($$2x);
                  if ($$3 != null) {
                     jf $$4 = $$3.l().a(jf.c);
                     ja $$5 = $$3.az_().a($$4, 2);
                     int $$6 = (int)$$4.g().p();
                     String $$7 = String.format("/tp @s %d %d %d %d 0", $$5.u(), $$5.v(), $$5.w(), $$6);
                     int $$8 = $$1.u() - $$2x.u();
                     int $$9 = $$1.w() - $$2x.w();
                     int $$10 = ayg.d(ayg.c((float)($$8 * $$8 + $$9 * $$9)));
                     wu $$11 = wx.a((wu)wu.a("chat.coordinates", $$2x.u(), $$2x.v(), $$2x.w()))
                        .a($$1xx -> $$1xx.a(n.k).a(new ws(ws.a.d, $$7)).a(new xa(xa.a.a, wu.c("chat.coordinates.tooltip"))));
                     wu $$12 = wu.b("Found structure at: ").b($$11).f(" (distance: " + $$10 + ")");
                     this.a.a().a(() -> $$12, false);
                     $$0.increment();
                  }
               }
            );
         int $$2 = $$0.intValue();
         if ($$2 == 0) {
            tl.a(this.a.a().e(), "No such test structure found", n.m);
            return 0;
         } else {
            tl.a(this.a.a().e(), "Finished locating, found " + $$2 + " structure(s)", n.k);
            return 1;
         }
      }
   }

   static record b(eq a) implements sp {
      @Override
      public void a(sn $$0) {
         tl.c(this.a, "Starting batch: " + $$0.a());
      }

      @Override
      public void b(sn $$0) {
      }
   }

   public static record c(aqm a, te b) implements su {
      @Override
      public void a(st $$0) {
      }

      @Override
      public void a(st $$0, sw $$1) {
         a(this.a, this.b);
      }

      @Override
      public void b(st $$0, sw $$1) {
         a(this.a, this.b);
      }

      @Override
      public void a(st $$0, st $$1, sw $$2) {
         this.b.a($$1);
      }

      private static void a(aqm $$0, te $$1) {
         if ($$1.i()) {
            tl.a($$0, "GameTest done! " + $$1.h() + " tests were run", n.p);
            if ($$1.d()) {
               tl.a($$0, $$1.a() + " required tests failed :(", n.m);
            } else {
               tl.a($$0, "All required tests passed :)", n.k);
            }

            if ($$1.e()) {
               tl.a($$0, $$1.b() + " optional tests failed", n.h);
            }
         }
      }
   }
}
