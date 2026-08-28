import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.BoolArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic3CommandExceptionType;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import java.util.stream.Stream;
import org.apache.commons.lang3.mutable.MutableInt;

public class tj {
   public static final int a = 15;
   public static final int b = 200;
   public static final int c = 10;
   public static final int d = 100;
   private static final int e = 200;
   private static final int f = 1024;
   private static final int g = 3;
   private static final int h = 10000;
   private static final int i = 5;
   private static final int j = 5;
   private static final int k = 5;
   private static final SimpleCommandExceptionType l = new SimpleCommandExceptionType(xa.c("commands.test.clear.error.no_tests"));
   private static final SimpleCommandExceptionType m = new SimpleCommandExceptionType(xa.c("commands.test.reset.error.no_tests"));
   private static final SimpleCommandExceptionType n = new SimpleCommandExceptionType(xa.c("commands.test.error.test_instance_not_found"));
   private static final SimpleCommandExceptionType o = new SimpleCommandExceptionType(xa.b("Could not find any structures to export"));
   private static final SimpleCommandExceptionType p = new SimpleCommandExceptionType(xa.c("commands.test.error.no_test_instances"));
   private static final Dynamic3CommandExceptionType q = new Dynamic3CommandExceptionType(
      ($$0, $$1, $$2) -> xa.b("commands.test.error.no_test_containing_pos", $$0, $$1, $$2)
   );
   private static final DynamicCommandExceptionType r = new DynamicCommandExceptionType($$0 -> xa.b("commands.test.error.too_large", $$0));

   private static int a(tm $$0) throws CommandSyntaxException {
      a();
      int $$1 = a($$0.b(), tg.a(), $$0).map($$1x -> a($$0.b(), $$1x)).toList().size();
      if ($$1 == 0) {
         throw l.create();
      } else {
         $$0.b().a(() -> xa.a("commands.test.reset.success", $$1), true);
         return $$1;
      }
   }

   private static int b(tm $$0) throws CommandSyntaxException {
      a();
      ej $$1 = $$0.b();
      ars $$2 = $$1.e();
      sv.a($$2);
      List<ert> $$3 = $$0.findTestPos().flatMap($$1x -> $$2.a($$1x, dye.U).stream()).map(dzx::d).toList();
      $$3.forEach($$1x -> ti.a($$1x, $$2));
      if ($$3.isEmpty()) {
         throw l.create();
      } else {
         $$1.a(() -> xa.a("commands.test.clear.success", $$3.size()), true);
         return $$3.size();
      }
   }

   private static int c(tm $$0) throws CommandSyntaxException {
      ej $$1 = $$0.b();
      ars $$2 = $$1.e();
      int $$3 = 0;
      boolean $$4 = true;

      for (Iterator<iv> $$5 = $$0.findTestPos().iterator(); $$5.hasNext(); $$3++) {
         iv $$6 = $$5.next();
         if (!($$2.c_($$6) instanceof dzx $$7)) {
            throw n.create();
         }

         if (!$$7.c($$1::a)) {
            $$4 = false;
         }
      }

      if ($$3 == 0) {
         throw o.create();
      } else {
         String $$8 = "Exported " + $$3 + " structures";
         $$0.b().a(() -> xa.b($$8), true);
         return $$4 ? 0 : 1;
      }
   }

   private static int d(tm $$0) {
      a();
      ej $$1 = $$0.b();
      ars $$2 = $$1.e();
      iv $$3 = a($$1);
      Collection<sq> $$4 = Stream.concat(a($$1, tg.a(), $$0), a($$1, tg.a(), $$0, 0)).toList();
      sv.a($$2);
      sf.b();
      Collection<sj> $$5 = new ArrayList<>();

      for (sq $$6 : $$4) {
         for (dtw $$7 : dtw.values()) {
            Collection<sq> $$8 = new ArrayList<>();

            for (int $$9 = 0; $$9 < 100; $$9++) {
               sq $$10 = new sq($$6.w(), $$7, $$2, new tg(1, true));
               $$10.a($$6.c());
               $$8.add($$10);
            }

            sj $$11 = sk.a($$8, $$6.v().d(), $$7.ordinal());
            $$5.add($$11);
         }
      }

      th $$12 = new th($$3, 10, true);
      sv $$13 = sv.a.a($$5, $$2).a(sk.a(100)).a((sv.c)$$12).a($$12).a(true).a();
      return a($$1, $$13);
   }

   private static int a(tm $$0, tg $$1, int $$2, int $$3) {
      a();
      ej $$4 = $$0.b();
      ars $$5 = $$4.e();
      iv $$6 = a($$4);
      Collection<sq> $$7 = Stream.concat(a($$4, $$1, $$0), a($$4, $$1, $$0, $$2)).toList();
      if ($$7.isEmpty()) {
         $$4.a(() -> xa.c("commands.test.no_tests"), false);
         return 0;
      } else {
         sv.a($$5);
         sf.b();
         $$4.a(() -> xa.a("commands.test.run.running", $$7.size()), false);
         sv $$8 = sv.a.b($$7, $$5).a((sv.c)(new th($$6, $$3, false))).a();
         return a($$4, $$8);
      }
   }

   private static int e(tm $$0) throws CommandSyntaxException {
      $$0.b().a(xa.c("commands.test.locate.started"));
      MutableInt $$1 = new MutableInt(0);
      iv $$2 = iv.a((jp)$$0.b().d());
      $$0.findTestPos()
         .forEach(
            $$3x -> {
               if ($$0.b().e().c_($$3x) instanceof dzx $$5) {
                  jb var13 = $$5.u().a(jb.c);
                  iv $$8 = $$5.aB_().a(var13, 2);
                  int $$9 = (int)var13.g().p();
                  String $$10 = String.format(Locale.ROOT, "/tp @s %d %d %d %d 0", $$8.u(), $$8.v(), $$8.w(), $$9);
                  int $$11 = $$2.u() - $$3x.u();
                  int $$12 = $$2.w() - $$3x.w();
                  int $$13 = azo.d(azo.c((float)($$11 * $$11 + $$12 * $$12)));
                  xo $$14 = xd.a((xa)xa.a("chat.coordinates", $$3x.u(), $$3x.v(), $$3x.w()))
                     .a($$1xx -> $$1xx.a(o.k).a(new wy.g($$10)).a(new xg.e(xa.c("chat.coordinates.tooltip"))));
                  $$0.b().a(() -> xa.a("commands.test.locate.found", $$14, $$13), false);
                  $$1.increment();
               }
            }
         );
      int $$3 = $$1.intValue();
      if ($$3 == 0) {
         throw p.create();
      } else {
         $$0.b().a(() -> xa.a("commands.test.locate.done", $$3), true);
         return $$3;
      }
   }

   private static ArgumentBuilder<ej, ?> a(
      ArgumentBuilder<ej, ?> $$0, anv<CommandContext<ej>, tm> $$1, Function<ArgumentBuilder<ej, ?>, ArgumentBuilder<ej, ?>> $$2
   ) {
      return $$0.executes($$1x -> a($$1.apply($$1x), tg.a(), 0, 8))
         .then(
            ((RequiredArgumentBuilder)ek.a("numberOfTimes", IntegerArgumentType.integer(0))
                  .executes($$1x -> a($$1.apply($$1x), new tg(IntegerArgumentType.getInteger($$1x, "numberOfTimes"), false), 0, 8)))
               .then(
                  $$2.apply(
                     ek.a("untilFailed", BoolArgumentType.bool())
                        .executes(
                           $$1x -> a(
                                 $$1.apply($$1x),
                                 new tg(IntegerArgumentType.getInteger($$1x, "numberOfTimes"), BoolArgumentType.getBool($$1x, "untilFailed")),
                                 0,
                                 8
                              )
                        )
                  )
               )
         );
   }

   private static ArgumentBuilder<ej, ?> a(ArgumentBuilder<ej, ?> $$0, anv<CommandContext<ej>, tm> $$1) {
      return a($$0, $$1, $$0x -> $$0x);
   }

   private static ArgumentBuilder<ej, ?> b(ArgumentBuilder<ej, ?> $$0, anv<CommandContext<ej>, tm> $$1) {
      return a(
         $$0,
         $$1,
         $$1x -> $$1x.then(
               ((RequiredArgumentBuilder)ek.a("rotationSteps", IntegerArgumentType.integer())
                     .executes(
                        $$1xx -> a(
                              $$1.apply($$1xx),
                              new tg(IntegerArgumentType.getInteger($$1xx, "numberOfTimes"), BoolArgumentType.getBool($$1xx, "untilFailed")),
                              IntegerArgumentType.getInteger($$1xx, "rotationSteps"),
                              8
                           )
                     ))
                  .then(
                     ek.a("testsPerRow", IntegerArgumentType.integer())
                        .executes(
                           $$1xx -> a(
                                 $$1.apply($$1xx),
                                 new tg(IntegerArgumentType.getInteger($$1xx, "numberOfTimes"), BoolArgumentType.getBool($$1xx, "untilFailed")),
                                 IntegerArgumentType.getInteger($$1xx, "rotationSteps"),
                                 IntegerArgumentType.getInteger($$1xx, "testsPerRow")
                              )
                        )
                  )
            )
      );
   }

   public static void a(CommandDispatcher<ej> $$0, ef $$1) {
      ArgumentBuilder<ej, ?> $$2 = b(
         ek.a("onlyRequiredTests", BoolArgumentType.bool()), $$0x -> tm.a().a($$0x, BoolArgumentType.getBool($$0x, "onlyRequiredTests"))
      );
      LiteralArgumentBuilder<ej> $$3 = (LiteralArgumentBuilder<ej>)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ek.a(
                                                               "test"
                                                            )
                                                            .requires($$0x -> $$0x.c(2)))
                                                         .then(
                                                            ek.a("run")
                                                               .then(b(ek.a("tests", fo.a($$1, mh.bh)), $$0x -> tm.a().a($$0x, fo.a($$0x, "tests", mh.bh))))
                                                         ))
                                                      .then(
                                                         ek.a("runmultiple")
                                                            .then(
                                                               ((RequiredArgumentBuilder)ek.a("tests", fo.a($$1, mh.bh))
                                                                     .executes($$0x -> a(tm.a().a($$0x, fo.a($$0x, "tests", mh.bh)), tg.a(), 0, 8)))
                                                                  .then(
                                                                     ek.a("amount", IntegerArgumentType.integer())
                                                                        .executes(
                                                                           $$0x -> a(
                                                                                 tm.a()
                                                                                    .a(IntegerArgumentType.getInteger($$0x, "amount"))
                                                                                    .a($$0x, fo.a($$0x, "tests", mh.bh)),
                                                                                 tg.a(),
                                                                                 0,
                                                                                 8
                                                                              )
                                                                        )
                                                                  )
                                                            )
                                                      ))
                                                   .then(a(ek.a("runthese"), tm.a()::b)))
                                                .then(a(ek.a("runclosest"), tm.a()::a)))
                                             .then(a(ek.a("runthat"), tm.a()::c)))
                                          .then(b(ek.a("runfailed").then($$2), tm.a()::d)))
                                       .then(
                                          ek.a("verify").then(ek.a("tests", fo.a($$1, mh.bh)).executes($$0x -> d(tm.a().a($$0x, fo.a($$0x, "tests", mh.bh)))))
                                       ))
                                    .then(ek.a("locate").then(ek.a("tests", fo.a($$1, mh.bh)).executes($$0x -> e(tm.a().a($$0x, fo.a($$0x, "tests", mh.bh)))))))
                                 .then(ek.a("resetclosest").executes($$0x -> a(tm.a().a($$0x)))))
                              .then(ek.a("resetthese").executes($$0x -> a(tm.a().b($$0x)))))
                           .then(ek.a("resetthat").executes($$0x -> a(tm.a().c($$0x)))))
                        .then(ek.a("clearthat").executes($$0x -> b(tm.a().c($$0x)))))
                     .then(ek.a("clearthese").executes($$0x -> b(tm.a().b($$0x)))))
                  .then(
                     ((LiteralArgumentBuilder)ek.a("clearall").executes($$0x -> b(tm.a().a($$0x, 200))))
                        .then(
                           ek.a("radius", IntegerArgumentType.integer())
                              .executes($$0x -> b(tm.a().a($$0x, azo.a(IntegerArgumentType.getInteger($$0x, "radius"), 0, 1024))))
                        )
                  ))
               .then(ek.a("stop").executes($$0x -> a())))
            .then(
               ((LiteralArgumentBuilder)ek.a("pos").executes($$0x -> a((ej)$$0x.getSource(), "pos")))
                  .then(ek.a("var", StringArgumentType.word()).executes($$0x -> a((ej)$$0x.getSource(), StringArgumentType.getString($$0x, "var"))))
            ))
         .then(
            ek.a("create")
               .then(
                  ((RequiredArgumentBuilder)ek.a("id", fk.a()).suggests(tj::a).executes($$0x -> a((ej)$$0x.getSource(), fk.a($$0x, "id"), 5, 5, 5)))
                     .then(
                        ((RequiredArgumentBuilder)ek.a("width", IntegerArgumentType.integer())
                              .executes(
                                 $$0x -> a(
                                       (ej)$$0x.getSource(),
                                       fk.a($$0x, "id"),
                                       IntegerArgumentType.getInteger($$0x, "width"),
                                       IntegerArgumentType.getInteger($$0x, "width"),
                                       IntegerArgumentType.getInteger($$0x, "width")
                                    )
                              ))
                           .then(
                              ek.a("height", IntegerArgumentType.integer())
                                 .then(
                                    ek.a("depth", IntegerArgumentType.integer())
                                       .executes(
                                          $$0x -> a(
                                                (ej)$$0x.getSource(),
                                                fk.a($$0x, "id"),
                                                IntegerArgumentType.getInteger($$0x, "width"),
                                                IntegerArgumentType.getInteger($$0x, "height"),
                                                IntegerArgumentType.getInteger($$0x, "depth")
                                             )
                                       )
                                 )
                           )
                     )
               )
         );
      if (ac.aU) {
         $$3 = (LiteralArgumentBuilder<ej>)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)$$3.then(
                     ek.a("export").then(ek.a("test", fi.a($$1, mh.bh)).executes($$0x -> a((ej)$$0x.getSource(), fi.a($$0x, "test", mh.bh))))
                  ))
                  .then(ek.a("exportclosest").executes($$0x -> c(tm.a().a($$0x)))))
               .then(ek.a("exportthese").executes($$0x -> c(tm.a().b($$0x)))))
            .then(ek.a("exportthat").executes($$0x -> c(tm.a().c($$0x))));
      }

      $$0.register($$3);
   }

   public static CompletableFuture<Suggestions> a(CommandContext<ej> $$0, SuggestionsBuilder $$1) {
      Stream<String> $$2 = ((ej)$$0.getSource()).u().f(mh.ay).c().map(jf::g);
      return eo.b($$2, $$1);
   }

   private static int a(ej $$0, sq $$1) {
      dzx $$2 = $$1.f();
      $$2.a($$0::a);
      return 1;
   }

   private static Stream<sq> a(ej $$0, tg $$1, tp $$2) {
      return $$2.findTestPos().map($$2x -> a($$2x, $$0, $$1)).flatMap(Optional::stream);
   }

   private static Stream<sq> a(ej $$0, tg $$1, to $$2, int $$3) {
      return $$2.findTests().filter($$1x -> a($$0, ((sr)$$1x.a()).e())).map($$3x -> new sq($$3x, ti.a($$3), $$0.e(), $$1));
   }

   private static Optional<sq> a(iv $$0, ej $$1, tg $$2) {
      ars $$3 = $$1.e();
      if ($$3.c_($$0) instanceof dzx $$4) {
         Optional<jf.c<sr>> $$6 = $$4.j().flatMap($$1.u().f(mh.bh)::a);
         if ($$6.isEmpty()) {
            $$1.b(xa.a("commands.test.error.non_existant_test", $$4.k()));
            return Optional.empty();
         } else {
            jf.c<sr> $$7 = $$6.get();
            sq $$8 = new sq($$7, $$4.u(), $$3, $$2);
            $$8.a($$0);
            return !a($$1, $$8.t()) ? Optional.empty() : Optional.of($$8);
         }
      } else {
         $$1.b(xa.a("commands.test.error.test_instance_not_found.position", $$0.u(), $$0.v(), $$0.w()));
         return Optional.empty();
      }
   }

   private static int a(ej $$0, ali $$1, int $$2, int $$3, int $$4) throws CommandSyntaxException {
      if ($$2 <= 48 && $$3 <= 48 && $$4 <= 48) {
         ars $$5 = $$0.e();
         iv $$6 = a($$0);
         dzx $$7 = ti.a($$1, $$6, new ka($$2, $$3, $$4), dtw.a, $$5);
         iv $$8 = $$7.z();
         iv $$9 = $$8.b($$2 - 1, 0, $$4 - 1);
         iv.d($$8, $$9).forEach($$1x -> $$5.b($$1x, dne.I.m()));
         $$0.a(() -> xa.a("commands.test.create.success", $$7.k()), true);
         return 1;
      } else {
         throw r.create(48);
      }
   }

   private static int a(ej $$0, String $$1) throws CommandSyntaxException {
      ffm $$2 = (ffm)$$0.h().a(10.0, 1.0F, false);
      iv $$3 = $$2.b();
      ars $$4 = $$0.e();
      Optional<iv> $$5 = ti.a($$3, 15, $$4);
      if ($$5.isEmpty()) {
         $$5 = ti.a($$3, 200, $$4);
      }

      if ($$5.isEmpty()) {
         throw q.create($$3.u(), $$3.v(), $$3.w());
      } else if ($$4.c_($$5.get()) instanceof dzx $$6) {
         iv var12 = $$6.z();
         iv $$9 = $$3.b(var12);
         String $$10 = $$9.u() + ", " + $$9.v() + ", " + $$9.w();
         String $$11 = $$6.k().getString();
         xo $$12 = xa.a("commands.test.coordinates", $$9.u(), $$9.v(), $$9.w())
            .b(xx.a.a(true).a(o.k).a(new xg.e(xa.c("commands.test.coordinates.copy"))).a(new wy.c("final BlockPos " + $$1 + " = new BlockPos(" + $$10 + ");")));
         $$0.a(() -> xa.a("commands.test.relative_position", $$11, $$12), false);
         ago.a($$4, new iv($$3), $$10, -2147418368, 10000);
         return 1;
      } else {
         throw n.create();
      }
   }

   private static int a() {
      sy.a.a();
      return 1;
   }

   public static int a(ej $$0, sv $$1) {
      $$1.a(new tj.a($$0));
      te $$2 = new te($$1.a());
      $$2.a(new tj.b($$0, $$2));
      $$2.a($$0x -> sf.a($$0x.w()));
      $$1.b();
      return 1;
   }

   private static int a(ej $$0, jf<sr> $$1) {
      return !dzx.a($$0.e(), $$1.a().e(), $$0::a) ? 0 : 1;
   }

   private static boolean a(ej $$0, ali $$1) {
      if ($$0.e().r().b($$1).isEmpty()) {
         $$0.b(xa.a("commands.test.error.structure_not_found", xa.a($$1)));
         return false;
      } else {
         return true;
      }
   }

   private static iv a(ej $$0) {
      iv $$1 = iv.a((jp)$$0.d());
      int $$2 = $$0.e().a(ehd.a.b, $$1).v();
      return new iv($$1.u(), $$2, $$1.w() + 3);
   }

   static record a(ej a) implements sl {
      @Override
      public void a(sj $$0) {
         this.a.a(() -> xa.a("commands.test.batch.starting", $$0.c().g(), $$0.a()), true);
      }

      @Override
      public void b(sj $$0) {
      }
   }

   public static record b(ej a, te b) implements st {
      @Override
      public void a(sq $$0) {
      }

      @Override
      public void a(sq $$0, sv $$1) {
         this.c();
      }

      @Override
      public void b(sq $$0, sv $$1) {
         this.c();
      }

      @Override
      public void a(sq $$0, sq $$1, sv $$2) {
         this.b.a($$1);
      }

      private void c() {
         if (this.b.i()) {
            this.a.a(() -> xa.a("commands.test.summary", this.b.h()).a(o.p), true);
            if (this.b.d()) {
               this.a.b(xa.a("commands.test.summary.failed", this.b.a()));
            } else {
               this.a.a(() -> xa.c("commands.test.summary.all_required_passed").a(o.k), true);
            }

            if (this.b.e()) {
               this.a.a(xa.a("commands.test.summary.optional_failed", this.b.b()));
            }
         }
      }
   }
}
