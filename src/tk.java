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

public class tk {
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
   private static final SimpleCommandExceptionType l = new SimpleCommandExceptionType(xg.c("commands.test.clear.error.no_tests"));
   private static final SimpleCommandExceptionType m = new SimpleCommandExceptionType(xg.c("commands.test.reset.error.no_tests"));
   private static final SimpleCommandExceptionType n = new SimpleCommandExceptionType(xg.c("commands.test.error.test_instance_not_found"));
   private static final SimpleCommandExceptionType o = new SimpleCommandExceptionType(xg.b("Could not find any structures to export"));
   private static final SimpleCommandExceptionType p = new SimpleCommandExceptionType(xg.c("commands.test.error.no_test_instances"));
   private static final Dynamic3CommandExceptionType q = new Dynamic3CommandExceptionType(
      ($$0, $$1, $$2) -> xg.b("commands.test.error.no_test_containing_pos", $$0, $$1, $$2)
   );
   private static final DynamicCommandExceptionType r = new DynamicCommandExceptionType($$0 -> xg.b("commands.test.error.too_large", $$0));

   private static int a(tn $$0) throws CommandSyntaxException {
      a();
      int $$1 = a($$0.b(), th.a(), $$0).map($$1x -> a($$0.b(), $$1x)).toList().size();
      if ($$1 == 0) {
         throw l.create();
      } else {
         $$0.b().a(() -> xg.a("commands.test.reset.success", $$1), true);
         return $$1;
      }
   }

   private static int b(tn $$0) throws CommandSyntaxException {
      a();
      ek $$1 = $$0.b();
      asb $$2 = $$1.e();
      sw.a($$2);
      List<esf> $$3 = $$0.findTestPos().flatMap($$1x -> $$2.a($$1x, dyq.U).stream()).map(eaj::d).toList();
      $$3.forEach($$1x -> tj.a($$1x, $$2));
      if ($$3.isEmpty()) {
         throw l.create();
      } else {
         $$1.a(() -> xg.a("commands.test.clear.success", $$3.size()), true);
         return $$3.size();
      }
   }

   private static int c(tn $$0) throws CommandSyntaxException {
      ek $$1 = $$0.b();
      asb $$2 = $$1.e();
      int $$3 = 0;
      boolean $$4 = true;

      for (Iterator<iw> $$5 = $$0.findTestPos().iterator(); $$5.hasNext(); $$3++) {
         iw $$6 = $$5.next();
         if (!($$2.c_($$6) instanceof eaj $$7)) {
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
         $$0.b().a(() -> xg.b($$8), true);
         return $$4 ? 0 : 1;
      }
   }

   private static int d(tn $$0) {
      a();
      ek $$1 = $$0.b();
      asb $$2 = $$1.e();
      iw $$3 = a($$1);
      Collection<sr> $$4 = Stream.concat(a($$1, th.a(), $$0), a($$1, th.a(), $$0, 0)).toList();
      sw.a($$2);
      sg.b();
      Collection<sk> $$5 = new ArrayList<>();

      for (sr $$6 : $$4) {
         for (dui $$7 : dui.values()) {
            Collection<sr> $$8 = new ArrayList<>();

            for (int $$9 = 0; $$9 < 100; $$9++) {
               sr $$10 = new sr($$6.w(), $$7, $$2, new th(1, true));
               $$10.a($$6.c());
               $$8.add($$10);
            }

            sk $$11 = sl.a($$8, $$6.v().d(), $$7.ordinal());
            $$5.add($$11);
         }
      }

      ti $$12 = new ti($$3, 10, true);
      sw $$13 = sw.a.a($$5, $$2).a(sl.a(100)).a((sw.c)$$12).a($$12).a(true).a();
      return a($$1, $$13);
   }

   private static int a(tn $$0, th $$1, int $$2, int $$3) {
      a();
      ek $$4 = $$0.b();
      asb $$5 = $$4.e();
      iw $$6 = a($$4);
      Collection<sr> $$7 = Stream.concat(a($$4, $$1, $$0), a($$4, $$1, $$0, $$2)).toList();
      if ($$7.isEmpty()) {
         $$4.a(() -> xg.c("commands.test.no_tests"), false);
         return 0;
      } else {
         sw.a($$5);
         sg.b();
         $$4.a(() -> xg.a("commands.test.run.running", $$7.size()), false);
         sw $$8 = sw.a.b($$7, $$5).a((sw.c)(new ti($$6, $$3, false))).a();
         return a($$4, $$8);
      }
   }

   private static int e(tn $$0) throws CommandSyntaxException {
      $$0.b().a(xg.c("commands.test.locate.started"));
      MutableInt $$1 = new MutableInt(0);
      iw $$2 = iw.a((jq)$$0.b().d());
      $$0.findTestPos()
         .forEach(
            $$3x -> {
               if ($$0.b().e().c_($$3x) instanceof eaj $$5) {
                  jc var13 = $$5.u().a(jc.c);
                  iw $$8 = $$5.aC_().a(var13, 2);
                  int $$9 = (int)var13.g().p();
                  String $$10 = String.format(Locale.ROOT, "/tp @s %d %d %d %d 0", $$8.u(), $$8.v(), $$8.w(), $$9);
                  int $$11 = $$2.u() - $$3x.u();
                  int $$12 = $$2.w() - $$3x.w();
                  int $$13 = azz.d(azz.c((float)($$11 * $$11 + $$12 * $$12)));
                  xu $$14 = xj.a((xg)xg.a("chat.coordinates", $$3x.u(), $$3x.v(), $$3x.w()))
                     .a($$1xx -> $$1xx.a(o.k).a(new xe.g($$10)).a(new xm.e(xg.c("chat.coordinates.tooltip"))));
                  $$0.b().a(() -> xg.a("commands.test.locate.found", $$14, $$13), false);
                  $$1.increment();
               }
            }
         );
      int $$3 = $$1.intValue();
      if ($$3 == 0) {
         throw p.create();
      } else {
         $$0.b().a(() -> xg.a("commands.test.locate.done", $$3), true);
         return $$3;
      }
   }

   private static ArgumentBuilder<ek, ?> a(
      ArgumentBuilder<ek, ?> $$0, aoe<CommandContext<ek>, tn> $$1, Function<ArgumentBuilder<ek, ?>, ArgumentBuilder<ek, ?>> $$2
   ) {
      return $$0.executes($$1x -> a($$1.apply($$1x), th.a(), 0, 8))
         .then(
            ((RequiredArgumentBuilder)el.a("numberOfTimes", IntegerArgumentType.integer(0))
                  .executes($$1x -> a($$1.apply($$1x), new th(IntegerArgumentType.getInteger($$1x, "numberOfTimes"), false), 0, 8)))
               .then(
                  $$2.apply(
                     el.a("untilFailed", BoolArgumentType.bool())
                        .executes(
                           $$1x -> a(
                                 $$1.apply($$1x),
                                 new th(IntegerArgumentType.getInteger($$1x, "numberOfTimes"), BoolArgumentType.getBool($$1x, "untilFailed")),
                                 0,
                                 8
                              )
                        )
                  )
               )
         );
   }

   private static ArgumentBuilder<ek, ?> a(ArgumentBuilder<ek, ?> $$0, aoe<CommandContext<ek>, tn> $$1) {
      return a($$0, $$1, $$0x -> $$0x);
   }

   private static ArgumentBuilder<ek, ?> b(ArgumentBuilder<ek, ?> $$0, aoe<CommandContext<ek>, tn> $$1) {
      return a(
         $$0,
         $$1,
         $$1x -> $$1x.then(
               ((RequiredArgumentBuilder)el.a("rotationSteps", IntegerArgumentType.integer())
                     .executes(
                        $$1xx -> a(
                              $$1.apply($$1xx),
                              new th(IntegerArgumentType.getInteger($$1xx, "numberOfTimes"), BoolArgumentType.getBool($$1xx, "untilFailed")),
                              IntegerArgumentType.getInteger($$1xx, "rotationSteps"),
                              8
                           )
                     ))
                  .then(
                     el.a("testsPerRow", IntegerArgumentType.integer())
                        .executes(
                           $$1xx -> a(
                                 $$1.apply($$1xx),
                                 new th(IntegerArgumentType.getInteger($$1xx, "numberOfTimes"), BoolArgumentType.getBool($$1xx, "untilFailed")),
                                 IntegerArgumentType.getInteger($$1xx, "rotationSteps"),
                                 IntegerArgumentType.getInteger($$1xx, "testsPerRow")
                              )
                        )
                  )
            )
      );
   }

   public static void a(CommandDispatcher<ek> $$0, eg $$1) {
      ArgumentBuilder<ek, ?> $$2 = b(
         el.a("onlyRequiredTests", BoolArgumentType.bool()), $$0x -> tn.a().a($$0x, BoolArgumentType.getBool($$0x, "onlyRequiredTests"))
      );
      LiteralArgumentBuilder<ek> $$3 = (LiteralArgumentBuilder<ek>)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)el.a(
                                                               "test"
                                                            )
                                                            .requires($$0x -> $$0x.c(2)))
                                                         .then(
                                                            el.a("run")
                                                               .then(b(el.a("tests", fp.a($$1, mi.bh)), $$0x -> tn.a().a($$0x, fp.a($$0x, "tests", mi.bh))))
                                                         ))
                                                      .then(
                                                         el.a("runmultiple")
                                                            .then(
                                                               ((RequiredArgumentBuilder)el.a("tests", fp.a($$1, mi.bh))
                                                                     .executes($$0x -> a(tn.a().a($$0x, fp.a($$0x, "tests", mi.bh)), th.a(), 0, 8)))
                                                                  .then(
                                                                     el.a("amount", IntegerArgumentType.integer())
                                                                        .executes(
                                                                           $$0x -> a(
                                                                                 tn.a()
                                                                                    .a(IntegerArgumentType.getInteger($$0x, "amount"))
                                                                                    .a($$0x, fp.a($$0x, "tests", mi.bh)),
                                                                                 th.a(),
                                                                                 0,
                                                                                 8
                                                                              )
                                                                        )
                                                                  )
                                                            )
                                                      ))
                                                   .then(a(el.a("runthese"), tn.a()::b)))
                                                .then(a(el.a("runclosest"), tn.a()::a)))
                                             .then(a(el.a("runthat"), tn.a()::c)))
                                          .then(b(el.a("runfailed").then($$2), tn.a()::d)))
                                       .then(
                                          el.a("verify").then(el.a("tests", fp.a($$1, mi.bh)).executes($$0x -> d(tn.a().a($$0x, fp.a($$0x, "tests", mi.bh)))))
                                       ))
                                    .then(el.a("locate").then(el.a("tests", fp.a($$1, mi.bh)).executes($$0x -> e(tn.a().a($$0x, fp.a($$0x, "tests", mi.bh)))))))
                                 .then(el.a("resetclosest").executes($$0x -> a(tn.a().a($$0x)))))
                              .then(el.a("resetthese").executes($$0x -> a(tn.a().b($$0x)))))
                           .then(el.a("resetthat").executes($$0x -> a(tn.a().c($$0x)))))
                        .then(el.a("clearthat").executes($$0x -> b(tn.a().c($$0x)))))
                     .then(el.a("clearthese").executes($$0x -> b(tn.a().b($$0x)))))
                  .then(
                     ((LiteralArgumentBuilder)el.a("clearall").executes($$0x -> b(tn.a().a($$0x, 200))))
                        .then(
                           el.a("radius", IntegerArgumentType.integer())
                              .executes($$0x -> b(tn.a().a($$0x, azz.a(IntegerArgumentType.getInteger($$0x, "radius"), 0, 1024))))
                        )
                  ))
               .then(el.a("stop").executes($$0x -> a())))
            .then(
               ((LiteralArgumentBuilder)el.a("pos").executes($$0x -> a((ek)$$0x.getSource(), "pos")))
                  .then(el.a("var", StringArgumentType.word()).executes($$0x -> a((ek)$$0x.getSource(), StringArgumentType.getString($$0x, "var"))))
            ))
         .then(
            el.a("create")
               .then(
                  ((RequiredArgumentBuilder)el.a("id", fl.a()).suggests(tk::a).executes($$0x -> a((ek)$$0x.getSource(), fl.a($$0x, "id"), 5, 5, 5)))
                     .then(
                        ((RequiredArgumentBuilder)el.a("width", IntegerArgumentType.integer())
                              .executes(
                                 $$0x -> a(
                                       (ek)$$0x.getSource(),
                                       fl.a($$0x, "id"),
                                       IntegerArgumentType.getInteger($$0x, "width"),
                                       IntegerArgumentType.getInteger($$0x, "width"),
                                       IntegerArgumentType.getInteger($$0x, "width")
                                    )
                              ))
                           .then(
                              el.a("height", IntegerArgumentType.integer())
                                 .then(
                                    el.a("depth", IntegerArgumentType.integer())
                                       .executes(
                                          $$0x -> a(
                                                (ek)$$0x.getSource(),
                                                fl.a($$0x, "id"),
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
         $$3 = (LiteralArgumentBuilder<ek>)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)$$3.then(
                     el.a("export").then(el.a("test", fj.a($$1, mi.bh)).executes($$0x -> a((ek)$$0x.getSource(), fj.a($$0x, "test", mi.bh))))
                  ))
                  .then(el.a("exportclosest").executes($$0x -> c(tn.a().a($$0x)))))
               .then(el.a("exportthese").executes($$0x -> c(tn.a().b($$0x)))))
            .then(el.a("exportthat").executes($$0x -> c(tn.a().c($$0x))));
      }

      $$0.register($$3);
   }

   public static CompletableFuture<Suggestions> a(CommandContext<ek> $$0, SuggestionsBuilder $$1) {
      Stream<String> $$2 = ((ek)$$0.getSource()).u().f(mi.ay).c().map(jg::g);
      return ep.b($$2, $$1);
   }

   private static int a(ek $$0, sr $$1) {
      eaj $$2 = $$1.f();
      $$2.a($$0::a);
      return 1;
   }

   private static Stream<sr> a(ek $$0, th $$1, tq $$2) {
      return $$2.findTestPos().map($$2x -> a($$2x, $$0, $$1)).flatMap(Optional::stream);
   }

   private static Stream<sr> a(ek $$0, th $$1, tp $$2, int $$3) {
      return $$2.findTests().filter($$1x -> a($$0, ((ss)$$1x.a()).e())).map($$3x -> new sr($$3x, tj.a($$3), $$0.e(), $$1));
   }

   private static Optional<sr> a(iw $$0, ek $$1, th $$2) {
      asb $$3 = $$1.e();
      if ($$3.c_($$0) instanceof eaj $$4) {
         Optional<jg.c<ss>> $$6 = $$4.j().flatMap($$1.u().f(mi.bh)::a);
         if ($$6.isEmpty()) {
            $$1.b(xg.a("commands.test.error.non_existant_test", $$4.k()));
            return Optional.empty();
         } else {
            jg.c<ss> $$7 = $$6.get();
            sr $$8 = new sr($$7, $$4.u(), $$3, $$2);
            $$8.a($$0);
            return !a($$1, $$8.t()) ? Optional.empty() : Optional.of($$8);
         }
      } else {
         $$1.b(xg.a("commands.test.error.test_instance_not_found.position", $$0.u(), $$0.v(), $$0.w()));
         return Optional.empty();
      }
   }

   private static int a(ek $$0, alr $$1, int $$2, int $$3, int $$4) throws CommandSyntaxException {
      if ($$2 <= 48 && $$3 <= 48 && $$4 <= 48) {
         asb $$5 = $$0.e();
         iw $$6 = a($$0);
         eaj $$7 = tj.a($$1, $$6, new kb($$2, $$3, $$4), dui.a, $$5);
         iw $$8 = $$7.z();
         iw $$9 = $$8.b($$2 - 1, 0, $$4 - 1);
         iw.d($$8, $$9).forEach($$1x -> $$5.b($$1x, dnq.I.m()));
         $$0.a(() -> xg.a("commands.test.create.success", $$7.k()), true);
         return 1;
      } else {
         throw r.create(48);
      }
   }

   private static int a(ek $$0, String $$1) throws CommandSyntaxException {
      ffy $$2 = (ffy)$$0.h().a(10.0, 1.0F, false);
      iw $$3 = $$2.b();
      asb $$4 = $$0.e();
      Optional<iw> $$5 = tj.a($$3, 15, $$4);
      if ($$5.isEmpty()) {
         $$5 = tj.a($$3, 200, $$4);
      }

      if ($$5.isEmpty()) {
         throw q.create($$3.u(), $$3.v(), $$3.w());
      } else if ($$4.c_($$5.get()) instanceof eaj $$6) {
         iw var12 = $$6.z();
         iw $$9 = $$3.b(var12);
         String $$10 = $$9.u() + ", " + $$9.v() + ", " + $$9.w();
         String $$11 = $$6.k().getString();
         xu $$12 = xg.a("commands.test.coordinates", $$9.u(), $$9.v(), $$9.w())
            .b(yd.a.a(true).a(o.k).a(new xm.e(xg.c("commands.test.coordinates.copy"))).a(new xe.c("final BlockPos " + $$1 + " = new BlockPos(" + $$10 + ");")));
         $$0.a(() -> xg.a("commands.test.relative_position", $$11, $$12), false);
         agx.a($$4, new iw($$3), $$10, -2147418368, 10000);
         return 1;
      } else {
         throw n.create();
      }
   }

   private static int a() {
      sz.a.a();
      return 1;
   }

   public static int a(ek $$0, sw $$1) {
      $$1.a(new tk.a($$0));
      tf $$2 = new tf($$1.a());
      $$2.a(new tk.b($$0, $$2));
      $$2.a($$0x -> sg.a($$0x.w()));
      $$1.b();
      return 1;
   }

   private static int a(ek $$0, jg<ss> $$1) {
      return !eaj.a($$0.e(), $$1.a().e(), $$0::a) ? 0 : 1;
   }

   private static boolean a(ek $$0, alr $$1) {
      if ($$0.e().r().b($$1).isEmpty()) {
         $$0.b(xg.a("commands.test.error.structure_not_found", xg.a($$1)));
         return false;
      } else {
         return true;
      }
   }

   private static iw a(ek $$0) {
      iw $$1 = iw.a((jq)$$0.d());
      int $$2 = $$0.e().a(ehp.a.b, $$1).v();
      return new iw($$1.u(), $$2, $$1.w() + 3);
   }

   static record a(ek a) implements sm {
      @Override
      public void a(sk $$0) {
         this.a.a(() -> xg.a("commands.test.batch.starting", $$0.c().g(), $$0.a()), true);
      }

      @Override
      public void b(sk $$0) {
      }
   }

   public static record b(ek a, tf b) implements su {
      @Override
      public void a(sr $$0) {
      }

      @Override
      public void a(sr $$0, sw $$1) {
         this.c();
      }

      @Override
      public void b(sr $$0, sw $$1) {
         this.c();
      }

      @Override
      public void a(sr $$0, sr $$1, sw $$2) {
         this.b.a($$1);
      }

      private void c() {
         if (this.b.i()) {
            this.a.a(() -> xg.a("commands.test.summary", this.b.h()).a(o.p), true);
            if (this.b.d()) {
               this.a.b(xg.a("commands.test.summary.failed", this.b.a()));
            } else {
               this.a.a(() -> xg.c("commands.test.summary.all_required_passed").a(o.k), true);
            }

            if (this.b.e()) {
               this.a.a(xg.a("commands.test.summary.optional_failed", this.b.b()));
            }
         }
      }
   }
}
