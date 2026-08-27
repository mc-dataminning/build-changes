import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.BoolArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collection;
import java.util.Collections;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;

public class qi {
   private static final Logger a = LogUtils.getLogger();
   private static final int b = 200;
   private static final int c = 1024;
   private static final int d = 15;
   private static final int e = 200;
   private static final int f = 3;
   private static final int g = 10000;
   private static final int h = 5;
   private static final int i = 5;
   private static final int j = 5;

   public static void a(CommandDispatcher<ds> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a(
                                                "test"
                                             )
                                             .then(dt.a("runthis").executes($$0x -> a((ds)$$0x.getSource()))))
                                          .then(dt.a("runthese").executes($$0x -> b((ds)$$0x.getSource()))))
                                       .then(
                                          ((LiteralArgumentBuilder)dt.a("runfailed").executes($$0x -> a((ds)$$0x.getSource(), false, 0, 8)))
                                             .then(
                                                ((RequiredArgumentBuilder)dt.a("onlyRequiredTests", BoolArgumentType.bool())
                                                      .executes($$0x -> a((ds)$$0x.getSource(), BoolArgumentType.getBool($$0x, "onlyRequiredTests"), 0, 8)))
                                                   .then(
                                                      ((RequiredArgumentBuilder)dt.a("rotationSteps", IntegerArgumentType.integer())
                                                            .executes(
                                                               $$0x -> a(
                                                                     (ds)$$0x.getSource(),
                                                                     BoolArgumentType.getBool($$0x, "onlyRequiredTests"),
                                                                     IntegerArgumentType.getInteger($$0x, "rotationSteps"),
                                                                     8
                                                                  )
                                                            ))
                                                         .then(
                                                            dt.a("testsPerRow", IntegerArgumentType.integer())
                                                               .executes(
                                                                  $$0x -> a(
                                                                        (ds)$$0x.getSource(),
                                                                        BoolArgumentType.getBool($$0x, "onlyRequiredTests"),
                                                                        IntegerArgumentType.getInteger($$0x, "rotationSteps"),
                                                                        IntegerArgumentType.getInteger($$0x, "testsPerRow")
                                                                     )
                                                               )
                                                         )
                                                   )
                                             )
                                       ))
                                    .then(
                                       dt.a("run")
                                          .then(
                                             ((RequiredArgumentBuilder)dt.a("testName", qk.a())
                                                   .executes($$0x -> a((ds)$$0x.getSource(), qk.a($$0x, "testName"), 0)))
                                                .then(
                                                   dt.a("rotationSteps", IntegerArgumentType.integer())
                                                      .executes(
                                                         $$0x -> a(
                                                               (ds)$$0x.getSource(),
                                                               qk.a($$0x, "testName"),
                                                               IntegerArgumentType.getInteger($$0x, "rotationSteps")
                                                            )
                                                      )
                                                )
                                          )
                                    ))
                                 .then(
                                    ((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("runall").executes($$0x -> a((ds)$$0x.getSource(), 0, 8)))
                                          .then(
                                             ((RequiredArgumentBuilder)dt.a("testClassName", qh.a())
                                                   .executes($$0x -> a((ds)$$0x.getSource(), qh.a($$0x, "testClassName"), 0, 8)))
                                                .then(
                                                   ((RequiredArgumentBuilder)dt.a("rotationSteps", IntegerArgumentType.integer())
                                                         .executes(
                                                            $$0x -> a(
                                                                  (ds)$$0x.getSource(),
                                                                  qh.a($$0x, "testClassName"),
                                                                  IntegerArgumentType.getInteger($$0x, "rotationSteps"),
                                                                  8
                                                               )
                                                         ))
                                                      .then(
                                                         dt.a("testsPerRow", IntegerArgumentType.integer())
                                                            .executes(
                                                               $$0x -> a(
                                                                     (ds)$$0x.getSource(),
                                                                     qh.a($$0x, "testClassName"),
                                                                     IntegerArgumentType.getInteger($$0x, "rotationSteps"),
                                                                     IntegerArgumentType.getInteger($$0x, "testsPerRow")
                                                                  )
                                                            )
                                                      )
                                                )
                                          ))
                                       .then(
                                          ((RequiredArgumentBuilder)dt.a("rotationSteps", IntegerArgumentType.integer())
                                                .executes($$0x -> a((ds)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "rotationSteps"), 8)))
                                             .then(
                                                dt.a("testsPerRow", IntegerArgumentType.integer())
                                                   .executes(
                                                      $$0x -> a(
                                                            (ds)$$0x.getSource(),
                                                            IntegerArgumentType.getInteger($$0x, "rotationSteps"),
                                                            IntegerArgumentType.getInteger($$0x, "testsPerRow")
                                                         )
                                                   )
                                             )
                                       )
                                 ))
                              .then(
                                 dt.a("export")
                                    .then(
                                       dt.a("testName", StringArgumentType.word())
                                          .executes($$0x -> c((ds)$$0x.getSource(), StringArgumentType.getString($$0x, "testName")))
                                    )
                              ))
                           .then(dt.a("exportthis").executes($$0x -> c((ds)$$0x.getSource()))))
                        .then(dt.a("exportthese").executes($$0x -> d((ds)$$0x.getSource()))))
                     .then(
                        dt.a("import")
                           .then(
                              dt.a("testName", StringArgumentType.word())
                                 .executes($$0x -> d((ds)$$0x.getSource(), StringArgumentType.getString($$0x, "testName")))
                           )
                     ))
                  .then(
                     ((LiteralArgumentBuilder)dt.a("pos").executes($$0x -> a((ds)$$0x.getSource(), "pos")))
                        .then(dt.a("var", StringArgumentType.word()).executes($$0x -> a((ds)$$0x.getSource(), StringArgumentType.getString($$0x, "var"))))
                  ))
               .then(
                  dt.a("create")
                     .then(
                        ((RequiredArgumentBuilder)dt.a("testName", StringArgumentType.word())
                              .executes($$0x -> a((ds)$$0x.getSource(), StringArgumentType.getString($$0x, "testName"), 5, 5, 5)))
                           .then(
                              ((RequiredArgumentBuilder)dt.a("width", IntegerArgumentType.integer())
                                    .executes(
                                       $$0x -> a(
                                             (ds)$$0x.getSource(),
                                             StringArgumentType.getString($$0x, "testName"),
                                             IntegerArgumentType.getInteger($$0x, "width"),
                                             IntegerArgumentType.getInteger($$0x, "width"),
                                             IntegerArgumentType.getInteger($$0x, "width")
                                          )
                                    ))
                                 .then(
                                    dt.a("height", IntegerArgumentType.integer())
                                       .then(
                                          dt.a("depth", IntegerArgumentType.integer())
                                             .executes(
                                                $$0x -> a(
                                                      (ds)$$0x.getSource(),
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
               ))
            .then(
               ((LiteralArgumentBuilder)dt.a("clearall").executes($$0x -> a((ds)$$0x.getSource(), 200)))
                  .then(dt.a("radius", IntegerArgumentType.integer()).executes($$0x -> a((ds)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "radius"))))
            )
      );
   }

   private static int a(ds $$0, String $$1, int $$2, int $$3, int $$4) {
      if ($$2 <= 48 && $$3 <= 48 && $$4 <= 48) {
         aki $$5 = $$0.e();
         gv $$6 = gv.a($$0.d());
         gv $$7 = new gv($$6.u(), $$0.e().a(dkh.a.b, $$6).v(), $$6.w() + 3);
         qf.a($$1.toLowerCase(), $$7, new ia($$2, $$3, $$4), cyw.a, $$5);

         for (int $$8 = 0; $$8 < $$2; $$8++) {
            for (int $$9 = 0; $$9 < $$4; $$9++) {
               gv $$10 = new gv($$7.u() + $$8, $$7.v() + 1, $$7.w() + $$9);
               csk $$11 = csl.h;
               fe $$12 = new fe($$11.n(), Collections.emptySet(), null);
               $$12.a($$5, $$10, 2);
            }
         }

         qf.a($$7, new gv(1, 0, -1), cyw.a, $$5);
         return 0;
      } else {
         throw new IllegalArgumentException("The structure must be less than 48 blocks big in each axis");
      }
   }

   private static int a(ds $$0, String $$1) throws CommandSyntaxException {
      ehb $$2 = (ehb)$$0.h().a(10.0, 1.0F, false);
      gv $$3 = $$2.a();
      aki $$4 = $$0.e();
      Optional<gv> $$5 = qf.a($$3, 15, $$4);
      if (!$$5.isPresent()) {
         $$5 = qf.a($$3, 200, $$4);
      }

      if (!$$5.isPresent()) {
         $$0.b(te.b("Can't find a structure block that contains the targeted pos " + $$3));
         return 0;
      } else {
         ddx $$6 = (ddx)$$4.c_($$5.get());
         gv $$7 = $$3.b($$5.get());
         String $$8 = $$7.u() + ", " + $$7.v() + ", " + $$7.w();
         String $$9 = $$6.f();
         te $$10 = te.b($$8)
            .b(
               ua.a
                  .a(true)
                  .a(n.k)
                  .a(new tj(tj.a.a, te.b("Click to copy to clipboard")))
                  .a(new tc(tc.a.f, "final BlockPos " + $$1 + " = new BlockPos(" + $$8 + ");"))
            );
         $$0.a(() -> te.b("Position relative to " + $$9 + ": ").b($$10), false);
         aau.a($$4, new gv($$3), $$8, -2147418368, 10000);
         return 1;
      }
   }

   private static int a(ds $$0) {
      gv $$1 = gv.a($$0.d());
      aki $$2 = $$0.e();
      gv $$3 = qf.b($$1, 15, $$2);
      if ($$3 == null) {
         a($$2, "Couldn't find any structure block within 15 radius", n.m);
         return 0;
      } else {
         pv.a($$2);
         a($$2, $$3, null);
         return 1;
      }
   }

   private static int b(ds $$0) {
      gv $$1 = gv.a($$0.d());
      aki $$2 = $$0.e();
      Collection<gv> $$3 = qf.c($$1, 200, $$2);
      if ($$3.isEmpty()) {
         a($$2, "Couldn't find any structure blocks within 200 block radius", n.m);
         return 1;
      } else {
         pv.a($$2);
         b($$0, "Running " + $$3.size() + " tests...");
         qd $$4 = new qd();
         $$3.forEach($$2x -> a($$2, $$2x, $$4));
         return 1;
      }
   }

   private static void a(aki $$0, gv $$1, @Nullable qd $$2) {
      ddx $$3 = (ddx)$$0.c_($$1);
      String $$4 = $$3.f();
      qj $$5 = pu.f($$4);
      ps $$6 = new ps($$5, $$3.w(), $$0);
      if ($$2 != null) {
         $$2.a($$6);
         $$6.a(new qi.a($$0, $$2));
      }

      a($$5, $$0);
      eha $$7 = qf.a($$3);
      gv $$8 = gv.a($$7.a, $$7.b, $$7.c);
      pv.a($$6, $$8, py.a);
   }

   static void a(aki $$0, qd $$1) {
      if ($$1.i()) {
         a($$0, "GameTest done! " + $$1.h() + " tests were run", n.p);
         if ($$1.d()) {
            a($$0, $$1.a() + " required tests failed :(", n.m);
         } else {
            a($$0, "All required tests passed :)", n.k);
         }

         if ($$1.e()) {
            a($$0, $$1.b() + " optional tests failed", n.h);
         }
      }
   }

   private static int a(ds $$0, int $$1) {
      aki $$2 = $$0.e();
      pv.a($$2);
      gv $$3 = gv.a($$0.d().c, (double)$$0.e().a(dkh.a.b, gv.a($$0.d())).v(), $$0.d().e);
      pv.a($$2, $$3, py.a, aro.a($$1, 0, 1024));
      return 1;
   }

   private static int a(ds $$0, qj $$1, int $$2) {
      aki $$3 = $$0.e();
      gv $$4 = gv.a($$0.d());
      int $$5 = $$0.e().a(dkh.a.b, $$4).v();
      gv $$6 = new gv($$4.u(), $$5, $$4.w() + 3);
      pv.a($$3);
      a($$1, $$3);
      cyw $$7 = qf.a($$2);
      ps $$8 = new ps($$1, $$7, $$3);
      pv.a($$8, $$6, py.a);
      return 1;
   }

   private static void a(qj $$0, aki $$1) {
      Consumer<aki> $$2 = pu.c($$0.e());
      if ($$2 != null) {
         $$2.accept($$1);
      }
   }

   private static int a(ds $$0, int $$1, int $$2) {
      pv.a($$0.e());
      Collection<qj> $$3 = pu.a();
      b($$0, "Running all " + $$3.size() + " tests...");
      pu.d();
      a($$0, $$3, $$1, $$2);
      return 1;
   }

   private static int a(ds $$0, String $$1, int $$2, int $$3) {
      Collection<qj> $$4 = pu.a($$1);
      pv.a($$0.e());
      b($$0, "Running " + $$4.size() + " tests from " + $$1 + "...");
      pu.d();
      a($$0, $$4, $$2, $$3);
      return 1;
   }

   private static int a(ds $$0, boolean $$1, int $$2, int $$3) {
      Collection<qj> $$4;
      if ($$1) {
         $$4 = pu.c().stream().filter(qj::d).collect(Collectors.toList());
      } else {
         $$4 = pu.c();
      }

      if ($$4.isEmpty()) {
         b($$0, "No failed tests to rerun");
         return 0;
      } else {
         pv.a($$0.e());
         b($$0, "Rerunning " + $$4.size() + " failed tests (" + ($$1 ? "only required tests" : "including optional tests") + ")");
         a($$0, $$4, $$2, $$3);
         return 1;
      }
   }

   private static void a(ds $$0, Collection<qj> $$1, int $$2, int $$3) {
      gv $$4 = gv.a($$0.d());
      gv $$5 = new gv($$4.u(), $$0.e().a(dkh.a.b, $$4).v(), $$4.w() + 3);
      aki $$6 = $$0.e();
      cyw $$7 = qf.a($$2);
      Collection<ps> $$8 = pv.b($$1, $$5, $$7, $$6, py.a, $$3);
      qd $$9 = new qd($$8);
      $$9.a(new qi.a($$6, $$9));
      $$9.a($$0x -> pu.a($$0x.v()));
   }

   private static void b(ds $$0, String $$1) {
      $$0.a(() -> te.b($$1), false);
   }

   private static int c(ds $$0) {
      gv $$1 = gv.a($$0.d());
      aki $$2 = $$0.e();
      gv $$3 = qf.b($$1, 15, $$2);
      if ($$3 == null) {
         a($$2, "Couldn't find any structure block within 15 radius", n.m);
         return 0;
      } else {
         ddx $$4 = (ddx)$$2.c_($$3);
         String $$5 = $$4.f();
         return c($$0, $$5);
      }
   }

   private static int d(ds $$0) {
      gv $$1 = gv.a($$0.d());
      aki $$2 = $$0.e();
      Collection<gv> $$3 = qf.c($$1, 200, $$2);
      if ($$3.isEmpty()) {
         a($$2, "Couldn't find any structure blocks within 200 block radius", n.m);
         return 1;
      } else {
         boolean $$4 = true;

         for (gv $$5 : $$3) {
            ddx $$6 = (ddx)$$2.c_($$5);
            String $$7 = $$6.f();
            if (c($$0, $$7) != 0) {
               $$4 = false;
            }
         }

         return $$4 ? 0 : 1;
      }
   }

   private static int c(ds $$0, String $$1) {
      Path $$2 = Paths.get(qf.b);
      aep $$3 = new aep("minecraft", $$1);
      Path $$4 = $$0.e().p().a($$3, ".nbt");
      Path $$5 = mh.a(jh.a, $$4, $$1, $$2);
      if ($$5 == null) {
         b($$0, "Failed to export " + $$4);
         return 1;
      } else {
         try {
            Files.createDirectories($$5.getParent());
         } catch (IOException var7) {
            b($$0, "Could not create folder " + $$5.getParent());
            a.error("Could not create export folder", var7);
            return 1;
         }

         b($$0, "Exported " + $$1 + " to " + $$5.toAbsolutePath());
         return 0;
      }
   }

   private static int d(ds $$0, String $$1) {
      Path $$2 = Paths.get(qf.b, $$1 + ".snbt");
      aep $$3 = new aep("minecraft", $$1);
      Path $$4 = $$0.e().p().a($$3, ".nbt");

      try {
         BufferedReader $$5 = Files.newBufferedReader($$2);
         String $$6 = IOUtils.toString($$5);
         Files.createDirectories($$4.getParent());

         try (OutputStream $$7 = Files.newOutputStream($$4)) {
            rc.a(re.a($$6), $$7);
         }

         b($$0, "Imported to " + $$4.toAbsolutePath());
         return 0;
      } catch (CommandSyntaxException | IOException var12) {
         a.error("Failed to load structure {}", $$1, var12);
         return 1;
      }
   }

   private static void a(aki $$0, String $$1, n $$2) {
      $$0.a($$0x -> true).forEach($$2x -> $$2x.a(te.b($$2 + $$1)));
   }

   static class a implements pt {
      private final aki a;
      private final qd b;

      public a(aki $$0, qd $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public void a(ps $$0) {
      }

      @Override
      public void b(ps $$0) {
         qi.a(this.a, this.b);
      }

      @Override
      public void c(ps $$0) {
         qi.a(this.a, this.b);
      }
   }
}
