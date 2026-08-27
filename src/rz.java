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

public class rz {
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
                                             .then(
                                                ((LiteralArgumentBuilder)dt.a("runthis").executes($$0x -> a((ds)$$0x.getSource(), false)))
                                                   .then(dt.a("untilFailed").executes($$0x -> a((ds)$$0x.getSource(), true)))
                                             ))
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
                                             ((RequiredArgumentBuilder)dt.a("testName", sb.a())
                                                   .executes($$0x -> a((ds)$$0x.getSource(), sb.a($$0x, "testName"), 0)))
                                                .then(
                                                   dt.a("rotationSteps", IntegerArgumentType.integer())
                                                      .executes(
                                                         $$0x -> a(
                                                               (ds)$$0x.getSource(),
                                                               sb.a($$0x, "testName"),
                                                               IntegerArgumentType.getInteger($$0x, "rotationSteps")
                                                            )
                                                      )
                                                )
                                          )
                                    ))
                                 .then(
                                    ((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("runall").executes($$0x -> a((ds)$$0x.getSource(), 0, 8)))
                                          .then(
                                             ((RequiredArgumentBuilder)dt.a("testClassName", ry.a())
                                                   .executes($$0x -> a((ds)$$0x.getSource(), ry.a($$0x, "testClassName"), 0, 8)))
                                                .then(
                                                   ((RequiredArgumentBuilder)dt.a("rotationSteps", IntegerArgumentType.integer())
                                                         .executes(
                                                            $$0x -> a(
                                                                  (ds)$$0x.getSource(),
                                                                  ry.a($$0x, "testClassName"),
                                                                  IntegerArgumentType.getInteger($$0x, "rotationSteps"),
                                                                  8
                                                               )
                                                         ))
                                                      .then(
                                                         dt.a("testsPerRow", IntegerArgumentType.integer())
                                                            .executes(
                                                               $$0x -> a(
                                                                     (ds)$$0x.getSource(),
                                                                     ry.a($$0x, "testClassName"),
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
                           .then(dt.a("exportthis").executes($$0x -> b((ds)$$0x.getSource()))))
                        .then(dt.a("exportthese").executes($$0x -> c((ds)$$0x.getSource()))))
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
         amp $$5 = $$0.e();
         hv $$6 = a($$0).d();
         rx.a($$1.toLowerCase(), $$6, new iz($$2, $$3, $$4), dcl.a, $$5);

         for (int $$7 = 0; $$7 < $$2; $$7++) {
            for (int $$8 = 0; $$8 < $$4; $$8++) {
               hv $$9 = new hv($$6.u() + $$7, $$6.v() + 1, $$6.w() + $$8);
               cvz $$10 = cwb.h;
               ff $$11 = new ff($$10.o(), Collections.emptySet(), null);
               $$11.a($$5, $$9, 2);
            }
         }

         rx.a($$6, new hv(1, 0, -1), dcl.a, $$5);
         return 0;
      } else {
         throw new IllegalArgumentException("The structure must be less than 48 blocks big in each axis");
      }
   }

   private static int a(ds $$0, String $$1) throws CommandSyntaxException {
      ekx $$2 = (ekx)$$0.h().a(10.0, 1.0F, false);
      hv $$3 = $$2.a();
      amp $$4 = $$0.e();
      Optional<hv> $$5 = rx.a($$3, 15, $$4);
      if ($$5.isEmpty()) {
         $$5 = rx.a($$3, 200, $$4);
      }

      if ($$5.isEmpty()) {
         $$0.b(vb.b("Can't find a structure block that contains the targeted pos " + $$3));
         return 0;
      } else {
         dhr $$6 = (dhr)$$4.c_($$5.get());
         hv $$7 = $$3.b($$5.get());
         String $$8 = $$7.u() + ", " + $$7.v() + ", " + $$7.w();
         String $$9 = $$6.w();
         vb $$10 = vb.b($$8)
            .b(
               vy.a
                  .a(true)
                  .a(n.k)
                  .a(new vh(vh.a.a, vb.b("Click to copy to clipboard")))
                  .a(new uz(uz.a.f, "final BlockPos " + $$1 + " = new BlockPos(" + $$8 + ");"))
            );
         $$0.a(() -> vb.b("Position relative to " + $$9 + ": ").b($$10), false);
         acv.a($$4, new hv($$3), $$8, -2147418368, 10000);
         return 1;
      }
   }

   private static int a(ds $$0, boolean $$1) {
      hv $$2 = hv.a($$0.d());
      amp $$3 = $$0.e();
      hv $$4 = rx.b($$2, 15, $$3);
      if ($$4 == null) {
         a($$3, "Couldn't find any structure block within 15 radius", n.m);
         return 0;
      } else {
         rn.a($$3);
         a($$3, $$4, null, $$1);
         return 1;
      }
   }

   private static int b(ds $$0, boolean $$1) {
      hv $$2 = hv.a($$0.d());
      amp $$3 = $$0.e();
      Collection<hv> $$4 = rx.c($$2, 200, $$3);
      if ($$4.isEmpty()) {
         a($$3, "Couldn't find any structure blocks within 200 block radius", n.m);
         return 1;
      } else {
         rn.a($$3);
         b($$0, "Running " + $$4.size() + " tests...");
         rv $$5 = new rv();
         $$4.forEach($$3x -> a($$3, $$3x, $$5, $$1));
         return 1;
      }
   }

   private static void a(amp $$0, hv $$1, @Nullable rv $$2, boolean $$3) {
      dhr $$4 = (dhr)$$0.c_($$1);
      String $$5 = $$4.w();
      Optional<sa> $$6 = rm.e($$5);
      if ($$6.isEmpty()) {
         a($$0, "Test function for test " + $$5 + " could not be found", n.m);
      } else {
         sa $$7 = $$6.get();
         rk $$8 = new rk($$7, $$4.m(), $$0);
         $$8.a($$3);
         if ($$2 != null) {
            $$2.a($$8);
            $$8.a(new rz.a($$0, $$2));
         }

         if (a($$0, $$8)) {
            a($$7, $$0);
            dyg $$9 = rx.b($$4);
            hv $$10 = new hv($$9.h(), $$9.i(), $$9.j());
            rn.a($$8, $$10, rq.a);
         }
      }
   }

   private static boolean a(amp $$0, rk $$1) {
      if ($$0.p().b(new agt($$1.u())).isEmpty()) {
         a($$0, "Test structure " + $$1.u() + " could not be found", n.m);
         return false;
      } else {
         return true;
      }
   }

   static void a(amp $$0, rv $$1) {
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
      amp $$2 = $$0.e();
      rn.a($$2);
      hv $$3 = hv.a($$0.d().c, (double)$$0.e().a(dny.a.b, hv.a($$0.d())).v(), $$0.d().e);
      rn.a($$2, $$3, rq.a, aty.a($$1, 0, 1024));
      return 1;
   }

   private static int a(ds $$0, sa $$1, int $$2) {
      amp $$3 = $$0.e();
      hv $$4 = a($$0);
      rn.a($$3);
      a($$1, $$3);
      dcl $$5 = rx.a($$2);
      rk $$6 = new rk($$1, $$5, $$3);
      if (!a($$3, $$6)) {
         return 0;
      } else {
         rn.a($$6, $$4, rq.a);
         return 1;
      }
   }

   private static hv a(ds $$0) {
      hv $$1 = hv.a($$0.d());
      int $$2 = $$0.e().a(dny.a.b, $$1).v();
      return new hv($$1.u(), $$2 + 1, $$1.w() + 3);
   }

   private static void a(sa $$0, amp $$1) {
      Consumer<amp> $$2 = rm.c($$0.e());
      if ($$2 != null) {
         $$2.accept($$1);
      }
   }

   private static int a(ds $$0, int $$1, int $$2) {
      rn.a($$0.e());
      Collection<sa> $$3 = rm.a();
      b($$0, "Running all " + $$3.size() + " tests...");
      rm.d();
      a($$0, $$3, $$1, $$2);
      return 1;
   }

   private static int a(ds $$0, String $$1, int $$2, int $$3) {
      Collection<sa> $$4 = rm.a($$1);
      rn.a($$0.e());
      b($$0, "Running " + $$4.size() + " tests from " + $$1 + "...");
      rm.d();
      a($$0, $$4, $$2, $$3);
      return 1;
   }

   private static int a(ds $$0, boolean $$1, int $$2, int $$3) {
      Collection<sa> $$4;
      if ($$1) {
         $$4 = rm.c().stream().filter(sa::d).collect(Collectors.toList());
      } else {
         $$4 = rm.c();
      }

      if ($$4.isEmpty()) {
         b($$0, "No failed tests to rerun");
         return 0;
      } else {
         rn.a($$0.e());
         b($$0, "Rerunning " + $$4.size() + " failed tests (" + ($$1 ? "only required tests" : "including optional tests") + ")");
         a($$0, $$4, $$2, $$3);
         return 1;
      }
   }

   private static void a(ds $$0, Collection<sa> $$1, int $$2, int $$3) {
      hv $$4 = a($$0);
      amp $$5 = $$0.e();
      dcl $$6 = rx.a($$2);
      Collection<rk> $$7 = rn.b($$1, $$4, $$6, $$5, rq.a, $$3);
      rv $$8 = new rv($$7);
      $$8.a(new rz.a($$5, $$8));
      $$8.a($$0x -> rm.a($$0x.w()));
   }

   private static void b(ds $$0, String $$1) {
      $$0.a(() -> vb.b($$1), false);
   }

   private static int b(ds $$0) {
      hv $$1 = hv.a($$0.d());
      amp $$2 = $$0.e();
      hv $$3 = rx.b($$1, 15, $$2);
      if ($$3 == null) {
         a($$2, "Couldn't find any structure block within 15 radius", n.m);
         return 0;
      } else {
         dhr $$4 = (dhr)$$2.c_($$3);
         return a($$0, $$4);
      }
   }

   private static int c(ds $$0) {
      hv $$1 = hv.a($$0.d());
      amp $$2 = $$0.e();
      Collection<hv> $$3 = rx.c($$1, 200, $$2);
      if ($$3.isEmpty()) {
         a($$2, "Couldn't find any structure blocks within 200 block radius", n.m);
         return 1;
      } else {
         boolean $$4 = true;

         for (hv $$5 : $$3) {
            dhr $$6 = (dhr)$$2.c_($$5);
            if (a($$0, $$6) != 0) {
               $$4 = false;
            }
         }

         return $$4 ? 0 : 1;
      }
   }

   private static int a(ds $$0, dhr $$1) {
      String $$2 = $$1.d();
      if (!$$1.b(true)) {
         b($$0, "Failed to save structure " + $$2);
      }

      return c($$0, $$2);
   }

   private static int c(ds $$0, String $$1) {
      Path $$2 = Paths.get(rx.b);
      agt $$3 = new agt("minecraft", $$1);
      Path $$4 = $$0.e().p().a($$3, ".nbt");
      Path $$5 = nn.a(kg.a, $$4, $$1, $$2);
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
      Path $$2 = Paths.get(rx.b, $$1 + ".snbt");
      agt $$3 = new agt("minecraft", $$1);
      Path $$4 = $$0.e().p().a($$3, ".nbt");

      try {
         BufferedReader $$5 = Files.newBufferedReader($$2);
         String $$6 = IOUtils.toString($$5);
         Files.createDirectories($$4.getParent());

         try (OutputStream $$7 = Files.newOutputStream($$4)) {
            sw.a(sy.a($$6), $$7);
         }

         b($$0, "Imported to " + $$4.toAbsolutePath());
         return 0;
      } catch (CommandSyntaxException | IOException var12) {
         a.error("Failed to load structure {}", $$1, var12);
         return 1;
      }
   }

   private static void a(amp $$0, String $$1, n $$2) {
      $$0.a($$0x -> true).forEach($$2x -> $$2x.a(vb.b($$2 + $$1)));
   }

   static class a implements rl {
      private final amp a;
      private final rv b;

      public a(amp $$0, rv $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public void a(rk $$0) {
      }

      @Override
      public void b(rk $$0) {
         rz.a(this.a, this.b);
      }

      @Override
      public void c(rk $$0) {
         rz.a(this.a, this.b);
      }
   }
}
