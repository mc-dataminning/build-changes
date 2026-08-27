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

public class se {
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
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a(
                                                   "test"
                                                )
                                                .then(
                                                   ((LiteralArgumentBuilder)dt.a("runthis").executes($$0x -> a((ds)$$0x.getSource(), false)))
                                                      .then(dt.a("untilFailed").executes($$0x -> a((ds)$$0x.getSource(), true)))
                                                ))
                                             .then(dt.a("resetthis").executes($$0x -> a((ds)$$0x.getSource()))))
                                          .then(dt.a("runthese").executes($$0x -> b((ds)$$0x.getSource(), false))))
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
                                             ((RequiredArgumentBuilder)dt.a("testName", sg.a())
                                                   .executes($$0x -> a((ds)$$0x.getSource(), sg.a($$0x, "testName"), 0)))
                                                .then(
                                                   dt.a("rotationSteps", IntegerArgumentType.integer())
                                                      .executes(
                                                         $$0x -> a(
                                                               (ds)$$0x.getSource(),
                                                               sg.a($$0x, "testName"),
                                                               IntegerArgumentType.getInteger($$0x, "rotationSteps")
                                                            )
                                                      )
                                                )
                                          )
                                    ))
                                 .then(
                                    ((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("runall").executes($$0x -> a((ds)$$0x.getSource(), 0, 8)))
                                          .then(
                                             ((RequiredArgumentBuilder)dt.a("testClassName", sd.a())
                                                   .executes($$0x -> a((ds)$$0x.getSource(), sd.a($$0x, "testClassName"), 0, 8)))
                                                .then(
                                                   ((RequiredArgumentBuilder)dt.a("rotationSteps", IntegerArgumentType.integer())
                                                         .executes(
                                                            $$0x -> a(
                                                                  (ds)$$0x.getSource(),
                                                                  sd.a($$0x, "testClassName"),
                                                                  IntegerArgumentType.getInteger($$0x, "rotationSteps"),
                                                                  8
                                                               )
                                                         ))
                                                      .then(
                                                         dt.a("testsPerRow", IntegerArgumentType.integer())
                                                            .executes(
                                                               $$0x -> a(
                                                                     (ds)$$0x.getSource(),
                                                                     sd.a($$0x, "testClassName"),
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
         ane $$5 = $$0.e();
         hx $$6 = b($$0).d();
         sc.a($$1.toLowerCase(), $$6, new jb($$2, $$3, $$4), ddk.a, $$5);

         for (int $$7 = 0; $$7 < $$2; $$7++) {
            for (int $$8 = 0; $$8 < $$4; $$8++) {
               hx $$9 = new hx($$6.u() + $$7, $$6.v() + 1, $$6.w() + $$8);
               cwy $$10 = cxa.h;
               fh $$11 = new fh($$10.o(), Collections.emptySet(), null);
               $$11.a($$5, $$9, 2);
            }
         }

         sc.a($$6, new hx(1, 0, -1), ddk.a, $$5);
         return 0;
      } else {
         throw new IllegalArgumentException("The structure must be less than 48 blocks big in each axis");
      }
   }

   private static int a(ds $$0, String $$1) throws CommandSyntaxException {
      ely $$2 = (ely)$$0.h().a(10.0, 1.0F, false);
      hx $$3 = $$2.a();
      ane $$4 = $$0.e();
      Optional<hx> $$5 = sc.a($$3, 15, $$4);
      if ($$5.isEmpty()) {
         $$5 = sc.a($$3, 200, $$4);
      }

      if ($$5.isEmpty()) {
         $$0.b(vg.b("Can't find a structure block that contains the targeted pos " + $$3));
         return 0;
      } else {
         dir $$6 = (dir)$$4.c_($$5.get());
         hx $$7 = $$3.b($$5.get());
         String $$8 = $$7.u() + ", " + $$7.v() + ", " + $$7.w();
         String $$9 = $$6.w();
         vg $$10 = vg.b($$8)
            .b(
               wd.a
                  .a(true)
                  .a(n.k)
                  .a(new vm(vm.a.a, vg.b("Click to copy to clipboard")))
                  .a(new ve(ve.a.f, "final BlockPos " + $$1 + " = new BlockPos(" + $$8 + ");"))
            );
         $$0.a(() -> vg.b("Position relative to " + $$9 + ": ").b($$10), false);
         adj.a($$4, new hx($$3), $$8, -2147418368, 10000);
         return 1;
      }
   }

   private static int a(ds $$0, boolean $$1) {
      hx $$2 = hx.a($$0.d());
      ane $$3 = $$0.e();
      hx $$4 = sc.b($$2, 15, $$3);
      if ($$4 == null) {
         a($$3, "Couldn't find any structure block within 15 radius", n.m);
         return 0;
      } else {
         rs.a($$3);
         a($$3, $$4, null, $$1);
         return 1;
      }
   }

   private static int a(ds $$0) {
      hx $$1 = hx.a($$0.d());
      ane $$2 = $$0.e();
      hx $$3 = sc.b($$1, 15, $$2);
      if ($$3 == null) {
         a($$2, "Couldn't find any structure block within 15 radius", n.m);
         return 0;
      } else {
         dir $$4 = (dir)$$2.c_($$3);
         $$4.c($$2);
         String $$5 = $$4.w();
         sf $$6 = rr.f($$5);
         a($$2, "Reset succeded for: " + $$6, n.k);
         return 1;
      }
   }

   private static int b(ds $$0, boolean $$1) {
      hx $$2 = hx.a($$0.d());
      ane $$3 = $$0.e();
      Collection<hx> $$4 = sc.c($$2, 200, $$3);
      if ($$4.isEmpty()) {
         a($$3, "Couldn't find any structure blocks within 200 block radius", n.m);
         return 1;
      } else {
         rs.a($$3);
         b($$0, "Running " + $$4.size() + " tests...");
         sa $$5 = new sa();
         $$4.forEach($$3x -> a($$3, $$3x, $$5, $$1));
         return 1;
      }
   }

   private static void a(ane $$0, hx $$1, @Nullable sa $$2, boolean $$3) {
      dir $$4 = (dir)$$0.c_($$1);
      String $$5 = $$4.w();
      Optional<sf> $$6 = rr.e($$5);
      if ($$6.isEmpty()) {
         a($$0, "Test function for test " + $$5 + " could not be found", n.m);
      } else {
         sf $$7 = $$6.get();
         rp $$8 = new rp($$7, $$4.m(), $$0);
         $$8.a($$3);
         if ($$2 != null) {
            $$2.a($$8);
            $$8.a(new se.a($$0, $$2));
         }

         if (a($$0, $$8)) {
            a($$7, $$0);
            dzg $$9 = sc.b($$4);
            hx $$10 = new hx($$9.h(), $$9.i(), $$9.j());
            rs.a($$8, $$10, rv.a);
         }
      }
   }

   private static boolean a(ane $$0, rp $$1) {
      if ($$0.q().b(new ahh($$1.u())).isEmpty()) {
         a($$0, "Test structure " + $$1.u() + " could not be found", n.m);
         return false;
      } else {
         return true;
      }
   }

   static void a(ane $$0, sa $$1) {
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
      ane $$2 = $$0.e();
      rs.a($$2);
      hx $$3 = hx.a($$0.d().c, (double)$$0.e().a(doy.a.b, hx.a($$0.d())).v(), $$0.d().e);
      rs.a($$2, $$3, rv.a, aup.a($$1, 0, 1024));
      return 1;
   }

   private static int a(ds $$0, sf $$1, int $$2) {
      ane $$3 = $$0.e();
      hx $$4 = b($$0);
      rs.a($$3);
      a($$1, $$3);
      ddk $$5 = sc.a($$2);
      rp $$6 = new rp($$1, $$5, $$3);
      if (!a($$3, $$6)) {
         return 0;
      } else {
         rs.a($$6, $$4, rv.a);
         return 1;
      }
   }

   private static hx b(ds $$0) {
      hx $$1 = hx.a($$0.d());
      int $$2 = $$0.e().a(doy.a.b, $$1).v();
      return new hx($$1.u(), $$2 + 1, $$1.w() + 3);
   }

   private static void a(sf $$0, ane $$1) {
      Consumer<ane> $$2 = rr.c($$0.e());
      if ($$2 != null) {
         $$2.accept($$1);
      }
   }

   private static int a(ds $$0, int $$1, int $$2) {
      rs.a($$0.e());
      Collection<sf> $$3 = rr.a();
      b($$0, "Running all " + $$3.size() + " tests...");
      rr.d();
      a($$0, $$3, $$1, $$2);
      return 1;
   }

   private static int a(ds $$0, String $$1, int $$2, int $$3) {
      Collection<sf> $$4 = rr.a($$1);
      rs.a($$0.e());
      b($$0, "Running " + $$4.size() + " tests from " + $$1 + "...");
      rr.d();
      a($$0, $$4, $$2, $$3);
      return 1;
   }

   private static int a(ds $$0, boolean $$1, int $$2, int $$3) {
      Collection<sf> $$4;
      if ($$1) {
         $$4 = rr.c().stream().filter(sf::d).collect(Collectors.toList());
      } else {
         $$4 = rr.c();
      }

      if ($$4.isEmpty()) {
         b($$0, "No failed tests to rerun");
         return 0;
      } else {
         rs.a($$0.e());
         b($$0, "Rerunning " + $$4.size() + " failed tests (" + ($$1 ? "only required tests" : "including optional tests") + ")");
         a($$0, $$4, $$2, $$3);
         return 1;
      }
   }

   private static void a(ds $$0, Collection<sf> $$1, int $$2, int $$3) {
      hx $$4 = b($$0);
      ane $$5 = $$0.e();
      ddk $$6 = sc.a($$2);
      Collection<rp> $$7 = rs.b($$1, $$4, $$6, $$5, rv.a, $$3);
      sa $$8 = new sa($$7);
      $$8.a(new se.a($$5, $$8));
      $$8.a($$0x -> rr.a($$0x.w()));
   }

   private static void b(ds $$0, String $$1) {
      $$0.a(() -> vg.b($$1), false);
   }

   private static int c(ds $$0) {
      hx $$1 = hx.a($$0.d());
      ane $$2 = $$0.e();
      hx $$3 = sc.b($$1, 15, $$2);
      if ($$3 == null) {
         a($$2, "Couldn't find any structure block within 15 radius", n.m);
         return 0;
      } else {
         dir $$4 = (dir)$$2.c_($$3);
         return a($$0, $$4);
      }
   }

   private static int d(ds $$0) {
      hx $$1 = hx.a($$0.d());
      ane $$2 = $$0.e();
      Collection<hx> $$3 = sc.c($$1, 200, $$2);
      if ($$3.isEmpty()) {
         a($$2, "Couldn't find any structure blocks within 200 block radius", n.m);
         return 1;
      } else {
         boolean $$4 = true;

         for (hx $$5 : $$3) {
            dir $$6 = (dir)$$2.c_($$5);
            if (a($$0, $$6) != 0) {
               $$4 = false;
            }
         }

         return $$4 ? 0 : 1;
      }
   }

   private static int a(ds $$0, dir $$1) {
      String $$2 = $$1.d();
      if (!$$1.b(true)) {
         b($$0, "Failed to save structure " + $$2);
      }

      return c($$0, $$2);
   }

   private static int c(ds $$0, String $$1) {
      Path $$2 = Paths.get(sc.b);
      ahh $$3 = new ahh($$1);
      Path $$4 = $$0.e().q().a($$3, ".nbt");
      Path $$5 = nr.a(ki.a, $$4, $$3.a(), $$2);
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

   private static int d(ds $$0, String $$1) {
      Path $$2 = Paths.get(sc.b, $$1 + ".snbt");
      ahh $$3 = new ahh($$1);
      Path $$4 = $$0.e().q().a($$3, ".nbt");

      try {
         BufferedReader $$5 = Files.newBufferedReader($$2);
         String $$6 = IOUtils.toString($$5);
         Files.createDirectories($$4.getParent());

         try (OutputStream $$7 = Files.newOutputStream($$4)) {
            tb.a(td.a($$6), $$7);
         }

         b($$0, "Imported to " + $$4.toAbsolutePath());
         return 0;
      } catch (CommandSyntaxException | IOException var12) {
         a.error("Failed to load structure {}", $$1, var12);
         return 1;
      }
   }

   private static void a(ane $$0, String $$1, n $$2) {
      $$0.a($$0x -> true).forEach($$2x -> $$2x.a(vg.b($$1).a($$2)));
   }

   static class a implements rq {
      private final ane a;
      private final sa b;

      public a(ane $$0, sa $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public void a(rp $$0) {
      }

      @Override
      public void b(rp $$0) {
         se.a(this.a, this.b);
      }

      @Override
      public void c(rp $$0) {
         se.a(this.a, this.b);
      }
   }
}
