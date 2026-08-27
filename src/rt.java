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

public class rt {
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

   public static void a(CommandDispatcher<du> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dv.a(
                                                "test"
                                             )
                                             .then(
                                                ((LiteralArgumentBuilder)dv.a("runthis").executes($$0x -> a((du)$$0x.getSource(), false)))
                                                   .then(dv.a("untilFailed").executes($$0x -> a((du)$$0x.getSource(), true)))
                                             ))
                                          .then(dv.a("runthese").executes($$0x -> b((du)$$0x.getSource(), false))))
                                       .then(
                                          ((LiteralArgumentBuilder)dv.a("runfailed").executes($$0x -> a((du)$$0x.getSource(), false, 0, 8)))
                                             .then(
                                                ((RequiredArgumentBuilder)dv.a("onlyRequiredTests", BoolArgumentType.bool())
                                                      .executes($$0x -> a((du)$$0x.getSource(), BoolArgumentType.getBool($$0x, "onlyRequiredTests"), 0, 8)))
                                                   .then(
                                                      ((RequiredArgumentBuilder)dv.a("rotationSteps", IntegerArgumentType.integer())
                                                            .executes(
                                                               $$0x -> a(
                                                                     (du)$$0x.getSource(),
                                                                     BoolArgumentType.getBool($$0x, "onlyRequiredTests"),
                                                                     IntegerArgumentType.getInteger($$0x, "rotationSteps"),
                                                                     8
                                                                  )
                                                            ))
                                                         .then(
                                                            dv.a("testsPerRow", IntegerArgumentType.integer())
                                                               .executes(
                                                                  $$0x -> a(
                                                                        (du)$$0x.getSource(),
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
                                       dv.a("run")
                                          .then(
                                             ((RequiredArgumentBuilder)dv.a("testName", rv.a())
                                                   .executes($$0x -> a((du)$$0x.getSource(), rv.a($$0x, "testName"), 0)))
                                                .then(
                                                   dv.a("rotationSteps", IntegerArgumentType.integer())
                                                      .executes(
                                                         $$0x -> a(
                                                               (du)$$0x.getSource(),
                                                               rv.a($$0x, "testName"),
                                                               IntegerArgumentType.getInteger($$0x, "rotationSteps")
                                                            )
                                                      )
                                                )
                                          )
                                    ))
                                 .then(
                                    ((LiteralArgumentBuilder)((LiteralArgumentBuilder)dv.a("runall").executes($$0x -> a((du)$$0x.getSource(), 0, 8)))
                                          .then(
                                             ((RequiredArgumentBuilder)dv.a("testClassName", rs.a())
                                                   .executes($$0x -> a((du)$$0x.getSource(), rs.a($$0x, "testClassName"), 0, 8)))
                                                .then(
                                                   ((RequiredArgumentBuilder)dv.a("rotationSteps", IntegerArgumentType.integer())
                                                         .executes(
                                                            $$0x -> a(
                                                                  (du)$$0x.getSource(),
                                                                  rs.a($$0x, "testClassName"),
                                                                  IntegerArgumentType.getInteger($$0x, "rotationSteps"),
                                                                  8
                                                               )
                                                         ))
                                                      .then(
                                                         dv.a("testsPerRow", IntegerArgumentType.integer())
                                                            .executes(
                                                               $$0x -> a(
                                                                     (du)$$0x.getSource(),
                                                                     rs.a($$0x, "testClassName"),
                                                                     IntegerArgumentType.getInteger($$0x, "rotationSteps"),
                                                                     IntegerArgumentType.getInteger($$0x, "testsPerRow")
                                                                  )
                                                            )
                                                      )
                                                )
                                          ))
                                       .then(
                                          ((RequiredArgumentBuilder)dv.a("rotationSteps", IntegerArgumentType.integer())
                                                .executes($$0x -> a((du)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "rotationSteps"), 8)))
                                             .then(
                                                dv.a("testsPerRow", IntegerArgumentType.integer())
                                                   .executes(
                                                      $$0x -> a(
                                                            (du)$$0x.getSource(),
                                                            IntegerArgumentType.getInteger($$0x, "rotationSteps"),
                                                            IntegerArgumentType.getInteger($$0x, "testsPerRow")
                                                         )
                                                   )
                                             )
                                       )
                                 ))
                              .then(
                                 dv.a("export")
                                    .then(
                                       dv.a("testName", StringArgumentType.word())
                                          .executes($$0x -> c((du)$$0x.getSource(), StringArgumentType.getString($$0x, "testName")))
                                    )
                              ))
                           .then(dv.a("exportthis").executes($$0x -> b((du)$$0x.getSource()))))
                        .then(dv.a("exportthese").executes($$0x -> c((du)$$0x.getSource()))))
                     .then(
                        dv.a("import")
                           .then(
                              dv.a("testName", StringArgumentType.word())
                                 .executes($$0x -> d((du)$$0x.getSource(), StringArgumentType.getString($$0x, "testName")))
                           )
                     ))
                  .then(
                     ((LiteralArgumentBuilder)dv.a("pos").executes($$0x -> a((du)$$0x.getSource(), "pos")))
                        .then(dv.a("var", StringArgumentType.word()).executes($$0x -> a((du)$$0x.getSource(), StringArgumentType.getString($$0x, "var"))))
                  ))
               .then(
                  dv.a("create")
                     .then(
                        ((RequiredArgumentBuilder)dv.a("testName", StringArgumentType.word())
                              .executes($$0x -> a((du)$$0x.getSource(), StringArgumentType.getString($$0x, "testName"), 5, 5, 5)))
                           .then(
                              ((RequiredArgumentBuilder)dv.a("width", IntegerArgumentType.integer())
                                    .executes(
                                       $$0x -> a(
                                             (du)$$0x.getSource(),
                                             StringArgumentType.getString($$0x, "testName"),
                                             IntegerArgumentType.getInteger($$0x, "width"),
                                             IntegerArgumentType.getInteger($$0x, "width"),
                                             IntegerArgumentType.getInteger($$0x, "width")
                                          )
                                    ))
                                 .then(
                                    dv.a("height", IntegerArgumentType.integer())
                                       .then(
                                          dv.a("depth", IntegerArgumentType.integer())
                                             .executes(
                                                $$0x -> a(
                                                      (du)$$0x.getSource(),
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
               ((LiteralArgumentBuilder)dv.a("clearall").executes($$0x -> a((du)$$0x.getSource(), 200)))
                  .then(dv.a("radius", IntegerArgumentType.integer()).executes($$0x -> a((du)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "radius"))))
            )
      );
   }

   private static int a(du $$0, String $$1, int $$2, int $$3, int $$4) {
      if ($$2 <= 48 && $$3 <= 48 && $$4 <= 48) {
         ami $$5 = $$0.e();
         hx $$6 = a($$0).d();
         rr.a($$1.toLowerCase(), $$6, new ja($$2, $$3, $$4), dbr.a, $$5);

         for (int $$7 = 0; $$7 < $$2; $$7++) {
            for (int $$8 = 0; $$8 < $$4; $$8++) {
               hx $$9 = new hx($$6.u() + $$7, $$6.v() + 1, $$6.w() + $$8);
               cvf $$10 = cvh.h;
               fh $$11 = new fh($$10.o(), Collections.emptySet(), null);
               $$11.a($$5, $$9, 2);
            }
         }

         rr.a($$6, new hx(1, 0, -1), dbr.a, $$5);
         return 0;
      } else {
         throw new IllegalArgumentException("The structure must be less than 48 blocks big in each axis");
      }
   }

   private static int a(du $$0, String $$1) throws CommandSyntaxException {
      ejv $$2 = (ejv)$$0.h().a(10.0, 1.0F, false);
      hx $$3 = $$2.a();
      ami $$4 = $$0.e();
      Optional<hx> $$5 = rr.a($$3, 15, $$4);
      if ($$5.isEmpty()) {
         $$5 = rr.a($$3, 200, $$4);
      }

      if ($$5.isEmpty()) {
         $$0.b(uv.b("Can't find a structure block that contains the targeted pos " + $$3));
         return 0;
      } else {
         dgw $$6 = (dgw)$$4.c_($$5.get());
         hx $$7 = $$3.b($$5.get());
         String $$8 = $$7.u() + ", " + $$7.v() + ", " + $$7.w();
         String $$9 = $$6.f();
         uv $$10 = uv.b($$8)
            .b(
               vs.a
                  .a(true)
                  .a(n.k)
                  .a(new vb(vb.a.a, uv.b("Click to copy to clipboard")))
                  .a(new ut(ut.a.f, "final BlockPos " + $$1 + " = new BlockPos(" + $$8 + ");"))
            );
         $$0.a(() -> uv.b("Position relative to " + $$9 + ": ").b($$10), false);
         aco.a($$4, new hx($$3), $$8, -2147418368, 10000);
         return 1;
      }
   }

   private static int a(du $$0, boolean $$1) {
      hx $$2 = hx.a($$0.d());
      ami $$3 = $$0.e();
      hx $$4 = rr.b($$2, 15, $$3);
      if ($$4 == null) {
         a($$3, "Couldn't find any structure block within 15 radius", n.m);
         return 0;
      } else {
         rh.a($$3);
         a($$3, $$4, null, $$1);
         return 1;
      }
   }

   private static int b(du $$0, boolean $$1) {
      hx $$2 = hx.a($$0.d());
      ami $$3 = $$0.e();
      Collection<hx> $$4 = rr.c($$2, 200, $$3);
      if ($$4.isEmpty()) {
         a($$3, "Couldn't find any structure blocks within 200 block radius", n.m);
         return 1;
      } else {
         rh.a($$3);
         b($$0, "Running " + $$4.size() + " tests...");
         rp $$5 = new rp();
         $$4.forEach($$3x -> a($$3, $$3x, $$5, $$1));
         return 1;
      }
   }

   private static void a(ami $$0, hx $$1, @Nullable rp $$2, boolean $$3) {
      dgw $$4 = (dgw)$$0.c_($$1);
      String $$5 = $$4.f();
      Optional<ru> $$6 = rg.e($$5);
      if ($$6.isEmpty()) {
         a($$0, "Test function for test " + $$5 + " could not be found", n.m);
      } else {
         ru $$7 = $$6.get();
         re $$8 = new re($$7, $$4.w(), $$0);
         $$8.a($$3);
         if ($$2 != null) {
            $$2.a($$8);
            $$8.a(new rt.a($$0, $$2));
         }

         if (a($$0, $$8)) {
            a($$7, $$0);
            dxe $$9 = rr.b($$4);
            hx $$10 = new hx($$9.h(), $$9.i(), $$9.j());
            rh.a($$8, $$10, rk.a);
         }
      }
   }

   private static boolean a(ami $$0, re $$1) {
      if ($$0.p().b(new agm($$1.u())).isEmpty()) {
         a($$0, "Test structure " + $$1.u() + " could not be found", n.m);
         return false;
      } else {
         return true;
      }
   }

   static void a(ami $$0, rp $$1) {
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

   private static int a(du $$0, int $$1) {
      ami $$2 = $$0.e();
      rh.a($$2);
      hx $$3 = hx.a($$0.d().c, (double)$$0.e().a(dmw.a.b, hx.a($$0.d())).v(), $$0.d().e);
      rh.a($$2, $$3, rk.a, atq.a($$1, 0, 1024));
      return 1;
   }

   private static int a(du $$0, ru $$1, int $$2) {
      ami $$3 = $$0.e();
      hx $$4 = a($$0);
      rh.a($$3);
      a($$1, $$3);
      dbr $$5 = rr.a($$2);
      re $$6 = new re($$1, $$5, $$3);
      if (!a($$3, $$6)) {
         return 0;
      } else {
         rh.a($$6, $$4, rk.a);
         return 1;
      }
   }

   private static hx a(du $$0) {
      hx $$1 = hx.a($$0.d());
      int $$2 = $$0.e().a(dmw.a.b, $$1).v();
      return new hx($$1.u(), $$2 + 1, $$1.w() + 3);
   }

   private static void a(ru $$0, ami $$1) {
      Consumer<ami> $$2 = rg.c($$0.e());
      if ($$2 != null) {
         $$2.accept($$1);
      }
   }

   private static int a(du $$0, int $$1, int $$2) {
      rh.a($$0.e());
      Collection<ru> $$3 = rg.a();
      b($$0, "Running all " + $$3.size() + " tests...");
      rg.d();
      a($$0, $$3, $$1, $$2);
      return 1;
   }

   private static int a(du $$0, String $$1, int $$2, int $$3) {
      Collection<ru> $$4 = rg.a($$1);
      rh.a($$0.e());
      b($$0, "Running " + $$4.size() + " tests from " + $$1 + "...");
      rg.d();
      a($$0, $$4, $$2, $$3);
      return 1;
   }

   private static int a(du $$0, boolean $$1, int $$2, int $$3) {
      Collection<ru> $$4;
      if ($$1) {
         $$4 = rg.c().stream().filter(ru::d).collect(Collectors.toList());
      } else {
         $$4 = rg.c();
      }

      if ($$4.isEmpty()) {
         b($$0, "No failed tests to rerun");
         return 0;
      } else {
         rh.a($$0.e());
         b($$0, "Rerunning " + $$4.size() + " failed tests (" + ($$1 ? "only required tests" : "including optional tests") + ")");
         a($$0, $$4, $$2, $$3);
         return 1;
      }
   }

   private static void a(du $$0, Collection<ru> $$1, int $$2, int $$3) {
      hx $$4 = a($$0);
      ami $$5 = $$0.e();
      dbr $$6 = rr.a($$2);
      Collection<re> $$7 = rh.b($$1, $$4, $$6, $$5, rk.a, $$3);
      rp $$8 = new rp($$7);
      $$8.a(new rt.a($$5, $$8));
      $$8.a($$0x -> rg.a($$0x.w()));
   }

   private static void b(du $$0, String $$1) {
      $$0.a(() -> uv.b($$1), false);
   }

   private static int b(du $$0) {
      hx $$1 = hx.a($$0.d());
      ami $$2 = $$0.e();
      hx $$3 = rr.b($$1, 15, $$2);
      if ($$3 == null) {
         a($$2, "Couldn't find any structure block within 15 radius", n.m);
         return 0;
      } else {
         dgw $$4 = (dgw)$$2.c_($$3);
         return a($$0, $$4);
      }
   }

   private static int c(du $$0) {
      hx $$1 = hx.a($$0.d());
      ami $$2 = $$0.e();
      Collection<hx> $$3 = rr.c($$1, 200, $$2);
      if ($$3.isEmpty()) {
         a($$2, "Couldn't find any structure blocks within 200 block radius", n.m);
         return 1;
      } else {
         boolean $$4 = true;

         for (hx $$5 : $$3) {
            dgw $$6 = (dgw)$$2.c_($$5);
            if (a($$0, $$6) != 0) {
               $$4 = false;
            }
         }

         return $$4 ? 0 : 1;
      }
   }

   private static int a(du $$0, dgw $$1) {
      if (!$$1.b(true)) {
         b($$0, "Failed to save structure " + $$1.d());
      }

      return c($$0, $$1.d());
   }

   private static int c(du $$0, String $$1) {
      Path $$2 = Paths.get(rr.b);
      agm $$3 = new agm("minecraft", $$1);
      Path $$4 = $$0.e().p().a($$3, ".nbt");
      Path $$5 = np.a(kh.a, $$4, $$1, $$2);
      if ($$5 == null) {
         b($$0, "Failed to export " + $$4);
         return 1;
      } else {
         try {
            v.c($$5.getParent());
         } catch (IOException var7) {
            b($$0, "Could not create folder " + $$5.getParent());
            a.error("Could not create export folder", var7);
            return 1;
         }

         b($$0, "Exported " + $$1 + " to " + $$5.toAbsolutePath());
         return 0;
      }
   }

   private static int d(du $$0, String $$1) {
      Path $$2 = Paths.get(rr.b, $$1 + ".snbt");
      agm $$3 = new agm("minecraft", $$1);
      Path $$4 = $$0.e().p().a($$3, ".nbt");

      try {
         BufferedReader $$5 = Files.newBufferedReader($$2);
         String $$6 = IOUtils.toString($$5);
         Files.createDirectories($$4.getParent());

         try (OutputStream $$7 = Files.newOutputStream($$4)) {
            sq.a(ss.a($$6), $$7);
         }

         b($$0, "Imported to " + $$4.toAbsolutePath());
         return 0;
      } catch (CommandSyntaxException | IOException var12) {
         a.error("Failed to load structure {}", $$1, var12);
         return 1;
      }
   }

   private static void a(ami $$0, String $$1, n $$2) {
      $$0.a($$0x -> true).forEach($$2x -> $$2x.a(uv.b($$2 + $$1)));
   }

   static class a implements rf {
      private final ami a;
      private final rp b;

      public a(ami $$0, rp $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public void a(re $$0) {
      }

      @Override
      public void b(re $$0) {
         rt.a(this.a, this.b);
      }

      @Override
      public void c(re $$0) {
         rt.a(this.a, this.b);
      }
   }
}
