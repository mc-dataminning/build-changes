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
import java.util.Locale;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import java.util.stream.Stream;
import org.apache.commons.lang3.mutable.MutableInt;

public class ti {
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
   private static final SimpleCommandExceptionType l = new SimpleCommandExceptionType(ww.c("commands.test.clear.error.no_tests"));
   private static final SimpleCommandExceptionType m = new SimpleCommandExceptionType(ww.c("commands.test.reset.error.no_tests"));
   private static final SimpleCommandExceptionType n = new SimpleCommandExceptionType(ww.c("commands.test.error.test_instance_not_found"));
   private static final SimpleCommandExceptionType o = new SimpleCommandExceptionType(ww.b("Could not find any structures to export"));
   private static final SimpleCommandExceptionType p = new SimpleCommandExceptionType(ww.c("commands.test.error.no_test_instances"));
   private static final Dynamic3CommandExceptionType q = new Dynamic3CommandExceptionType(
      ($$0, $$1, $$2) -> ww.b("commands.test.error.no_test_containing_pos", $$0, $$1, $$2)
   );
   private static final DynamicCommandExceptionType r = new DynamicCommandExceptionType($$0 -> ww.b("commands.test.error.too_large", $$0));

   private static int a(tl $$0) throws CommandSyntaxException {
      a();
      int $$1 = a($$0.b(), tf.a(), $$0).map($$1x -> a($$0.b(), $$1x)).toList().size();
      if ($$1 == 0) {
         throw l.create();
      } else {
         $$0.b().a(() -> ww.a("commands.test.reset.success", $$1), true);
         return $$1;
      }
   }

   private static int b(tl $$0) throws CommandSyntaxException {
      a();
      ei $$1 = $$0.b();
      aro $$2 = $$1.e();
      su.a($$2);
      Stream<iu> $$3 = $$0.findTestPos();
      int $$4 = $$3.mapToInt($$1x -> {
         if ($$2.c_($$1x) instanceof dyi $$3x) {
            eqa $$4x = $$3x.d();
            th.a($$4x, $$2);
            return 1;
         } else {
            return 0;
         }
      }).sum();
      if ($$4 == 0) {
         throw l.create();
      } else {
         $$1.a(() -> ww.a("commands.test.clear.success", $$4), true);
         return $$4;
      }
   }

   private static int c(tl $$0) throws CommandSyntaxException {
      ei $$1 = $$0.b();
      aro $$2 = $$1.e();
      int $$3 = 0;
      boolean $$4 = true;

      for (Iterator<iu> $$5 = $$0.findTestPos().iterator(); $$5.hasNext(); $$3++) {
         iu $$6 = $$5.next();
         if (!($$2.c_($$6) instanceof dyi $$7)) {
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
         $$0.b().a(() -> ww.b($$8), true);
         return $$4 ? 0 : 1;
      }
   }

   private static int d(tl $$0) {
      a();
      ei $$1 = $$0.b();
      aro $$2 = $$1.e();
      iu $$3 = a($$1);
      Collection<sp> $$4 = Stream.concat(a($$1, tf.a(), $$0), a($$1, tf.a(), $$0, 0)).toList();
      su.a($$2);
      sf.b();
      Collection<sj> $$5 = new ArrayList<>();

      for (sp $$6 : $$4) {
         for (dsm $$7 : dsm.values()) {
            Collection<sp> $$8 = new ArrayList<>();

            for (int $$9 = 0; $$9 < 100; $$9++) {
               sp $$10 = new sp($$6.w(), $$7, $$2, new tf(1, true));
               $$10.a($$6.c());
               $$8.add($$10);
            }

            sj $$11 = sk.a($$8, $$6.v().d(), $$7.ordinal());
            $$5.add($$11);
         }
      }

      tg $$12 = new tg($$3, 10, true);
      su $$13 = su.a.a($$5, $$2).a(sk.a(100)).a((su.c)$$12).a($$12).a(true).a();
      return a($$1, $$13);
   }

   private static int a(tl $$0, tf $$1, int $$2, int $$3) {
      a();
      ei $$4 = $$0.b();
      aro $$5 = $$4.e();
      iu $$6 = a($$4);
      Collection<sp> $$7 = Stream.concat(a($$4, $$1, $$0), a($$4, $$1, $$0, $$2)).toList();
      if ($$7.isEmpty()) {
         $$4.a(() -> ww.c("commands.test.no_tests"), false);
         return 0;
      } else {
         su.a($$5);
         sf.b();
         $$4.a(() -> ww.a("commands.test.run.running", $$7.size()), false);
         su $$8 = su.a.b($$7, $$5).a((su.c)(new tg($$6, $$3, false))).a();
         return a($$4, $$8);
      }
   }

   private static int e(tl $$0) throws CommandSyntaxException {
      $$0.b().a(ww.c("commands.test.locate.started"));
      MutableInt $$1 = new MutableInt(0);
      iu $$2 = iu.a((jo)$$0.b().d());
      $$0.findTestPos()
         .forEach(
            $$3x -> {
               if ($$0.b().e().c_($$3x) instanceof dyi $$5) {
                  ja var13 = $$5.u().a(ja.c);
                  iu $$8 = $$5.aw_().a(var13, 2);
                  int $$9 = (int)var13.g().p();
                  String $$10 = String.format(Locale.ROOT, "/tp @s %d %d %d %d 0", $$8.u(), $$8.v(), $$8.w(), $$9);
                  int $$11 = $$2.u() - $$3x.u();
                  int $$12 = $$2.w() - $$3x.w();
                  int $$13 = azk.d(azk.c((float)($$11 * $$11 + $$12 * $$12)));
                  xk $$14 = wz.a((ww)ww.a("chat.coordinates", $$3x.u(), $$3x.v(), $$3x.w()))
                     .a($$1xx -> $$1xx.a(n.k).a(new wu.g($$10)).a(new xc.e(ww.c("chat.coordinates.tooltip"))));
                  $$0.b().a(() -> ww.a("commands.test.locate.found", $$14, $$13), false);
                  $$1.increment();
               }
            }
         );
      int $$3 = $$1.intValue();
      if ($$3 == 0) {
         throw p.create();
      } else {
         $$0.b().a(() -> ww.a("commands.test.locate.done", $$3), true);
         return $$3;
      }
   }

   private static ArgumentBuilder<ei, ?> a(
      ArgumentBuilder<ei, ?> $$0, anr<CommandContext<ei>, tl> $$1, Function<ArgumentBuilder<ei, ?>, ArgumentBuilder<ei, ?>> $$2
   ) {
      return $$0.executes($$1x -> a($$1.apply($$1x), tf.a(), 0, 8))
         .then(
            ((RequiredArgumentBuilder)ej.a("numberOfTimes", IntegerArgumentType.integer(0))
                  .executes($$1x -> a($$1.apply($$1x), new tf(IntegerArgumentType.getInteger($$1x, "numberOfTimes"), false), 0, 8)))
               .then(
                  $$2.apply(
                     ej.a("untilFailed", BoolArgumentType.bool())
                        .executes(
                           $$1x -> a(
                                 $$1.apply($$1x),
                                 new tf(IntegerArgumentType.getInteger($$1x, "numberOfTimes"), BoolArgumentType.getBool($$1x, "untilFailed")),
                                 0,
                                 8
                              )
                        )
                  )
               )
         );
   }

   private static ArgumentBuilder<ei, ?> a(ArgumentBuilder<ei, ?> $$0, anr<CommandContext<ei>, tl> $$1) {
      return a($$0, $$1, $$0x -> $$0x);
   }

   private static ArgumentBuilder<ei, ?> b(ArgumentBuilder<ei, ?> $$0, anr<CommandContext<ei>, tl> $$1) {
      return a(
         $$0,
         $$1,
         $$1x -> $$1x.then(
               ((RequiredArgumentBuilder)ej.a("rotationSteps", IntegerArgumentType.integer())
                     .executes(
                        $$1xx -> a(
                              $$1.apply($$1xx),
                              new tf(IntegerArgumentType.getInteger($$1xx, "numberOfTimes"), BoolArgumentType.getBool($$1xx, "untilFailed")),
                              IntegerArgumentType.getInteger($$1xx, "rotationSteps"),
                              8
                           )
                     ))
                  .then(
                     ej.a("testsPerRow", IntegerArgumentType.integer())
                        .executes(
                           $$1xx -> a(
                                 $$1.apply($$1xx),
                                 new tf(IntegerArgumentType.getInteger($$1xx, "numberOfTimes"), BoolArgumentType.getBool($$1xx, "untilFailed")),
                                 IntegerArgumentType.getInteger($$1xx, "rotationSteps"),
                                 IntegerArgumentType.getInteger($$1xx, "testsPerRow")
                              )
                        )
                  )
            )
      );
   }

   public static void a(CommandDispatcher<ei> $$0, ee $$1) {
      ArgumentBuilder<ei, ?> $$2 = b(
         ej.a("onlyRequiredTests", BoolArgumentType.bool()), $$0x -> tl.a().a($$0x, BoolArgumentType.getBool($$0x, "onlyRequiredTests"))
      );
      LiteralArgumentBuilder<ei> $$3 = (LiteralArgumentBuilder<ei>)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ej.a(
                                                               "test"
                                                            )
                                                            .requires($$0x -> $$0x.c(2)))
                                                         .then(
                                                            ej.a("run")
                                                               .then(b(ej.a("tests", fn.a($$1, mg.bf)), $$0x -> tl.a().a($$0x, fn.a($$0x, "tests", mg.bf))))
                                                         ))
                                                      .then(
                                                         ej.a("runmultiple")
                                                            .then(
                                                               ((RequiredArgumentBuilder)ej.a("tests", fn.a($$1, mg.bf))
                                                                     .executes($$0x -> a(tl.a().a($$0x, fn.a($$0x, "tests", mg.bf)), tf.a(), 0, 8)))
                                                                  .then(
                                                                     ej.a("amount", IntegerArgumentType.integer())
                                                                        .executes(
                                                                           $$0x -> a(
                                                                                 tl.a()
                                                                                    .a(IntegerArgumentType.getInteger($$0x, "amount"))
                                                                                    .a($$0x, fn.a($$0x, "tests", mg.bf)),
                                                                                 tf.a(),
                                                                                 0,
                                                                                 8
                                                                              )
                                                                        )
                                                                  )
                                                            )
                                                      ))
                                                   .then(a(ej.a("runthese"), tl.a()::b)))
                                                .then(a(ej.a("runclosest"), tl.a()::a)))
                                             .then(a(ej.a("runthat"), tl.a()::c)))
                                          .then(b(ej.a("runfailed").then($$2), tl.a()::d)))
                                       .then(
                                          ej.a("verify").then(ej.a("tests", fn.a($$1, mg.bf)).executes($$0x -> d(tl.a().a($$0x, fn.a($$0x, "tests", mg.bf)))))
                                       ))
                                    .then(ej.a("locate").then(ej.a("tests", fn.a($$1, mg.bf)).executes($$0x -> e(tl.a().a($$0x, fn.a($$0x, "tests", mg.bf)))))))
                                 .then(ej.a("resetclosest").executes($$0x -> a(tl.a().a($$0x)))))
                              .then(ej.a("resetthese").executes($$0x -> a(tl.a().b($$0x)))))
                           .then(ej.a("resetthat").executes($$0x -> a(tl.a().c($$0x)))))
                        .then(ej.a("clearthat").executes($$0x -> b(tl.a().c($$0x)))))
                     .then(ej.a("clearthese").executes($$0x -> b(tl.a().b($$0x)))))
                  .then(
                     ((LiteralArgumentBuilder)ej.a("clearall").executes($$0x -> b(tl.a().a($$0x, 200))))
                        .then(
                           ej.a("radius", IntegerArgumentType.integer())
                              .executes($$0x -> b(tl.a().a($$0x, azk.a(IntegerArgumentType.getInteger($$0x, "radius"), 0, 1024))))
                        )
                  ))
               .then(ej.a("stop").executes($$0x -> a())))
            .then(
               ((LiteralArgumentBuilder)ej.a("pos").executes($$0x -> a((ei)$$0x.getSource(), "pos")))
                  .then(ej.a("var", StringArgumentType.word()).executes($$0x -> a((ei)$$0x.getSource(), StringArgumentType.getString($$0x, "var"))))
            ))
         .then(
            ej.a("create")
               .then(
                  ((RequiredArgumentBuilder)ej.a("id", fj.a()).suggests(ti::a).executes($$0x -> a((ei)$$0x.getSource(), fj.a($$0x, "id"), 5, 5, 5)))
                     .then(
                        ((RequiredArgumentBuilder)ej.a("width", IntegerArgumentType.integer())
                              .executes(
                                 $$0x -> a(
                                       (ei)$$0x.getSource(),
                                       fj.a($$0x, "id"),
                                       IntegerArgumentType.getInteger($$0x, "width"),
                                       IntegerArgumentType.getInteger($$0x, "width"),
                                       IntegerArgumentType.getInteger($$0x, "width")
                                    )
                              ))
                           .then(
                              ej.a("height", IntegerArgumentType.integer())
                                 .then(
                                    ej.a("depth", IntegerArgumentType.integer())
                                       .executes(
                                          $$0x -> a(
                                                (ei)$$0x.getSource(),
                                                fj.a($$0x, "id"),
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
      if (ab.aU) {
         $$3 = (LiteralArgumentBuilder<ei>)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)$$3.then(
                     ej.a("export").then(ej.a("test", fh.a($$1, mg.bf)).executes($$0x -> a((ei)$$0x.getSource(), fh.a($$0x, "test", mg.bf))))
                  ))
                  .then(ej.a("exportclosest").executes($$0x -> c(tl.a().a($$0x)))))
               .then(ej.a("exportthese").executes($$0x -> c(tl.a().b($$0x)))))
            .then(ej.a("exportthat").executes($$0x -> c(tl.a().c($$0x))));
      }

      $$0.register($$3);
   }

   public static CompletableFuture<Suggestions> a(CommandContext<ei> $$0, SuggestionsBuilder $$1) {
      Stream<String> $$2 = ((ei)$$0.getSource()).u().f(mg.ay).c().map(je::g);
      return en.b($$2, $$1);
   }

   private static int a(ei $$0, sp $$1) {
      dyi $$2 = $$1.f();
      $$2.a($$0::a);
      return 1;
   }

   private static Stream<sp> a(ei $$0, tf $$1, to $$2) {
      return $$2.findTestPos().map($$2x -> a($$2x, $$0, $$1)).flatMap(Optional::stream);
   }

   private static Stream<sp> a(ei $$0, tf $$1, tn $$2, int $$3) {
      return $$2.findTests().filter($$1x -> a($$0, ((sq)$$1x.a()).e())).map($$3x -> new sp($$3x, th.a($$3), $$0.e(), $$1));
   }

   private static Optional<sp> a(iu $$0, ei $$1, tf $$2) {
      aro $$3 = $$1.e();
      if ($$3.c_($$0) instanceof dyi $$4) {
         Optional<je.c<sq>> $$6 = $$4.j().flatMap($$1.u().f(mg.bf)::a);
         if ($$6.isEmpty()) {
            $$1.b(ww.a("commands.test.error.non_existant_test", $$4.k()));
            return Optional.empty();
         } else {
            je.c<sq> $$7 = $$6.get();
            sp $$8 = new sp($$7, $$4.u(), $$3, $$2);
            $$8.a($$0);
            return !a($$1, $$8.t()) ? Optional.empty() : Optional.of($$8);
         }
      } else {
         $$1.b(ww.a("commands.test.error.test_instance_not_found.position", $$0.u(), $$0.v(), $$0.w()));
         return Optional.empty();
      }
   }

   private static int a(ei $$0, ale $$1, int $$2, int $$3, int $$4) throws CommandSyntaxException {
      if ($$2 <= 48 && $$3 <= 48 && $$4 <= 48) {
         aro $$5 = $$0.e();
         iu $$6 = a($$0);
         dyi $$7 = th.a($$1, $$6, new jz($$2, $$3, $$4), dsm.a, $$5);
         iu $$8 = $$7.z();
         iu $$9 = $$8.b($$2 - 1, 0, $$4 - 1);
         iu.d($$8, $$9).forEach($$1x -> $$5.b($$1x, dlw.I.m()));
         $$0.a(() -> ww.a("commands.test.success", $$7.k()), true);
         return 1;
      } else {
         throw r.create(48);
      }
   }

   private static int a(ei $$0, String $$1) throws CommandSyntaxException {
      fds $$2 = (fds)$$0.h().a(10.0, 1.0F, false);
      iu $$3 = $$2.b();
      aro $$4 = $$0.e();
      Optional<iu> $$5 = th.a($$3, 15, $$4);
      if ($$5.isEmpty()) {
         $$5 = th.a($$3, 200, $$4);
      }

      if ($$5.isEmpty()) {
         throw q.create($$3.u(), $$3.v(), $$3.w());
      } else if ($$4.c_($$5.get()) instanceof dyi $$6) {
         iu var12 = $$6.z();
         iu $$9 = $$3.b(var12);
         String $$10 = $$9.u() + ", " + $$9.v() + ", " + $$9.w();
         String $$11 = $$6.k().getString();
         xk $$12 = ww.a("commands.test.coordinates", $$9.u(), $$9.v(), $$9.w())
            .b(xt.a.a(true).a(n.k).a(new xc.e(ww.c("commands.test.coordinates.copy"))).a(new wu.c("final BlockPos " + $$1 + " = new BlockPos(" + $$10 + ");")));
         $$0.a(() -> ww.a("commands.test.relative_position", $$11, $$12), false);
         agk.a($$4, new iu($$3), $$10, -2147418368, 10000);
         return 1;
      } else {
         throw n.create();
      }
   }

   private static int a() {
      sx.a.a();
      return 1;
   }

   public static int a(ei $$0, su $$1) {
      $$1.a(new ti.a($$0));
      td $$2 = new td($$1.a());
      $$2.a(new ti.b($$0, $$2));
      $$2.a($$0x -> sf.a($$0x.w()));
      $$1.b();
      return 1;
   }

   private static int a(ei $$0, je<sq> $$1) {
      return !dyi.a($$0.e(), $$1.a().e(), $$0::a) ? 0 : 1;
   }

   private static boolean a(ei $$0, ale $$1) {
      if ($$0.e().r().b($$1).isEmpty()) {
         $$0.b(ww.a("commands.test.error.structure_not_found", ww.a($$1)));
         return false;
      } else {
         return true;
      }
   }

   private static iu a(ei $$0) {
      iu $$1 = iu.a((jo)$$0.d());
      int $$2 = $$0.e().a(efn.a.b, $$1).v();
      return new iu($$1.u(), $$2, $$1.w() + 3);
   }

   static record a(ei a) implements sl {
      @Override
      public void a(sj $$0) {
         this.a.a(() -> ww.a("commands.test.batch.starting", $$0.c().g(), $$0.a()), true);
      }

      @Override
      public void b(sj $$0) {
      }
   }

   public static record b(ei a, td b) implements ss {
      @Override
      public void a(sp $$0) {
      }

      @Override
      public void a(sp $$0, su $$1) {
         this.c();
      }

      @Override
      public void b(sp $$0, su $$1) {
         this.c();
      }

      @Override
      public void a(sp $$0, sp $$1, su $$2) {
         this.b.a($$1);
      }

      private void c() {
         if (this.b.i()) {
            this.a.a(() -> ww.a("commands.test.summary", this.b.h()).a(n.p), true);
            if (this.b.d()) {
               this.a.b(ww.a("commands.test.summary.failed", this.b.a()));
            } else {
               this.a.a(() -> ww.c("commands.test.summary.all_required_passed").a(n.k), true);
            }

            if (this.b.e()) {
               this.a.a(ww.a("commands.test.summary.optional_failed", this.b.b()));
            }
         }
      }
   }
}
