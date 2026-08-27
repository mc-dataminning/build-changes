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

public class qn {
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

   public static void a(CommandDispatcher<dt> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)du.a(
                                                "test"
                                             )
                                             .then(du.a("runthis").executes($$0x -> a((dt)$$0x.getSource()))))
                                          .then(du.a("runthese").executes($$0x -> b((dt)$$0x.getSource()))))
                                       .then(
                                          ((LiteralArgumentBuilder)du.a("runfailed").executes($$0x -> a((dt)$$0x.getSource(), false, 0, 8)))
                                             .then(
                                                ((RequiredArgumentBuilder)du.a("onlyRequiredTests", BoolArgumentType.bool())
                                                      .executes($$0x -> a((dt)$$0x.getSource(), BoolArgumentType.getBool($$0x, "onlyRequiredTests"), 0, 8)))
                                                   .then(
                                                      ((RequiredArgumentBuilder)du.a("rotationSteps", IntegerArgumentType.integer())
                                                            .executes(
                                                               $$0x -> a(
                                                                     (dt)$$0x.getSource(),
                                                                     BoolArgumentType.getBool($$0x, "onlyRequiredTests"),
                                                                     IntegerArgumentType.getInteger($$0x, "rotationSteps"),
                                                                     8
                                                                  )
                                                            ))
                                                         .then(
                                                            du.a("testsPerRow", IntegerArgumentType.integer())
                                                               .executes(
                                                                  $$0x -> a(
                                                                        (dt)$$0x.getSource(),
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
                                       du.a("run")
                                          .then(
                                             ((RequiredArgumentBuilder)du.a("testName", qp.a())
                                                   .executes($$0x -> a((dt)$$0x.getSource(), qp.a($$0x, "testName"), 0)))
                                                .then(
                                                   du.a("rotationSteps", IntegerArgumentType.integer())
                                                      .executes(
                                                         $$0x -> a(
                                                               (dt)$$0x.getSource(),
                                                               qp.a($$0x, "testName"),
                                                               IntegerArgumentType.getInteger($$0x, "rotationSteps")
                                                            )
                                                      )
                                                )
                                          )
                                    ))
                                 .then(
                                    ((LiteralArgumentBuilder)((LiteralArgumentBuilder)du.a("runall").executes($$0x -> a((dt)$$0x.getSource(), 0, 8)))
                                          .then(
                                             ((RequiredArgumentBuilder)du.a("testClassName", qm.a())
                                                   .executes($$0x -> a((dt)$$0x.getSource(), qm.a($$0x, "testClassName"), 0, 8)))
                                                .then(
                                                   ((RequiredArgumentBuilder)du.a("rotationSteps", IntegerArgumentType.integer())
                                                         .executes(
                                                            $$0x -> a(
                                                                  (dt)$$0x.getSource(),
                                                                  qm.a($$0x, "testClassName"),
                                                                  IntegerArgumentType.getInteger($$0x, "rotationSteps"),
                                                                  8
                                                               )
                                                         ))
                                                      .then(
                                                         du.a("testsPerRow", IntegerArgumentType.integer())
                                                            .executes(
                                                               $$0x -> a(
                                                                     (dt)$$0x.getSource(),
                                                                     qm.a($$0x, "testClassName"),
                                                                     IntegerArgumentType.getInteger($$0x, "rotationSteps"),
                                                                     IntegerArgumentType.getInteger($$0x, "testsPerRow")
                                                                  )
                                                            )
                                                      )
                                                )
                                          ))
                                       .then(
                                          ((RequiredArgumentBuilder)du.a("rotationSteps", IntegerArgumentType.integer())
                                                .executes($$0x -> a((dt)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "rotationSteps"), 8)))
                                             .then(
                                                du.a("testsPerRow", IntegerArgumentType.integer())
                                                   .executes(
                                                      $$0x -> a(
                                                            (dt)$$0x.getSource(),
                                                            IntegerArgumentType.getInteger($$0x, "rotationSteps"),
                                                            IntegerArgumentType.getInteger($$0x, "testsPerRow")
                                                         )
                                                   )
                                             )
                                       )
                                 ))
                              .then(
                                 du.a("export")
                                    .then(
                                       du.a("testName", StringArgumentType.word())
                                          .executes($$0x -> c((dt)$$0x.getSource(), StringArgumentType.getString($$0x, "testName")))
                                    )
                              ))
                           .then(du.a("exportthis").executes($$0x -> c((dt)$$0x.getSource()))))
                        .then(du.a("exportthese").executes($$0x -> d((dt)$$0x.getSource()))))
                     .then(
                        du.a("import")
                           .then(
                              du.a("testName", StringArgumentType.word())
                                 .executes($$0x -> d((dt)$$0x.getSource(), StringArgumentType.getString($$0x, "testName")))
                           )
                     ))
                  .then(
                     ((LiteralArgumentBuilder)du.a("pos").executes($$0x -> a((dt)$$0x.getSource(), "pos")))
                        .then(du.a("var", StringArgumentType.word()).executes($$0x -> a((dt)$$0x.getSource(), StringArgumentType.getString($$0x, "var"))))
                  ))
               .then(
                  du.a("create")
                     .then(
                        ((RequiredArgumentBuilder)du.a("testName", StringArgumentType.word())
                              .executes($$0x -> a((dt)$$0x.getSource(), StringArgumentType.getString($$0x, "testName"), 5, 5, 5)))
                           .then(
                              ((RequiredArgumentBuilder)du.a("width", IntegerArgumentType.integer())
                                    .executes(
                                       $$0x -> a(
                                             (dt)$$0x.getSource(),
                                             StringArgumentType.getString($$0x, "testName"),
                                             IntegerArgumentType.getInteger($$0x, "width"),
                                             IntegerArgumentType.getInteger($$0x, "width"),
                                             IntegerArgumentType.getInteger($$0x, "width")
                                          )
                                    ))
                                 .then(
                                    du.a("height", IntegerArgumentType.integer())
                                       .then(
                                          du.a("depth", IntegerArgumentType.integer())
                                             .executes(
                                                $$0x -> a(
                                                      (dt)$$0x.getSource(),
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
               ((LiteralArgumentBuilder)du.a("clearall").executes($$0x -> a((dt)$$0x.getSource(), 200)))
                  .then(du.a("radius", IntegerArgumentType.integer()).executes($$0x -> a((dt)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "radius"))))
            )
      );
   }

   private static int a(dt $$0, String $$1, int $$2, int $$3, int $$4) {
      if ($$2 <= 48 && $$3 <= 48 && $$4 <= 48) {
         akr $$5 = $$0.e();
         gw $$6 = gw.a($$0.d());
         gw $$7 = new gw($$6.u(), $$0.e().a(dks.a.b, $$6).v(), $$6.w() + 3);
         qk.a($$1.toLowerCase(), $$7, new ib($$2, $$3, $$4), czh.a, $$5);

         for (int $$8 = 0; $$8 < $$2; $$8++) {
            for (int $$9 = 0; $$9 < $$4; $$9++) {
               gw $$10 = new gw($$7.u() + $$8, $$7.v() + 1, $$7.w() + $$9);
               csv $$11 = csw.h;
               ff $$12 = new ff($$11.n(), Collections.emptySet(), null);
               $$12.a($$5, $$10, 2);
            }
         }

         qk.a($$7, new gw(1, 0, -1), czh.a, $$5);
         return 0;
      } else {
         throw new IllegalArgumentException("The structure must be less than 48 blocks big in each axis");
      }
   }

   private static int a(dt $$0, String $$1) throws CommandSyntaxException {
      ehj $$2 = (ehj)$$0.h().a(10.0, 1.0F, false);
      gw $$3 = $$2.a();
      akr $$4 = $$0.e();
      Optional<gw> $$5 = qk.a($$3, 15, $$4);
      if ($$5.isEmpty()) {
         $$5 = qk.a($$3, 200, $$4);
      }

      if ($$5.isEmpty()) {
         $$0.b(tl.b("Can't find a structure block that contains the targeted pos " + $$3));
         return 0;
      } else {
         dei $$6 = (dei)$$4.c_($$5.get());
         gw $$7 = $$3.b($$5.get());
         String $$8 = $$7.u() + ", " + $$7.v() + ", " + $$7.w();
         String $$9 = $$6.f();
         tl $$10 = tl.b($$8)
            .b(
               uh.a
                  .a(true)
                  .a(n.k)
                  .a(new tq(tq.a.a, tl.b("Click to copy to clipboard")))
                  .a(new tj(tj.a.f, "final BlockPos " + $$1 + " = new BlockPos(" + $$8 + ");"))
            );
         $$0.a(() -> tl.b("Position relative to " + $$9 + ": ").b($$10), false);
         abc.a($$4, new gw($$3), $$8, -2147418368, 10000);
         return 1;
      }
   }

   private static int a(dt $$0) {
      gw $$1 = gw.a($$0.d());
      akr $$2 = $$0.e();
      gw $$3 = qk.b($$1, 15, $$2);
      if ($$3 == null) {
         a($$2, "Couldn't find any structure block within 15 radius", n.m);
         return 0;
      } else {
         qa.a($$2);
         a($$2, $$3, null);
         return 1;
      }
   }

   private static int b(dt $$0) {
      gw $$1 = gw.a($$0.d());
      akr $$2 = $$0.e();
      Collection<gw> $$3 = qk.c($$1, 200, $$2);
      if ($$3.isEmpty()) {
         a($$2, "Couldn't find any structure blocks within 200 block radius", n.m);
         return 1;
      } else {
         qa.a($$2);
         b($$0, "Running " + $$3.size() + " tests...");
         qi $$4 = new qi();
         $$3.forEach($$2x -> a($$2, $$2x, $$4));
         return 1;
      }
   }

   private static void a(akr $$0, gw $$1, @Nullable qi $$2) {
      dei $$3 = (dei)$$0.c_($$1);
      String $$4 = $$3.f();
      qo $$5 = pz.f($$4);
      px $$6 = new px($$5, $$3.w(), $$0);
      if ($$2 != null) {
         $$2.a($$6);
         $$6.a(new qn.a($$0, $$2));
      }

      a($$5, $$0);
      ehi $$7 = qk.a($$3);
      gw $$8 = gw.a($$7.a, $$7.b, $$7.c);
      qa.a($$6, $$8, qd.a);
   }

   static void a(akr $$0, qi $$1) {
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

   private static int a(dt $$0, int $$1) {
      akr $$2 = $$0.e();
      qa.a($$2);
      gw $$3 = gw.a($$0.d().c, (double)$$0.e().a(dks.a.b, gw.a($$0.d())).v(), $$0.d().e);
      qa.a($$2, $$3, qd.a, arx.a($$1, 0, 1024));
      return 1;
   }

   private static int a(dt $$0, qo $$1, int $$2) {
      akr $$3 = $$0.e();
      gw $$4 = gw.a($$0.d());
      int $$5 = $$0.e().a(dks.a.b, $$4).v();
      gw $$6 = new gw($$4.u(), $$5, $$4.w() + 3);
      qa.a($$3);
      a($$1, $$3);
      czh $$7 = qk.a($$2);
      px $$8 = new px($$1, $$7, $$3);
      qa.a($$8, $$6, qd.a);
      return 1;
   }

   private static void a(qo $$0, akr $$1) {
      Consumer<akr> $$2 = pz.c($$0.e());
      if ($$2 != null) {
         $$2.accept($$1);
      }
   }

   private static int a(dt $$0, int $$1, int $$2) {
      qa.a($$0.e());
      Collection<qo> $$3 = pz.a();
      b($$0, "Running all " + $$3.size() + " tests...");
      pz.d();
      a($$0, $$3, $$1, $$2);
      return 1;
   }

   private static int a(dt $$0, String $$1, int $$2, int $$3) {
      Collection<qo> $$4 = pz.a($$1);
      qa.a($$0.e());
      b($$0, "Running " + $$4.size() + " tests from " + $$1 + "...");
      pz.d();
      a($$0, $$4, $$2, $$3);
      return 1;
   }

   private static int a(dt $$0, boolean $$1, int $$2, int $$3) {
      Collection<qo> $$4;
      if ($$1) {
         $$4 = pz.c().stream().filter(qo::d).collect(Collectors.toList());
      } else {
         $$4 = pz.c();
      }

      if ($$4.isEmpty()) {
         b($$0, "No failed tests to rerun");
         return 0;
      } else {
         qa.a($$0.e());
         b($$0, "Rerunning " + $$4.size() + " failed tests (" + ($$1 ? "only required tests" : "including optional tests") + ")");
         a($$0, $$4, $$2, $$3);
         return 1;
      }
   }

   private static void a(dt $$0, Collection<qo> $$1, int $$2, int $$3) {
      gw $$4 = gw.a($$0.d());
      gw $$5 = new gw($$4.u(), $$0.e().a(dks.a.b, $$4).v(), $$4.w() + 3);
      akr $$6 = $$0.e();
      czh $$7 = qk.a($$2);
      Collection<px> $$8 = qa.b($$1, $$5, $$7, $$6, qd.a, $$3);
      qi $$9 = new qi($$8);
      $$9.a(new qn.a($$6, $$9));
      $$9.a($$0x -> pz.a($$0x.v()));
   }

   private static void b(dt $$0, String $$1) {
      $$0.a(() -> tl.b($$1), false);
   }

   private static int c(dt $$0) {
      gw $$1 = gw.a($$0.d());
      akr $$2 = $$0.e();
      gw $$3 = qk.b($$1, 15, $$2);
      if ($$3 == null) {
         a($$2, "Couldn't find any structure block within 15 radius", n.m);
         return 0;
      } else {
         dei $$4 = (dei)$$2.c_($$3);
         String $$5 = $$4.f();
         return c($$0, $$5);
      }
   }

   private static int d(dt $$0) {
      gw $$1 = gw.a($$0.d());
      akr $$2 = $$0.e();
      Collection<gw> $$3 = qk.c($$1, 200, $$2);
      if ($$3.isEmpty()) {
         a($$2, "Couldn't find any structure blocks within 200 block radius", n.m);
         return 1;
      } else {
         boolean $$4 = true;

         for (gw $$5 : $$3) {
            dei $$6 = (dei)$$2.c_($$5);
            String $$7 = $$6.f();
            if (c($$0, $$7) != 0) {
               $$4 = false;
            }
         }

         return $$4 ? 0 : 1;
      }
   }

   private static int c(dt $$0, String $$1) {
      Path $$2 = Paths.get(qk.b);
      aex $$3 = new aex("minecraft", $$1);
      Path $$4 = $$0.e().p().a($$3, ".nbt");
      Path $$5 = ml.a(ji.a, $$4, $$1, $$2);
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

   private static int d(dt $$0, String $$1) {
      Path $$2 = Paths.get(qk.b, $$1 + ".snbt");
      aex $$3 = new aex("minecraft", $$1);
      Path $$4 = $$0.e().p().a($$3, ".nbt");

      try {
         BufferedReader $$5 = Files.newBufferedReader($$2);
         String $$6 = IOUtils.toString($$5);
         Files.createDirectories($$4.getParent());

         try (OutputStream $$7 = Files.newOutputStream($$4)) {
            rh.a(rj.a($$6), $$7);
         }

         b($$0, "Imported to " + $$4.toAbsolutePath());
         return 0;
      } catch (CommandSyntaxException | IOException var12) {
         a.error("Failed to load structure {}", $$1, var12);
         return 1;
      }
   }

   private static void a(akr $$0, String $$1, n $$2) {
      $$0.a($$0x -> true).forEach($$2x -> $$2x.a(tl.b($$2 + $$1)));
   }

   static class a implements py {
      private final akr a;
      private final qi b;

      public a(akr $$0, qi $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public void a(px $$0) {
      }

      @Override
      public void b(px $$0) {
         qn.a(this.a, this.b);
      }

      @Override
      public void c(px $$0) {
         qn.a(this.a, this.b);
      }
   }
}
