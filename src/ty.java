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

public class ty {
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
   private static final tz.a<ty.a> l = new tz.a<>(ty.a::new);

   private static ArgumentBuilder<eh, ?> a(
      ArgumentBuilder<eh, ?> $$0, Function<CommandContext<eh>, ty.a> $$1, Function<ArgumentBuilder<eh, ?>, ArgumentBuilder<eh, ?>> $$2
   ) {
      return $$0.executes($$1x -> $$1.apply($$1x).d())
         .then(
            ((RequiredArgumentBuilder)ei.a("numberOfTimes", IntegerArgumentType.integer(0))
                  .executes($$1x -> $$1.apply($$1x).a(new tt(IntegerArgumentType.getInteger($$1x, "numberOfTimes"), false))))
               .then(
                  $$2.apply(
                     ei.a("untilFailed", BoolArgumentType.bool())
                        .executes(
                           $$1x -> $$1.apply($$1x)
                                 .a(new tt(IntegerArgumentType.getInteger($$1x, "numberOfTimes"), BoolArgumentType.getBool($$1x, "untilFailed")))
                        )
                  )
               )
         );
   }

   private static ArgumentBuilder<eh, ?> a(ArgumentBuilder<eh, ?> $$0, Function<CommandContext<eh>, ty.a> $$1) {
      return a($$0, $$1, $$0x -> $$0x);
   }

   private static ArgumentBuilder<eh, ?> b(ArgumentBuilder<eh, ?> $$0, Function<CommandContext<eh>, ty.a> $$1) {
      return a(
         $$0,
         $$1,
         $$1x -> $$1x.then(
               ((RequiredArgumentBuilder)ei.a("rotationSteps", IntegerArgumentType.integer())
                     .executes(
                        $$1xx -> $$1.apply($$1xx)
                              .a(
                                 new tt(IntegerArgumentType.getInteger($$1xx, "numberOfTimes"), BoolArgumentType.getBool($$1xx, "untilFailed")),
                                 IntegerArgumentType.getInteger($$1xx, "rotationSteps")
                              )
                     ))
                  .then(
                     ei.a("testsPerRow", IntegerArgumentType.integer())
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

   public static void a(CommandDispatcher<eh> $$0) {
      ArgumentBuilder<eh, ?> $$1 = b(ei.a("onlyRequiredTests", BoolArgumentType.bool()), $$0x -> l.a($$0x, BoolArgumentType.getBool($$0x, "onlyRequiredTests")));
      ArgumentBuilder<eh, ?> $$2 = b(ei.a("testClassName", tx.a()), $$0x -> l.a($$0x, tx.a($$0x, "testClassName")));
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ei.a(
                                                                           "test"
                                                                        )
                                                                        .then(ei.a("run").then(b(ei.a("testName", ub.a()), $$0x -> l.b($$0x, "testName")))))
                                                                     .then(
                                                                        ei.a("runmultiple")
                                                                           .then(
                                                                              ((RequiredArgumentBuilder)ei.a("testName", ub.a())
                                                                                    .executes($$0x -> l.b($$0x, "testName").d()))
                                                                                 .then(
                                                                                    ei.a("amount", IntegerArgumentType.integer())
                                                                                       .executes(
                                                                                          $$0x -> l.a(IntegerArgumentType.getInteger($$0x, "amount"))
                                                                                                .b($$0x, "testName")
                                                                                                .d()
                                                                                       )
                                                                                 )
                                                                           )
                                                                     ))
                                                                  .then(b(ei.a("runall").then($$2), l::d)))
                                                               .then(a(ei.a("runthese"), l::b)))
                                                            .then(a(ei.a("runclosest"), l::a)))
                                                         .then(a(ei.a("runthat"), l::c)))
                                                      .then(b(ei.a("runfailed").then($$1), l::e)))
                                                   .then(ei.a("resetclosest").executes($$0x -> l.a($$0x).a())))
                                                .then(ei.a("resetthese").executes($$0x -> l.b($$0x).a())))
                                             .then(ei.a("resetthat").executes($$0x -> l.c($$0x).a())))
                                          .then(
                                             ei.a("export")
                                                .then(
                                                   ei.a("testName", StringArgumentType.word())
                                                      .executes($$0x -> b((eh)$$0x.getSource(), "minecraft:" + StringArgumentType.getString($$0x, "testName")))
                                                )
                                          ))
                                       .then(ei.a("exportclosest").executes($$0x -> l.a($$0x).c())))
                                    .then(ei.a("exportthese").executes($$0x -> l.b($$0x).c())))
                                 .then(ei.a("exportthat").executes($$0x -> l.c($$0x).c())))
                              .then(ei.a("clearthat").executes($$0x -> l.c($$0x).b())))
                           .then(ei.a("clearthese").executes($$0x -> l.b($$0x).b())))
                        .then(
                           ((LiteralArgumentBuilder)ei.a("clearall").executes($$0x -> l.a($$0x, 200).b()))
                              .then(
                                 ei.a("radius", IntegerArgumentType.integer())
                                    .executes($$0x -> l.a($$0x, aym.a(IntegerArgumentType.getInteger($$0x, "radius"), 0, 1024)).b())
                              )
                        ))
                     .then(
                        ei.a("import")
                           .then(
                              ei.a("testName", StringArgumentType.word())
                                 .executes($$0x -> d((eh)$$0x.getSource(), StringArgumentType.getString($$0x, "testName")))
                           )
                     ))
                  .then(ei.a("stop").executes($$0x -> a())))
               .then(
                  ((LiteralArgumentBuilder)ei.a("pos").executes($$0x -> a((eh)$$0x.getSource(), "pos")))
                     .then(ei.a("var", StringArgumentType.word()).executes($$0x -> a((eh)$$0x.getSource(), StringArgumentType.getString($$0x, "var"))))
               ))
            .then(
               ei.a("create")
                  .then(
                     ((RequiredArgumentBuilder)ei.a("testName", StringArgumentType.word())
                           .suggests(ub::a)
                           .executes($$0x -> a((eh)$$0x.getSource(), StringArgumentType.getString($$0x, "testName"), 5, 5, 5)))
                        .then(
                           ((RequiredArgumentBuilder)ei.a("width", IntegerArgumentType.integer())
                                 .executes(
                                    $$0x -> a(
                                          (eh)$$0x.getSource(),
                                          StringArgumentType.getString($$0x, "testName"),
                                          IntegerArgumentType.getInteger($$0x, "width"),
                                          IntegerArgumentType.getInteger($$0x, "width"),
                                          IntegerArgumentType.getInteger($$0x, "width")
                                       )
                                 ))
                              .then(
                                 ei.a("height", IntegerArgumentType.integer())
                                    .then(
                                       ei.a("depth", IntegerArgumentType.integer())
                                          .executes(
                                             $$0x -> a(
                                                   (eh)$$0x.getSource(),
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
      $$0.f().a_(null, $$0.d()).stream().forEach($$0x -> $$0x.a(brv.d.b));
      $$0.e().c($$0.f());
      tw.a($$0.d(), $$0.f());
      a($$0.f(), "Reset succeded for: " + $$0.b(), n.k);
      return 1;
   }

   static Stream<tg> a(eh $$0, tt $$1, tu $$2) {
      return $$2.findStructureBlockPos().map($$2x -> a($$2x, $$0.e(), $$1)).flatMap(Optional::stream);
   }

   static Stream<tg> a(eh $$0, tt $$1, uc $$2, int $$3) {
      return $$2.findTestFunctions().filter($$1x -> a($$0.e(), $$1x.d())).map($$3x -> new tg($$3x, tw.a($$3), $$0.e(), $$1));
   }

   private static Optional<tg> a(ir $$0, aqt $$1, tt $$2) {
      drw $$3 = (drw)$$1.c_($$0);
      if ($$3 == null) {
         a($$1, "Structure block entity could not be found", n.m);
         return Optional.empty();
      } else {
         String $$4 = $$3.t();
         Optional<ua> $$5 = ti.e($$4);
         if ($$5.isEmpty()) {
            a($$1, "Test function for test " + $$4 + " could not be found", n.m);
            return Optional.empty();
         } else {
            ua $$6 = $$5.get();
            tg $$7 = new tg($$6, $$3.l(), $$1, $$2);
            $$7.a($$0);
            return !a($$1, $$7.s()) ? Optional.empty() : Optional.of($$7);
         }
      }
   }

   private static int a(eh $$0, String $$1, int $$2, int $$3, int $$4) {
      if ($$2 <= 48 && $$3 <= 48 && $$4 <= 48) {
         aqt $$5 = $$0.e();
         ir $$6 = a($$0).d();
         tw.a($$1.toLowerCase(), $$6, new jv($$2, $$3, $$4), dmd.a, $$5);
         ir $$7 = $$6.c();
         ir $$8 = $$7.b($$2 - 1, 0, $$4 - 1);
         ir.d($$7, $$8).forEach($$1x -> $$5.b($$1x, dfe.ak.n()));
         tw.a($$6, new ir(1, 0, -1), dmd.a, $$5);
         return 0;
      } else {
         throw new IllegalArgumentException("The structure must be less than 48 blocks big in each axis");
      }
   }

   private static int a(eh $$0, String $$1) throws CommandSyntaxException {
      ewq $$2 = (ewq)$$0.h().a(10.0, 1.0F, false);
      ir $$3 = $$2.a();
      aqt $$4 = $$0.e();
      Optional<ir> $$5 = tw.a($$3, 15, $$4);
      if ($$5.isEmpty()) {
         $$5 = tw.a($$3, 200, $$4);
      }

      if ($$5.isEmpty()) {
         $$0.b(xe.b("Can't find a structure block that contains the targeted pos " + $$3));
         return 0;
      } else {
         drw $$6 = (drw)$$4.c_($$5.get());
         if ($$6 == null) {
            a($$4, "Structure block entity could not be found", n.m);
            return 0;
         } else {
            ir $$7 = $$3.b($$5.get());
            String $$8 = $$7.u() + ", " + $$7.v() + ", " + $$7.w();
            String $$9 = $$6.t();
            xe $$10 = xe.b($$8)
               .b(
                  yb.a
                     .a(true)
                     .a(n.k)
                     .a(new xk(xk.a.a, xe.b("Click to copy to clipboard")))
                     .a(new xc(xc.a.f, "final BlockPos " + $$1 + " = new BlockPos(" + $$8 + ");"))
               );
            $$0.a(() -> xe.b("Position relative to " + $$9 + ": ").a($$10), false);
            agi.a($$4, new ir($$3), $$8, -2147418368, 10000);
            return 1;
         }
      }
   }

   static int a() {
      tm.a.a();
      return 1;
   }

   static int a(eh $$0, aqt $$1, tj $$2) {
      $$2.a(new ty.b($$0));
      tr $$3 = new tr($$2.a());
      $$3.a(new ty.c($$1, $$3));
      $$3.a($$0x -> ti.a($$0x.u()));
      $$2.b();
      return 1;
   }

   static int a(eh $$0, drw $$1) {
      String $$2 = $$1.c();
      if (!$$1.b(true)) {
         c($$0, "Failed to save structure " + $$2);
      }

      return b($$0, $$2);
   }

   private static int b(eh $$0, String $$1) {
      Path $$2 = Paths.get(tw.b);
      akt $$3 = new akt($$1);
      Path $$4 = $$0.e().q().a($$3, ".nbt");
      Path $$5 = pa.a(lm.a, $$4, $$3.a(), $$2);
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

   private static boolean a(aqt $$0, String $$1) {
      if ($$0.q().b(new akt($$1)).isEmpty()) {
         a($$0, "Test structure " + $$1 + " could not be found", n.m);
         return false;
      } else {
         return true;
      }
   }

   static ir a(eh $$0) {
      ir $$1 = ir.a($$0.d());
      int $$2 = $$0.e().a(dyu.a.b, $$1).v();
      return new ir($$1.u(), $$2 + 1, $$1.w() + 3);
   }

   static void c(eh $$0, String $$1) {
      $$0.a(() -> xe.b($$1), false);
   }

   private static int d(eh $$0, String $$1) {
      Path $$2 = Paths.get(tw.b, $$1 + ".snbt");
      akt $$3 = new akt("minecraft", $$1);
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
         c.error("Failed to load structure {}", $$1, var12);
         return 1;
      }
   }

   static void a(aqt $$0, String $$1, n $$2) {
      $$0.a($$0x -> true).forEach($$2x -> $$2x.a(xe.b($$1).a($$2)));
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
         eh $$0 = this.a.a();
         aqt $$1 = $$0.e();
         tj.a($$1);
         this.a(this.a.findStructureBlockPos(), $$1x -> {
            drw $$2 = (drw)$$1.c_($$1x);
            if ($$2 == null) {
               return 0;
            } else {
               ejl $$3 = tw.b($$2);
               tw.a($$3, $$1);
               return 1;
            }
         }, () -> ty.a($$1, "Could not find any structures to clear", n.m), $$1x -> ty.c($$0, "Cleared " + $$1x + " structures"));
         return 1;
      }

      public int c() {
         MutableBoolean $$0 = new MutableBoolean(true);
         eh $$1 = this.a.a();
         aqt $$2 = $$1.e();
         this.a(this.a.findStructureBlockPos(), $$3 -> {
            drw $$4 = (drw)$$2.c_($$3);
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

      public int a(tt $$0, int $$1, int $$2) {
         ty.a();
         eh $$3 = this.a.a();
         aqt $$4 = $$3.e();
         ir $$5 = ty.a($$3);
         Collection<tg> $$6 = Stream.concat(ty.a($$3, $$0, this.a), ty.a($$3, $$0, this.a, $$1)).toList();
         if ($$6.isEmpty()) {
            ty.c($$3, "No tests found");
            return 0;
         } else {
            tj.a($$4);
            ti.d();
            ty.c($$3, "Running " + $$6.size() + " tests...");
            tj $$7 = tj.a.b($$6, $$4).a(new tv($$5, $$2)).a();
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
   }

   static record b(eh a) implements tc {
      @Override
      public void a(ta $$0) {
         ty.c(this.a, "Starting batch: " + $$0.a());
      }

      @Override
      public void b(ta $$0) {
      }
   }

   public static record c(aqt a, tr b) implements th {
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

      private static void a(aqt $$0, tr $$1) {
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
