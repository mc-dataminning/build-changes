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
         ame $$5 = $$0.f();
         ht $$6 = a($$0);
         rn.a($$1.toLowerCase(), $$6, new iw($$2, $$3, $$4), dbm.a, $$5);

         for (int $$7 = 0; $$7 < $$2; $$7++) {
            for (int $$8 = 0; $$8 < $$4; $$8++) {
               ht $$9 = new ht($$6.u() + $$7, $$6.v() + 1, $$6.w() + $$8);
               cva $$10 = cvc.h;
               fh $$11 = new fh($$10.o(), Collections.emptySet(), null);
               $$11.a($$5, $$9, 2);
            }
         }

         rn.a($$6, new ht(1, 0, -1), dbm.a, $$5);
         return 0;
      } else {
         throw new IllegalArgumentException("The structure must be less than 48 blocks big in each axis");
      }
   }

   private static int a(du $$0, String $$1) throws CommandSyntaxException {
      ejq $$2 = (ejq)$$0.i().a(10.0, 1.0F, false);
      ht $$3 = $$2.a();
      ame $$4 = $$0.f();
      Optional<ht> $$5 = rn.a($$3, 15, $$4);
      if ($$5.isEmpty()) {
         $$5 = rn.a($$3, 200, $$4);
      }

      if ($$5.isEmpty()) {
         $$0.b(ur.b("Can't find a structure block that contains the targeted pos " + $$3));
         return 0;
      } else {
         dgr $$6 = (dgr)$$4.c_($$5.get());
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
         ack.a($$4, new ht($$3), $$8, -2147418368, 10000);
         return 1;
      }
   }

   private static int a(du $$0, boolean $$1) {
      ht $$2 = ht.a($$0.e());
      ame $$3 = $$0.f();
      ht $$4 = rn.b($$2, 15, $$3);
      if ($$4 == null) {
         a($$3, "Couldn't find any structure block within 15 radius", n.m);
         return 0;
      } else {
         rd.a($$3);
         a($$3, $$4, null, $$1);
         return 1;
      }
   }

   private static int b(du $$0, boolean $$1) {
      ht $$2 = ht.a($$0.e());
      ame $$3 = $$0.f();
      Collection<ht> $$4 = rn.c($$2, 200, $$3);
      if ($$4.isEmpty()) {
         a($$3, "Couldn't find any structure blocks within 200 block radius", n.m);
         return 1;
      } else {
         rd.a($$3);
         b($$0, "Running " + $$4.size() + " tests...");
         rl $$5 = new rl();
         $$4.forEach($$3x -> a($$3, $$3x, $$5, $$1));
         return 1;
      }
   }

   private static void a(ame $$0, ht $$1, @Nullable rl $$2, boolean $$3) {
      dgr $$4 = (dgr)$$0.c_($$1);
      String $$5 = $$4.f();
      Optional<rq> $$6 = rc.e($$5);
      if ($$6.isEmpty()) {
         a($$0, "Test function for test " + $$5 + " could not be found", n.m);
      } else {
         rq $$7 = $$6.get();
         ra $$8 = new ra($$7, $$4.w(), $$0);
         $$8.a($$3);
         if ($$2 != null) {
            $$2.a($$8);
            $$8.a(new rp.a($$0, $$2));
         }

         a($$7, $$0);
         dwz $$9 = rn.b($$4);
         ht $$10 = new ht($$9.g(), $$9.h(), $$9.i());
         rd.a($$8, $$10, rg.a);
      }
   }

   static void a(ame $$0, rl $$1) {
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
      ame $$2 = $$0.f();
      rd.a($$2);
      ht $$3 = ht.a($$0.e().c, (double)$$0.f().a(dmr.a.b, ht.a($$0.e())).v(), $$0.e().e);
      rd.a($$2, $$3, rg.a, atm.a($$1, 0, 1024));
      return 1;
   }

   private static int a(du $$0, rq $$1, int $$2) {
      ame $$3 = $$0.f();
      ht $$4 = a($$0);
      rd.a($$3);
      a($$1, $$3);
      dbm $$5 = rn.a($$2);
      ra $$6 = new ra($$1, $$5, $$3);
      rd.a($$6, $$4, rg.a);
      return 1;
   }

   private static ht a(du $$0) {
      ht $$1 = ht.a($$0.e());
      int $$2 = $$0.f().a(dmr.a.b, $$1).v();
      return new ht($$1.u(), $$2 + 1, $$1.w() + 3);
   }

   private static void a(rq $$0, ame $$1) {
      Consumer<ame> $$2 = rc.c($$0.e());
      if ($$2 != null) {
         $$2.accept($$1);
      }
   }

   private static int a(du $$0, int $$1, int $$2) {
      rd.a($$0.f());
      Collection<rq> $$3 = rc.a();
      b($$0, "Running all " + $$3.size() + " tests...");
      rc.d();
      a($$0, $$3, $$1, $$2);
      return 1;
   }

   private static int a(du $$0, String $$1, int $$2, int $$3) {
      Collection<rq> $$4 = rc.a($$1);
      rd.a($$0.f());
      b($$0, "Running " + $$4.size() + " tests from " + $$1 + "...");
      rc.d();
      a($$0, $$4, $$2, $$3);
      return 1;
   }

   private static int a(du $$0, boolean $$1, int $$2, int $$3) {
      Collection<rq> $$4;
      if ($$1) {
         $$4 = rc.c().stream().filter(rq::d).collect(Collectors.toList());
      } else {
         $$4 = rc.c();
      }

      if ($$4.isEmpty()) {
         b($$0, "No failed tests to rerun");
         return 0;
      } else {
         rd.a($$0.f());
         b($$0, "Rerunning " + $$4.size() + " failed tests (" + ($$1 ? "only required tests" : "including optional tests") + ")");
         a($$0, $$4, $$2, $$3);
         return 1;
      }
   }

   private static void a(du $$0, Collection<rq> $$1, int $$2, int $$3) {
      ht $$4 = a($$0);
      ame $$5 = $$0.f();
      dbm $$6 = rn.a($$2);
      Collection<ra> $$7 = rd.b($$1, $$4, $$6, $$5, rg.a, $$3);
      rl $$8 = new rl($$7);
      $$8.a(new rp.a($$5, $$8));
      $$8.a($$0x -> rc.a($$0x.w()));
   }

   private static void b(du $$0, String $$1) {
      $$0.a(() -> ur.b($$1), false);
   }

   private static int b(du $$0) {
      ht $$1 = ht.a($$0.e());
      ame $$2 = $$0.f();
      ht $$3 = rn.b($$1, 15, $$2);
      if ($$3 == null) {
         a($$2, "Couldn't find any structure block within 15 radius", n.m);
         return 0;
      } else {
         dgr $$4 = (dgr)$$2.c_($$3);
         String $$5 = $$4.f();
         return c($$0, $$5);
      }
   }

   private static int c(du $$0) {
      ht $$1 = ht.a($$0.e());
      ame $$2 = $$0.f();
      Collection<ht> $$3 = rn.c($$1, 200, $$2);
      if ($$3.isEmpty()) {
         a($$2, "Couldn't find any structure blocks within 200 block radius", n.m);
         return 1;
      } else {
         boolean $$4 = true;

         for (ht $$5 : $$3) {
            dgr $$6 = (dgr)$$2.c_($$5);
            String $$7 = $$6.f();
            if (c($$0, $$7) != 0) {
               $$4 = false;
            }
         }

         return $$4 ? 0 : 1;
      }
   }

   private static int c(du $$0, String $$1) {
      Path $$2 = Paths.get(rn.b);
      agi $$3 = new agi("minecraft", $$1);
      Path $$4 = $$0.f().p().a($$3, ".nbt");
      Path $$5 = nl.a(kd.a, $$4, $$1, $$2);
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
      Path $$2 = Paths.get(rn.b, $$1 + ".snbt");
      agi $$3 = new agi("minecraft", $$1);
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

   private static void a(ame $$0, String $$1, n $$2) {
      $$0.a($$0x -> true).forEach($$2x -> $$2x.a(ur.b($$2 + $$1)));
   }

   static class a implements rb {
      private final ame a;
      private final rl b;

      public a(ame $$0, rl $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public void a(ra $$0) {
      }

      @Override
      public void b(ra $$0) {
         rp.a(this.a, this.b);
      }

      @Override
      public void c(ra $$0) {
         rp.a(this.a, this.b);
      }
   }
}
