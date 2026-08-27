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

public class qh {
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

   public static void a(CommandDispatcher<dr> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ds.a(
                                                "test"
                                             )
                                             .then(ds.a("runthis").executes($$0x -> a((dr)$$0x.getSource()))))
                                          .then(ds.a("runthese").executes($$0x -> b((dr)$$0x.getSource()))))
                                       .then(
                                          ((LiteralArgumentBuilder)ds.a("runfailed").executes($$0x -> a((dr)$$0x.getSource(), false, 0, 8)))
                                             .then(
                                                ((RequiredArgumentBuilder)ds.a("onlyRequiredTests", BoolArgumentType.bool())
                                                      .executes($$0x -> a((dr)$$0x.getSource(), BoolArgumentType.getBool($$0x, "onlyRequiredTests"), 0, 8)))
                                                   .then(
                                                      ((RequiredArgumentBuilder)ds.a("rotationSteps", IntegerArgumentType.integer())
                                                            .executes(
                                                               $$0x -> a(
                                                                     (dr)$$0x.getSource(),
                                                                     BoolArgumentType.getBool($$0x, "onlyRequiredTests"),
                                                                     IntegerArgumentType.getInteger($$0x, "rotationSteps"),
                                                                     8
                                                                  )
                                                            ))
                                                         .then(
                                                            ds.a("testsPerRow", IntegerArgumentType.integer())
                                                               .executes(
                                                                  $$0x -> a(
                                                                        (dr)$$0x.getSource(),
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
                                       ds.a("run")
                                          .then(
                                             ((RequiredArgumentBuilder)ds.a("testName", qj.a())
                                                   .executes($$0x -> a((dr)$$0x.getSource(), qj.a($$0x, "testName"), 0)))
                                                .then(
                                                   ds.a("rotationSteps", IntegerArgumentType.integer())
                                                      .executes(
                                                         $$0x -> a(
                                                               (dr)$$0x.getSource(),
                                                               qj.a($$0x, "testName"),
                                                               IntegerArgumentType.getInteger($$0x, "rotationSteps")
                                                            )
                                                      )
                                                )
                                          )
                                    ))
                                 .then(
                                    ((LiteralArgumentBuilder)((LiteralArgumentBuilder)ds.a("runall").executes($$0x -> a((dr)$$0x.getSource(), 0, 8)))
                                          .then(
                                             ((RequiredArgumentBuilder)ds.a("testClassName", qg.a())
                                                   .executes($$0x -> a((dr)$$0x.getSource(), qg.a($$0x, "testClassName"), 0, 8)))
                                                .then(
                                                   ((RequiredArgumentBuilder)ds.a("rotationSteps", IntegerArgumentType.integer())
                                                         .executes(
                                                            $$0x -> a(
                                                                  (dr)$$0x.getSource(),
                                                                  qg.a($$0x, "testClassName"),
                                                                  IntegerArgumentType.getInteger($$0x, "rotationSteps"),
                                                                  8
                                                               )
                                                         ))
                                                      .then(
                                                         ds.a("testsPerRow", IntegerArgumentType.integer())
                                                            .executes(
                                                               $$0x -> a(
                                                                     (dr)$$0x.getSource(),
                                                                     qg.a($$0x, "testClassName"),
                                                                     IntegerArgumentType.getInteger($$0x, "rotationSteps"),
                                                                     IntegerArgumentType.getInteger($$0x, "testsPerRow")
                                                                  )
                                                            )
                                                      )
                                                )
                                          ))
                                       .then(
                                          ((RequiredArgumentBuilder)ds.a("rotationSteps", IntegerArgumentType.integer())
                                                .executes($$0x -> a((dr)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "rotationSteps"), 8)))
                                             .then(
                                                ds.a("testsPerRow", IntegerArgumentType.integer())
                                                   .executes(
                                                      $$0x -> a(
                                                            (dr)$$0x.getSource(),
                                                            IntegerArgumentType.getInteger($$0x, "rotationSteps"),
                                                            IntegerArgumentType.getInteger($$0x, "testsPerRow")
                                                         )
                                                   )
                                             )
                                       )
                                 ))
                              .then(
                                 ds.a("export")
                                    .then(
                                       ds.a("testName", StringArgumentType.word())
                                          .executes($$0x -> c((dr)$$0x.getSource(), StringArgumentType.getString($$0x, "testName")))
                                    )
                              ))
                           .then(ds.a("exportthis").executes($$0x -> c((dr)$$0x.getSource()))))
                        .then(ds.a("exportthese").executes($$0x -> d((dr)$$0x.getSource()))))
                     .then(
                        ds.a("import")
                           .then(
                              ds.a("testName", StringArgumentType.word())
                                 .executes($$0x -> d((dr)$$0x.getSource(), StringArgumentType.getString($$0x, "testName")))
                           )
                     ))
                  .then(
                     ((LiteralArgumentBuilder)ds.a("pos").executes($$0x -> a((dr)$$0x.getSource(), "pos")))
                        .then(ds.a("var", StringArgumentType.word()).executes($$0x -> a((dr)$$0x.getSource(), StringArgumentType.getString($$0x, "var"))))
                  ))
               .then(
                  ds.a("create")
                     .then(
                        ((RequiredArgumentBuilder)ds.a("testName", StringArgumentType.word())
                              .executes($$0x -> a((dr)$$0x.getSource(), StringArgumentType.getString($$0x, "testName"), 5, 5, 5)))
                           .then(
                              ((RequiredArgumentBuilder)ds.a("width", IntegerArgumentType.integer())
                                    .executes(
                                       $$0x -> a(
                                             (dr)$$0x.getSource(),
                                             StringArgumentType.getString($$0x, "testName"),
                                             IntegerArgumentType.getInteger($$0x, "width"),
                                             IntegerArgumentType.getInteger($$0x, "width"),
                                             IntegerArgumentType.getInteger($$0x, "width")
                                          )
                                    ))
                                 .then(
                                    ds.a("height", IntegerArgumentType.integer())
                                       .then(
                                          ds.a("depth", IntegerArgumentType.integer())
                                             .executes(
                                                $$0x -> a(
                                                      (dr)$$0x.getSource(),
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
               ((LiteralArgumentBuilder)ds.a("clearall").executes($$0x -> a((dr)$$0x.getSource(), 200)))
                  .then(ds.a("radius", IntegerArgumentType.integer()).executes($$0x -> a((dr)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "radius"))))
            )
      );
   }

   private static int a(dr $$0, String $$1, int $$2, int $$3, int $$4) {
      if ($$2 <= 48 && $$3 <= 48 && $$4 <= 48) {
         akk $$5 = $$0.e();
         gu $$6 = gu.a($$0.d());
         gu $$7 = new gu($$6.u(), $$0.e().a(dkj.a.b, $$6).v(), $$6.w() + 3);
         qe.a($$1.toLowerCase(), $$7, new hz($$2, $$3, $$4), cyy.a, $$5);

         for (int $$8 = 0; $$8 < $$2; $$8++) {
            for (int $$9 = 0; $$9 < $$4; $$9++) {
               gu $$10 = new gu($$7.u() + $$8, $$7.v() + 1, $$7.w() + $$9);
               csm $$11 = csn.h;
               fd $$12 = new fd($$11.n(), Collections.emptySet(), null);
               $$12.a($$5, $$10, 2);
            }
         }

         qe.a($$7, new gu(1, 0, -1), cyy.a, $$5);
         return 0;
      } else {
         throw new IllegalArgumentException("The structure must be less than 48 blocks big in each axis");
      }
   }

   private static int a(dr $$0, String $$1) throws CommandSyntaxException {
      eha $$2 = (eha)$$0.h().a(10.0, 1.0F, false);
      gu $$3 = $$2.a();
      akk $$4 = $$0.e();
      Optional<gu> $$5 = qe.a($$3, 15, $$4);
      if ($$5.isEmpty()) {
         $$5 = qe.a($$3, 200, $$4);
      }

      if ($$5.isEmpty()) {
         $$0.b(tf.b("Can't find a structure block that contains the targeted pos " + $$3));
         return 0;
      } else {
         ddz $$6 = (ddz)$$4.c_($$5.get());
         gu $$7 = $$3.b($$5.get());
         String $$8 = $$7.u() + ", " + $$7.v() + ", " + $$7.w();
         String $$9 = $$6.f();
         tf $$10 = tf.b($$8)
            .b(
               ub.a
                  .a(true)
                  .a(n.k)
                  .a(new tk(tk.a.a, tf.b("Click to copy to clipboard")))
                  .a(new td(td.a.f, "final BlockPos " + $$1 + " = new BlockPos(" + $$8 + ");"))
            );
         $$0.a(() -> tf.b("Position relative to " + $$9 + ": ").b($$10), false);
         aav.a($$4, new gu($$3), $$8, -2147418368, 10000);
         return 1;
      }
   }

   private static int a(dr $$0) {
      gu $$1 = gu.a($$0.d());
      akk $$2 = $$0.e();
      gu $$3 = qe.b($$1, 15, $$2);
      if ($$3 == null) {
         a($$2, "Couldn't find any structure block within 15 radius", n.m);
         return 0;
      } else {
         pu.a($$2);
         a($$2, $$3, null);
         return 1;
      }
   }

   private static int b(dr $$0) {
      gu $$1 = gu.a($$0.d());
      akk $$2 = $$0.e();
      Collection<gu> $$3 = qe.c($$1, 200, $$2);
      if ($$3.isEmpty()) {
         a($$2, "Couldn't find any structure blocks within 200 block radius", n.m);
         return 1;
      } else {
         pu.a($$2);
         b($$0, "Running " + $$3.size() + " tests...");
         qc $$4 = new qc();
         $$3.forEach($$2x -> a($$2, $$2x, $$4));
         return 1;
      }
   }

   private static void a(akk $$0, gu $$1, @Nullable qc $$2) {
      ddz $$3 = (ddz)$$0.c_($$1);
      String $$4 = $$3.f();
      qi $$5 = pt.f($$4);
      pr $$6 = new pr($$5, $$3.w(), $$0);
      if ($$2 != null) {
         $$2.a($$6);
         $$6.a(new qh.a($$0, $$2));
      }

      a($$5, $$0);
      egz $$7 = qe.a($$3);
      gu $$8 = gu.a($$7.a, $$7.b, $$7.c);
      pu.a($$6, $$8, px.a);
   }

   static void a(akk $$0, qc $$1) {
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

   private static int a(dr $$0, int $$1) {
      akk $$2 = $$0.e();
      pu.a($$2);
      gu $$3 = gu.a($$0.d().c, (double)$$0.e().a(dkj.a.b, gu.a($$0.d())).v(), $$0.d().e);
      pu.a($$2, $$3, px.a, arp.a($$1, 0, 1024));
      return 1;
   }

   private static int a(dr $$0, qi $$1, int $$2) {
      akk $$3 = $$0.e();
      gu $$4 = gu.a($$0.d());
      int $$5 = $$0.e().a(dkj.a.b, $$4).v();
      gu $$6 = new gu($$4.u(), $$5, $$4.w() + 3);
      pu.a($$3);
      a($$1, $$3);
      cyy $$7 = qe.a($$2);
      pr $$8 = new pr($$1, $$7, $$3);
      pu.a($$8, $$6, px.a);
      return 1;
   }

   private static void a(qi $$0, akk $$1) {
      Consumer<akk> $$2 = pt.c($$0.e());
      if ($$2 != null) {
         $$2.accept($$1);
      }
   }

   private static int a(dr $$0, int $$1, int $$2) {
      pu.a($$0.e());
      Collection<qi> $$3 = pt.a();
      b($$0, "Running all " + $$3.size() + " tests...");
      pt.d();
      a($$0, $$3, $$1, $$2);
      return 1;
   }

   private static int a(dr $$0, String $$1, int $$2, int $$3) {
      Collection<qi> $$4 = pt.a($$1);
      pu.a($$0.e());
      b($$0, "Running " + $$4.size() + " tests from " + $$1 + "...");
      pt.d();
      a($$0, $$4, $$2, $$3);
      return 1;
   }

   private static int a(dr $$0, boolean $$1, int $$2, int $$3) {
      Collection<qi> $$4;
      if ($$1) {
         $$4 = pt.c().stream().filter(qi::d).collect(Collectors.toList());
      } else {
         $$4 = pt.c();
      }

      if ($$4.isEmpty()) {
         b($$0, "No failed tests to rerun");
         return 0;
      } else {
         pu.a($$0.e());
         b($$0, "Rerunning " + $$4.size() + " failed tests (" + ($$1 ? "only required tests" : "including optional tests") + ")");
         a($$0, $$4, $$2, $$3);
         return 1;
      }
   }

   private static void a(dr $$0, Collection<qi> $$1, int $$2, int $$3) {
      gu $$4 = gu.a($$0.d());
      gu $$5 = new gu($$4.u(), $$0.e().a(dkj.a.b, $$4).v(), $$4.w() + 3);
      akk $$6 = $$0.e();
      cyy $$7 = qe.a($$2);
      Collection<pr> $$8 = pu.b($$1, $$5, $$7, $$6, px.a, $$3);
      qc $$9 = new qc($$8);
      $$9.a(new qh.a($$6, $$9));
      $$9.a($$0x -> pt.a($$0x.v()));
   }

   private static void b(dr $$0, String $$1) {
      $$0.a(() -> tf.b($$1), false);
   }

   private static int c(dr $$0) {
      gu $$1 = gu.a($$0.d());
      akk $$2 = $$0.e();
      gu $$3 = qe.b($$1, 15, $$2);
      if ($$3 == null) {
         a($$2, "Couldn't find any structure block within 15 radius", n.m);
         return 0;
      } else {
         ddz $$4 = (ddz)$$2.c_($$3);
         String $$5 = $$4.f();
         return c($$0, $$5);
      }
   }

   private static int d(dr $$0) {
      gu $$1 = gu.a($$0.d());
      akk $$2 = $$0.e();
      Collection<gu> $$3 = qe.c($$1, 200, $$2);
      if ($$3.isEmpty()) {
         a($$2, "Couldn't find any structure blocks within 200 block radius", n.m);
         return 1;
      } else {
         boolean $$4 = true;

         for (gu $$5 : $$3) {
            ddz $$6 = (ddz)$$2.c_($$5);
            String $$7 = $$6.f();
            if (c($$0, $$7) != 0) {
               $$4 = false;
            }
         }

         return $$4 ? 0 : 1;
      }
   }

   private static int c(dr $$0, String $$1) {
      Path $$2 = Paths.get(qe.b);
      aer $$3 = new aer("minecraft", $$1);
      Path $$4 = $$0.e().p().a($$3, ".nbt");
      Path $$5 = mg.a(jg.a, $$4, $$1, $$2);
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

   private static int d(dr $$0, String $$1) {
      Path $$2 = Paths.get(qe.b, $$1 + ".snbt");
      aer $$3 = new aer("minecraft", $$1);
      Path $$4 = $$0.e().p().a($$3, ".nbt");

      try {
         BufferedReader $$5 = Files.newBufferedReader($$2);
         String $$6 = IOUtils.toString($$5);
         Files.createDirectories($$4.getParent());

         try (OutputStream $$7 = Files.newOutputStream($$4)) {
            rb.a(rd.a($$6), $$7);
         }

         b($$0, "Imported to " + $$4.toAbsolutePath());
         return 0;
      } catch (CommandSyntaxException | IOException var12) {
         a.error("Failed to load structure {}", $$1, var12);
         return 1;
      }
   }

   private static void a(akk $$0, String $$1, n $$2) {
      $$0.a($$0x -> true).forEach($$2x -> $$2x.a(tf.b($$2 + $$1)));
   }

   static class a implements ps {
      private final akk a;
      private final qc b;

      public a(akk $$0, qc $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public void a(pr $$0) {
      }

      @Override
      public void b(pr $$0) {
         qh.a(this.a, this.b);
      }

      @Override
      public void c(pr $$0) {
         qh.a(this.a, this.b);
      }
   }
}
