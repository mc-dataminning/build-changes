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

public class tc {
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
   private static final td.a<tc.a> l = new td.a<>(tc.a::new);

   private static ArgumentBuilder<dv, ?> a(
      ArgumentBuilder<dv, ?> $$0, Function<CommandContext<dv>, tc.a> $$1, Function<ArgumentBuilder<dv, ?>, ArgumentBuilder<dv, ?>> $$2
   ) {
      return $$0.executes($$1x -> $$1.apply($$1x).d())
         .then(
            ((RequiredArgumentBuilder)dw.a("numberOfTimes", IntegerArgumentType.integer(0))
                  .executes($$1x -> $$1.apply($$1x).a(new sx(IntegerArgumentType.getInteger($$1x, "numberOfTimes"), false))))
               .then(
                  $$2.apply(
                     dw.a("untilFailed", BoolArgumentType.bool())
                        .executes(
                           $$1x -> $$1.apply($$1x)
                                 .a(new sx(IntegerArgumentType.getInteger($$1x, "numberOfTimes"), BoolArgumentType.getBool($$1x, "untilFailed")))
                        )
                  )
               )
         );
   }

   private static ArgumentBuilder<dv, ?> a(ArgumentBuilder<dv, ?> $$0, Function<CommandContext<dv>, tc.a> $$1) {
      return a($$0, $$1, $$0x -> $$0x);
   }

   private static ArgumentBuilder<dv, ?> b(ArgumentBuilder<dv, ?> $$0, Function<CommandContext<dv>, tc.a> $$1) {
      return a(
         $$0,
         $$1,
         $$1x -> $$1x.then(
               ((RequiredArgumentBuilder)dw.a("rotationSteps", IntegerArgumentType.integer())
                     .executes(
                        $$1xx -> $$1.apply($$1xx)
                              .a(
                                 new sx(IntegerArgumentType.getInteger($$1xx, "numberOfTimes"), BoolArgumentType.getBool($$1xx, "untilFailed")),
                                 IntegerArgumentType.getInteger($$1xx, "rotationSteps")
                              )
                     ))
                  .then(
                     dw.a("testsPerRow", IntegerArgumentType.integer())
                        .executes(
                           $$1xx -> $$1.apply($$1xx)
                                 .a(
                                    new sx(IntegerArgumentType.getInteger($$1xx, "numberOfTimes"), BoolArgumentType.getBool($$1xx, "untilFailed")),
                                    IntegerArgumentType.getInteger($$1xx, "rotationSteps"),
                                    IntegerArgumentType.getInteger($$1xx, "testsPerRow")
                                 )
                        )
                  )
            )
      );
   }

   public static void a(CommandDispatcher<dv> $$0) {
      ArgumentBuilder<dv, ?> $$1 = b(dw.a("onlyRequiredTests", BoolArgumentType.bool()), $$0x -> l.a($$0x, BoolArgumentType.getBool($$0x, "onlyRequiredTests")));
      ArgumentBuilder<dv, ?> $$2 = b(dw.a("testClassName", tb.a()), $$0x -> l.a($$0x, tb.a($$0x, "testClassName")));
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dw.a(
                                                                           "test"
                                                                        )
                                                                        .then(dw.a("run").then(b(dw.a("testName", tf.a()), $$0x -> l.b($$0x, "testName")))))
                                                                     .then(
                                                                        dw.a("runmultiple")
                                                                           .then(
                                                                              ((RequiredArgumentBuilder)dw.a("testName", tf.a())
                                                                                    .executes($$0x -> l.b($$0x, "testName").d()))
                                                                                 .then(
                                                                                    dw.a("amount", IntegerArgumentType.integer())
                                                                                       .executes(
                                                                                          $$0x -> l.a(IntegerArgumentType.getInteger($$0x, "amount"))
                                                                                                .b($$0x, "testName")
                                                                                                .d()
                                                                                       )
                                                                                 )
                                                                           )
                                                                     ))
                                                                  .then(b(dw.a("runall").then($$2), l::d)))
                                                               .then(a(dw.a("runthese"), l::b)))
                                                            .then(a(dw.a("runclosest"), l::a)))
                                                         .then(a(dw.a("runthat"), l::c)))
                                                      .then(b(dw.a("runfailed").then($$1), l::e)))
                                                   .then(dw.a("resetclosest").executes($$0x -> l.a($$0x).a())))
                                                .then(dw.a("resetthese").executes($$0x -> l.b($$0x).a())))
                                             .then(dw.a("resetthat").executes($$0x -> l.c($$0x).a())))
                                          .then(
                                             dw.a("export")
                                                .then(
                                                   dw.a("testName", StringArgumentType.word())
                                                      .executes($$0x -> b((dv)$$0x.getSource(), "minecraft:" + StringArgumentType.getString($$0x, "testName")))
                                                )
                                          ))
                                       .then(dw.a("exportclosest").executes($$0x -> l.a($$0x).c())))
                                    .then(dw.a("exportthese").executes($$0x -> l.b($$0x).c())))
                                 .then(dw.a("exportthat").executes($$0x -> l.c($$0x).c())))
                              .then(dw.a("clearthat").executes($$0x -> l.c($$0x).b())))
                           .then(dw.a("clearthese").executes($$0x -> l.b($$0x).b())))
                        .then(
                           ((LiteralArgumentBuilder)dw.a("clearall").executes($$0x -> l.a($$0x, 200).b()))
                              .then(
                                 dw.a("radius", IntegerArgumentType.integer())
                                    .executes($$0x -> l.a($$0x, axm.a(IntegerArgumentType.getInteger($$0x, "radius"), 0, 1024)).b())
                              )
                        ))
                     .then(
                        dw.a("import")
                           .then(
                              dw.a("testName", StringArgumentType.word())
                                 .executes($$0x -> d((dv)$$0x.getSource(), StringArgumentType.getString($$0x, "testName")))
                           )
                     ))
                  .then(dw.a("stop").executes($$0x -> a())))
               .then(
                  ((LiteralArgumentBuilder)dw.a("pos").executes($$0x -> a((dv)$$0x.getSource(), "pos")))
                     .then(dw.a("var", StringArgumentType.word()).executes($$0x -> a((dv)$$0x.getSource(), StringArgumentType.getString($$0x, "var"))))
               ))
            .then(
               dw.a("create")
                  .then(
                     ((RequiredArgumentBuilder)dw.a("testName", StringArgumentType.word())
                           .suggests(tf::a)
                           .executes($$0x -> a((dv)$$0x.getSource(), StringArgumentType.getString($$0x, "testName"), 5, 5, 5)))
                        .then(
                           ((RequiredArgumentBuilder)dw.a("width", IntegerArgumentType.integer())
                                 .executes(
                                    $$0x -> a(
                                          (dv)$$0x.getSource(),
                                          StringArgumentType.getString($$0x, "testName"),
                                          IntegerArgumentType.getInteger($$0x, "width"),
                                          IntegerArgumentType.getInteger($$0x, "width"),
                                          IntegerArgumentType.getInteger($$0x, "width")
                                       )
                                 ))
                              .then(
                                 dw.a("height", IntegerArgumentType.integer())
                                    .then(
                                       dw.a("depth", IntegerArgumentType.integer())
                                          .executes(
                                             $$0x -> a(
                                                   (dv)$$0x.getSource(),
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

   private static int a(sk $$0) {
      $$0.f().a_(null, $$0.d()).stream().forEach($$0x -> $$0x.a(bqa.c.b));
      $$0.e().c($$0.f());
      ta.a($$0.d(), $$0.f());
      a($$0.f(), "Reset succeded for: " + $$0.b(), n.k);
      return 1;
   }

   static Stream<sk> a(dv $$0, sx $$1, sy $$2) {
      return $$2.findStructureBlockPos().map($$2x -> a($$2x, $$0.e(), $$1)).flatMap(Optional::stream);
   }

   static Stream<sk> a(dv $$0, sx $$1, tg $$2, int $$3) {
      return $$2.findTestFunctions().filter($$1x -> a($$0.e(), $$1x.d())).map($$3x -> new sk($$3x, ta.a($$3), $$0.e(), $$1));
   }

   private static Optional<sk> a(id $$0, apu $$1, sx $$2) {
      dod $$3 = (dod)$$1.c_($$0);
      if ($$3 == null) {
         a($$1, "Structure block entity could not be found", n.m);
         return Optional.empty();
      } else {
         String $$4 = $$3.t();
         Optional<te> $$5 = sm.e($$4);
         if ($$5.isEmpty()) {
            a($$1, "Test function for test " + $$4 + " could not be found", n.m);
            return Optional.empty();
         } else {
            te $$6 = $$5.get();
            sk $$7 = new sk($$6, $$3.l(), $$1, $$2);
            $$7.a($$0);
            return !a($$1, $$7.s()) ? Optional.empty() : Optional.of($$7);
         }
      }
   }

   private static int a(dv $$0, String $$1, int $$2, int $$3, int $$4) {
      if ($$2 <= 48 && $$3 <= 48 && $$4 <= 48) {
         apu $$5 = $$0.e();
         id $$6 = a($$0).d();
         ta.a($$1.toLowerCase(), $$6, new ji($$2, $$3, $$4), dit.a, $$5);
         id $$7 = $$6.c();
         id $$8 = $$7.b($$2 - 1, 0, $$4 - 1);
         id.b($$7, $$8).forEach($$1x -> $$5.b($$1x, dcj.F.n()));
         ta.a($$6, new id(1, 0, -1), dit.a, $$5);
         return 0;
      } else {
         throw new IllegalArgumentException("The structure must be less than 48 blocks big in each axis");
      }
   }

   private static int a(dv $$0, String $$1) throws CommandSyntaxException {
      esf $$2 = (esf)$$0.h().a(10.0, 1.0F, false);
      id $$3 = $$2.a();
      apu $$4 = $$0.e();
      Optional<id> $$5 = ta.a($$3, 15, $$4);
      if ($$5.isEmpty()) {
         $$5 = ta.a($$3, 200, $$4);
      }

      if ($$5.isEmpty()) {
         $$0.b(wi.b("Can't find a structure block that contains the targeted pos " + $$3));
         return 0;
      } else {
         dod $$6 = (dod)$$4.c_($$5.get());
         if ($$6 == null) {
            a($$4, "Structure block entity could not be found", n.m);
            return 0;
         } else {
            id $$7 = $$3.b($$5.get());
            String $$8 = $$7.u() + ", " + $$7.v() + ", " + $$7.w();
            String $$9 = $$6.t();
            wi $$10 = wi.b($$8)
               .b(
                  xf.a
                     .a(true)
                     .a(n.k)
                     .a(new wo(wo.a.a, wi.b("Click to copy to clipboard")))
                     .a(new wg(wg.a.f, "final BlockPos " + $$1 + " = new BlockPos(" + $$8 + ");"))
               );
            $$0.a(() -> wi.b("Position relative to " + $$9 + ": ").b($$10), false);
            afk.a($$4, new id($$3), $$8, -2147418368, 10000);
            return 1;
         }
      }
   }

   static int a() {
      sq.a.a();
      return 1;
   }

   static int a(dv $$0, apu $$1, sn $$2) {
      $$2.a(new tc.b($$0));
      sv $$3 = new sv($$2.a());
      $$3.a(new tc.c($$1, $$3));
      $$3.a($$0x -> sm.a($$0x.u()));
      $$2.b();
      return 1;
   }

   static int a(dv $$0, dod $$1) {
      String $$2 = $$1.c();
      if (!$$1.b(true)) {
         c($$0, "Failed to save structure " + $$2);
      }

      return b($$0, $$2);
   }

   private static int b(dv $$0, String $$1) {
      Path $$2 = Paths.get(ta.b);
      ajv $$3 = new ajv($$1);
      Path $$4 = $$0.e().q().a($$3, ".nbt");
      Path $$5 = ol.a(ky.a, $$4, $$3.a(), $$2);
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

   private static boolean a(apu $$0, String $$1) {
      if ($$0.q().b(new ajv($$1)).isEmpty()) {
         a($$0, "Test structure " + $$1 + " could not be found", n.m);
         return false;
      } else {
         return true;
      }
   }

   static id a(dv $$0) {
      id $$1 = id.a($$0.d());
      int $$2 = $$0.e().a(dva.a.b, $$1).v();
      return new id($$1.u(), $$2 + 1, $$1.w() + 3);
   }

   static void c(dv $$0, String $$1) {
      $$0.a(() -> wi.b($$1), false);
   }

   private static int d(dv $$0, String $$1) {
      Path $$2 = Paths.get(ta.b, $$1 + ".snbt");
      ajv $$3 = new ajv("minecraft", $$1);
      Path $$4 = $$0.e().q().a($$3, ".nbt");

      try {
         BufferedReader $$5 = Files.newBufferedReader($$2);
         String $$6 = IOUtils.toString($$5);
         Files.createDirectories($$4.getParent());

         try (OutputStream $$7 = Files.newOutputStream($$4)) {
            ub.a(ud.a($$6), $$7);
         }

         $$0.e().q().d($$3);
         c($$0, "Imported to " + $$4.toAbsolutePath());
         return 0;
      } catch (CommandSyntaxException | IOException var12) {
         c.error("Failed to load structure {}", $$1, var12);
         return 1;
      }
   }

   static void a(apu $$0, String $$1, n $$2) {
      $$0.a($$0x -> true).forEach($$2x -> $$2x.a(wi.b($$1).a($$2)));
   }

   public static class a {
      private final td<tc.a> a;

      public a(td<tc.a> $$0) {
         this.a = $$0;
      }

      public int a() {
         tc.a();
         return tc.a(this.a.a(), sx.a(), this.a).map(tc::a).toList().isEmpty() ? 0 : 1;
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
         tc.a();
         dv $$0 = this.a.a();
         apu $$1 = $$0.e();
         sn.a($$1);
         this.a(this.a.findStructureBlockPos(), $$1x -> {
            dod $$2 = (dod)$$1.c_($$1x);
            if ($$2 == null) {
               return 0;
            } else {
               efi $$3 = ta.b($$2);
               ta.a($$3, $$1);
               return 1;
            }
         }, () -> tc.a($$1, "Could not find any structures to clear", n.m), $$1x -> tc.c($$0, "Cleared " + $$1x + " structures"));
         return 1;
      }

      public int c() {
         MutableBoolean $$0 = new MutableBoolean(true);
         dv $$1 = this.a.a();
         apu $$2 = $$1.e();
         this.a(this.a.findStructureBlockPos(), $$3 -> {
            dod $$4 = (dod)$$2.c_($$3);
            if ($$4 == null) {
               tc.a($$2, "Structure block entity could not be found", n.m);
               $$0.setFalse();
               return 0;
            } else {
               if (tc.a($$1, $$4) != 0) {
                  $$0.setFalse();
               }

               return 1;
            }
         }, () -> tc.a($$2, "Could not find any structures to export", n.m), $$1x -> tc.c($$1, "Exported " + $$1x + " structures"));
         return $$0.getValue() ? 0 : 1;
      }

      public int a(sx $$0, int $$1, int $$2) {
         tc.a();
         dv $$3 = this.a.a();
         apu $$4 = $$3.e();
         id $$5 = tc.a($$3);
         Collection<sk> $$6 = Stream.concat(tc.a($$3, $$0, this.a), tc.a($$3, $$0, this.a, $$1)).toList();
         if ($$6.isEmpty()) {
            tc.c($$3, "No tests found");
            return 0;
         } else {
            sn.a($$4);
            sm.d();
            tc.c($$3, "Running " + $$6.size() + " tests...");
            sn $$7 = sn.a.b($$6, $$4).a(new sz($$5, $$2)).a();
            return tc.a($$3, $$4, $$7);
         }
      }

      public int a(int $$0, int $$1) {
         return this.a(sx.a(), $$0, $$1);
      }

      public int a(int $$0) {
         return this.a(sx.a(), $$0, 8);
      }

      public int a(sx $$0, int $$1) {
         return this.a($$0, $$1, 8);
      }

      public int a(sx $$0) {
         return this.a($$0, 0, 8);
      }

      public int d() {
         return this.a(sx.a());
      }
   }

   static record b(dv a) implements sg {
      @Override
      public void a(se $$0) {
         tc.c(this.a, "Starting batch: " + $$0.a());
      }

      @Override
      public void b(se $$0) {
      }
   }

   public static record c(apu a, sv b) implements sl {
      @Override
      public void a(sk $$0) {
      }

      @Override
      public void a(sk $$0, sn $$1) {
         a(this.a, this.b);
      }

      @Override
      public void b(sk $$0, sn $$1) {
         a(this.a, this.b);
      }

      @Override
      public void a(sk $$0, sk $$1, sn $$2) {
         this.b.a($$1);
      }

      private static void a(apu $$0, sv $$1) {
         if ($$1.i()) {
            tc.a($$0, "GameTest done! " + $$1.h() + " tests were run", n.p);
            if ($$1.d()) {
               tc.a($$0, $$1.a() + " required tests failed :(", n.m);
            } else {
               tc.a($$0, "All required tests passed :)", n.k);
            }

            if ($$1.e()) {
               tc.a($$0, $$1.b() + " optional tests failed", n.h);
            }
         }
      }
   }
}
