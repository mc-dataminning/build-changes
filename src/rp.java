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

public class rp {
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
                                             ((RequiredArgumentBuilder)dv.a("testName", rr.a())
                                                   .executes($$0x -> a((du)$$0x.getSource(), rr.a($$0x, "testName"), 0)))
                                                .then(
                                                   dv.a("rotationSteps", IntegerArgumentType.integer())
                                                      .executes(
                                                         $$0x -> a(
                                                               (du)$$0x.getSource(),
                                                               rr.a($$0x, "testName"),
                                                               IntegerArgumentType.getInteger($$0x, "rotationSteps")
                                                            )
                                                      )
                                                )
                                          )
                                    ))
                                 .then(
                                    ((LiteralArgumentBuilder)((LiteralArgumentBuilder)dv.a("runall").executes($$0x -> a((du)$$0x.getSource(), 0, 8)))
                                          .then(
                                             ((RequiredArgumentBuilder)dv.a("testClassName", ro.a())
                                                   .executes($$0x -> a((du)$$0x.getSource(), ro.a($$0x, "testClassName"), 0, 8)))
                                                .then(
                                                   ((RequiredArgumentBuilder)dv.a("rotationSteps", IntegerArgumentType.integer())
                                                         .executes(
                                                            $$0x -> a(
                                                                  (du)$$0x.getSource(),
                                                                  ro.a($$0x, "testClassName"),
                                                                  IntegerArgumentType.getInteger($$0x, "rotationSteps"),
                                                                  8
                                                               )
                                                         ))
                                                      .then(
                                                         dv.a("testsPerRow", IntegerArgumentType.integer())
                                                            .executes(
                                                               $$0x -> a(
                                                                     (du)$$0x.getSource(),
                                                                     ro.a($$0x, "testClassName"),
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
                           .then(dv.a("exportthis").executes($$0x -> a((du)$$0x.getSource()))))
                        .then(dv.a("exportthese").executes($$0x -> b((du)$$0x.getSource()))))
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
         ama $$5 = $$0.f();
         ht $$6 = ht.a($$0.e());
         ht $$7 = new ht($$6.u(), $$0.f().a(dmf.a.b, $$6).v(), $$6.w() + 3);
         rm.a($$1.toLowerCase(), $$7, new iw($$2, $$3, $$4), dbf.a, $$5);

         for (int $$8 = 0; $$8 < $$2; $$8++) {
            for (int $$9 = 0; $$9 < $$4; $$9++) {
               ht $$10 = new ht($$7.u() + $$8, $$7.v() + 1, $$7.w() + $$9);
               cut $$11 = cuv.h;
               fh $$12 = new fh($$11.o(), Collections.emptySet(), null);
               $$12.a($$5, $$10, 2);
            }
         }

         rm.a($$7, new ht(1, 0, -1), dbf.a, $$5);
         return 0;
      } else {
         throw new IllegalArgumentException("The structure must be less than 48 blocks big in each axis");
      }
   }

   private static int a(du $$0, String $$1) throws CommandSyntaxException {
      eje $$2 = (eje)$$0.i().a(10.0, 1.0F, false);
      ht $$3 = $$2.a();
      ama $$4 = $$0.f();
      Optional<ht> $$5 = rm.a($$3, 15, $$4);
      if ($$5.isEmpty()) {
         $$5 = rm.a($$3, 200, $$4);
      }

      if ($$5.isEmpty()) {
         $$0.b(ur.b("Can't find a structure block that contains the targeted pos " + $$3));
         return 0;
      } else {
         dgf $$6 = (dgf)$$4.c_($$5.get());
         ht $$7 = $$3.b($$5.get());
         String $$8 = $$7.u() + ", " + $$7.v() + ", " + $$7.w();
         String $$9 = $$6.f();
         ur $$10 = ur.b($$8)
            .b(
               vo.a
                  .a(true)
                  .a(n.k)
                  .a(new ux(ux.a.a, ur.b("Click to copy to clipboard")))
                  .a(new up(up.a.f, "final BlockPos " + $$1 + " = new BlockPos(" + $$8 + ");"))
            );
         $$0.a(() -> ur.b("Position relative to " + $$9 + ": ").b($$10), false);
         aci.a($$4, new ht($$3), $$8, -2147418368, 10000);
         return 1;
      }
   }

   private static int a(du $$0, boolean $$1) {
      ht $$2 = ht.a($$0.e());
      ama $$3 = $$0.f();
      ht $$4 = rm.b($$2, 15, $$3);
      if ($$4 == null) {
         a($$3, "Couldn't find any structure block within 15 radius", n.m);
         return 0;
      } else {
         rc.a($$3);
         a($$3, $$4, null, $$1);
         return 1;
      }
   }

   private static int b(du $$0, boolean $$1) {
      ht $$2 = ht.a($$0.e());
      ama $$3 = $$0.f();
      Collection<ht> $$4 = rm.c($$2, 200, $$3);
      if ($$4.isEmpty()) {
         a($$3, "Couldn't find any structure blocks within 200 block radius", n.m);
         return 1;
      } else {
         rc.a($$3);
         b($$0, "Running " + $$4.size() + " tests...");
         rk $$5 = new rk();
         $$4.forEach($$3x -> a($$3, $$3x, $$5, $$1));
         return 1;
      }
   }

   private static void a(ama $$0, ht $$1, @Nullable rk $$2, boolean $$3) {
      dgf $$4 = (dgf)$$0.c_($$1);
      String $$5 = $$4.f();
      rq $$6 = rb.f($$5);
      qz $$7 = new qz($$6, $$4.w(), $$0);
      $$7.a($$3);
      if ($$2 != null) {
         $$2.a($$7);
         $$7.a(new rp.a($$0, $$2));
      }

      a($$6, $$0);
      ejd $$8 = rm.a($$4);
      ht $$9 = ht.a($$8.a, $$8.b, $$8.c);
      rc.a($$7, $$9, rf.a);
   }

   static void a(ama $$0, rk $$1) {
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
      ama $$2 = $$0.f();
      rc.a($$2);
      ht $$3 = ht.a($$0.e().c, (double)$$0.f().a(dmf.a.b, ht.a($$0.e())).v(), $$0.e().e);
      rc.a($$2, $$3, rf.a, ati.a($$1, 0, 1024));
      return 1;
   }

   private static int a(du $$0, rq $$1, int $$2) {
      ama $$3 = $$0.f();
      ht $$4 = ht.a($$0.e());
      int $$5 = $$0.f().a(dmf.a.b, $$4).v();
      ht $$6 = new ht($$4.u(), $$5, $$4.w() + 3);
      rc.a($$3);
      a($$1, $$3);
      dbf $$7 = rm.a($$2);
      qz $$8 = new qz($$1, $$7, $$3);
      rc.a($$8, $$6, rf.a);
      return 1;
   }

   private static void a(rq $$0, ama $$1) {
      Consumer<ama> $$2 = rb.c($$0.e());
      if ($$2 != null) {
         $$2.accept($$1);
      }
   }

   private static int a(du $$0, int $$1, int $$2) {
      rc.a($$0.f());
      Collection<rq> $$3 = rb.a();
      b($$0, "Running all " + $$3.size() + " tests...");
      rb.d();
      a($$0, $$3, $$1, $$2);
      return 1;
   }

   private static int a(du $$0, String $$1, int $$2, int $$3) {
      Collection<rq> $$4 = rb.a($$1);
      rc.a($$0.f());
      b($$0, "Running " + $$4.size() + " tests from " + $$1 + "...");
      rb.d();
      a($$0, $$4, $$2, $$3);
      return 1;
   }

   private static int a(du $$0, boolean $$1, int $$2, int $$3) {
      Collection<rq> $$4;
      if ($$1) {
         $$4 = rb.c().stream().filter(rq::d).collect(Collectors.toList());
      } else {
         $$4 = rb.c();
      }

      if ($$4.isEmpty()) {
         b($$0, "No failed tests to rerun");
         return 0;
      } else {
         rc.a($$0.f());
         b($$0, "Rerunning " + $$4.size() + " failed tests (" + ($$1 ? "only required tests" : "including optional tests") + ")");
         a($$0, $$4, $$2, $$3);
         return 1;
      }
   }

   private static void a(du $$0, Collection<rq> $$1, int $$2, int $$3) {
      ht $$4 = ht.a($$0.e());
      ht $$5 = new ht($$4.u(), $$0.f().a(dmf.a.b, $$4).v(), $$4.w() + 3);
      ama $$6 = $$0.f();
      dbf $$7 = rm.a($$2);
      Collection<qz> $$8 = rc.b($$1, $$5, $$7, $$6, rf.a, $$3);
      rk $$9 = new rk($$8);
      $$9.a(new rp.a($$6, $$9));
      $$9.a($$0x -> rb.a($$0x.v()));
   }

   private static void b(du $$0, String $$1) {
      $$0.a(() -> ur.b($$1), false);
   }

   private static int a(du $$0) {
      ht $$1 = ht.a($$0.e());
      ama $$2 = $$0.f();
      ht $$3 = rm.b($$1, 15, $$2);
      if ($$3 == null) {
         a($$2, "Couldn't find any structure block within 15 radius", n.m);
         return 0;
      } else {
         dgf $$4 = (dgf)$$2.c_($$3);
         String $$5 = $$4.f();
         return c($$0, $$5);
      }
   }

   private static int b(du $$0) {
      ht $$1 = ht.a($$0.e());
      ama $$2 = $$0.f();
      Collection<ht> $$3 = rm.c($$1, 200, $$2);
      if ($$3.isEmpty()) {
         a($$2, "Couldn't find any structure blocks within 200 block radius", n.m);
         return 1;
      } else {
         boolean $$4 = true;

         for (ht $$5 : $$3) {
            dgf $$6 = (dgf)$$2.c_($$5);
            String $$7 = $$6.f();
            if (c($$0, $$7) != 0) {
               $$4 = false;
            }
         }

         return $$4 ? 0 : 1;
      }
   }

   private static int c(du $$0, String $$1) {
      Path $$2 = Paths.get(rm.b);
      agg $$3 = new agg("minecraft", $$1);
      Path $$4 = $$0.f().p().a($$3, ".nbt");
      Path $$5 = nk.a(kd.a, $$4, $$1, $$2);
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

   private static int d(du $$0, String $$1) {
      Path $$2 = Paths.get(rm.b, $$1 + ".snbt");
      agg $$3 = new agg("minecraft", $$1);
      Path $$4 = $$0.f().p().a($$3, ".nbt");

      try {
         BufferedReader $$5 = Files.newBufferedReader($$2);
         String $$6 = IOUtils.toString($$5);
         Files.createDirectories($$4.getParent());

         try (OutputStream $$7 = Files.newOutputStream($$4)) {
            sm.a(so.a($$6), $$7);
         }

         b($$0, "Imported to " + $$4.toAbsolutePath());
         return 0;
      } catch (CommandSyntaxException | IOException var12) {
         a.error("Failed to load structure {}", $$1, var12);
         return 1;
      }
   }

   private static void a(ama $$0, String $$1, n $$2) {
      $$0.a($$0x -> true).forEach($$2x -> $$2x.a(ur.b($$2 + $$1)));
   }

   static class a implements ra {
      private final ama a;
      private final rk b;

      public a(ama $$0, rk $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public void a(qz $$0) {
      }

      @Override
      public void b(qz $$0) {
         rp.a(this.a, this.b);
      }

      @Override
      public void c(qz $$0) {
         rp.a(this.a, this.b);
      }
   }
}
