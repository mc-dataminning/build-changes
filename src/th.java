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

public class th {
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
   private static final SimpleCommandExceptionType l = new SimpleCommandExceptionType(wv.c("commands.test.clear.error.no_tests"));
   private static final SimpleCommandExceptionType m = new SimpleCommandExceptionType(wv.c("commands.test.error.test_instance_not_found"));
   private static final SimpleCommandExceptionType n = new SimpleCommandExceptionType(wv.b("Could not find any structures to export"));
   private static final SimpleCommandExceptionType o = new SimpleCommandExceptionType(wv.c("commands.test.error.no_test_instances"));
   private static final Dynamic3CommandExceptionType p = new Dynamic3CommandExceptionType(
      ($$0, $$1, $$2) -> wv.b("commands.test.error.no_test_containing_pos", $$0, $$1, $$2)
   );

   private static int a(tk $$0) {
      a();
      return a($$0.b(), te.a(), $$0).map($$1 -> a($$0.b(), $$1)).toList().isEmpty() ? 0 : 1;
   }

   private static int b(tk $$0) throws CommandSyntaxException {
      a();
      ex $$1 = $$0.b();
      arn $$2 = $$1.e();
      st.a($$2);
      Stream<jj> $$3 = $$0.findTestPos();
      int $$4 = $$3.mapToInt($$1x -> {
         if ($$2.c_($$1x) instanceof dxg $$3x) {
            eoy $$4x = $$3x.d();
            tg.a($$4x, $$2);
            return 1;
         } else {
            return 0;
         }
      }).sum();
      if ($$4 == 0) {
         throw l.create();
      } else {
         $$1.a(() -> wv.a("commands.test.clear.success", $$4), true);
         return 1;
      }
   }

   private static int c(tk $$0) throws CommandSyntaxException {
      ex $$1 = $$0.b();
      arn $$2 = $$1.e();
      int $$3 = 0;
      boolean $$4 = true;

      for (Iterator<jj> $$5 = $$0.findTestPos().iterator(); $$5.hasNext(); $$3++) {
         jj $$6 = $$5.next();
         if (!($$2.c_($$6) instanceof dxg $$7)) {
            throw m.create();
         }

         if (!$$7.c($$1::a)) {
            $$4 = false;
         }
      }

      if ($$3 == 0) {
         throw n.create();
      } else {
         String $$8 = "Exported " + $$3 + " structures";
         $$0.b().a(() -> wv.b($$8), true);
         return $$4 ? 0 : 1;
      }
   }

   private static int d(tk $$0) {
      a();
      ex $$1 = $$0.b();
      arn $$2 = $$1.e();
      jj $$3 = a($$1);
      Collection<so> $$4 = Stream.concat(a($$1, te.a(), $$0), a($$1, te.a(), $$0, 0)).toList();
      st.a($$2);
      se.b();
      Collection<si> $$5 = new ArrayList<>();

      for (so $$6 : $$4) {
         for (drm $$7 : drm.values()) {
            Collection<so> $$8 = new ArrayList<>();

            for (int $$9 = 0; $$9 < 100; $$9++) {
               so $$10 = new so($$6.w(), $$7, $$2, new te(1, true));
               $$10.a($$6.c());
               $$8.add($$10);
            }

            si $$11 = sj.a($$8, $$6.v().d(), $$7.ordinal());
            $$5.add($$11);
         }
      }

      tf $$12 = new tf($$3, 10, true);
      st $$13 = st.a.a($$5, $$2).a(sj.a(100)).a((st.c)$$12).a($$12).a(true).a();
      return a($$1, $$13);
   }

   private static int a(tk $$0, te $$1, int $$2, int $$3) {
      a();
      ex $$4 = $$0.b();
      arn $$5 = $$4.e();
      jj $$6 = a($$4);
      Collection<so> $$7 = Stream.concat(a($$4, $$1, $$0), a($$4, $$1, $$0, $$2)).toList();
      if ($$7.isEmpty()) {
         $$4.a(() -> wv.c("commands.test.no_tests"), false);
         return 0;
      } else {
         st.a($$5);
         se.b();
         $$4.a(() -> wv.a("commands.test.run.running", $$7.size()), false);
         st $$8 = st.a.b($$7, $$5).a((st.c)(new tf($$6, $$3, false))).a();
         return a($$4, $$8);
      }
   }

   private static int e(tk $$0) throws CommandSyntaxException {
      $$0.b().a(wv.c("commands.test.locate.started"));
      MutableInt $$1 = new MutableInt(0);
      jj $$2 = jj.a((kc)$$0.b().d());
      $$0.findTestPos()
         .forEach(
            $$3x -> {
               if ($$0.b().e().c_($$3x) instanceof dxg $$5) {
                  jo var13 = $$5.u().a(jo.c);
                  jj $$8 = $$5.aw_().a(var13, 2);
                  int $$9 = (int)var13.g().p();
                  String $$10 = String.format(Locale.ROOT, "/tp @s %d %d %d %d 0", $$8.u(), $$8.v(), $$8.w(), $$9);
                  int $$11 = $$2.u() - $$3x.u();
                  int $$12 = $$2.w() - $$3x.w();
                  int $$13 = azk.d(azk.c((float)($$11 * $$11 + $$12 * $$12)));
                  xj $$14 = wy.a((wv)wv.a("chat.coordinates", $$3x.u(), $$3x.v(), $$3x.w()))
                     .a($$1xx -> $$1xx.a(n.k).a(new wt.g($$10)).a(new xb.e(wv.c("chat.coordinates.tooltip"))));
                  $$0.b().a(() -> wv.a("commands.test.locate.found", $$14, $$13), false);
                  $$1.increment();
               }
            }
         );
      int $$3 = $$1.intValue();
      if ($$3 == 0) {
         throw o.create();
      } else {
         $$0.b().a(() -> wv.a("commands.test.locate.done", $$3), true);
         return $$3;
      }
   }

   private static ArgumentBuilder<ex, ?> a(
      ArgumentBuilder<ex, ?> $$0, anq<CommandContext<ex>, tk> $$1, Function<ArgumentBuilder<ex, ?>, ArgumentBuilder<ex, ?>> $$2
   ) {
      return $$0.executes($$1x -> a($$1.apply($$1x), te.a(), 0, 8))
         .then(
            ((RequiredArgumentBuilder)ey.a("numberOfTimes", IntegerArgumentType.integer(0))
                  .executes($$1x -> a($$1.apply($$1x), new te(IntegerArgumentType.getInteger($$1x, "numberOfTimes"), false), 0, 8)))
               .then(
                  $$2.apply(
                     ey.a("untilFailed", BoolArgumentType.bool())
                        .executes(
                           $$1x -> a(
                                 $$1.apply($$1x),
                                 new te(IntegerArgumentType.getInteger($$1x, "numberOfTimes"), BoolArgumentType.getBool($$1x, "untilFailed")),
                                 0,
                                 8
                              )
                        )
                  )
               )
         );
   }

   private static ArgumentBuilder<ex, ?> a(ArgumentBuilder<ex, ?> $$0, anq<CommandContext<ex>, tk> $$1) {
      return a($$0, $$1, $$0x -> $$0x);
   }

   private static ArgumentBuilder<ex, ?> b(ArgumentBuilder<ex, ?> $$0, anq<CommandContext<ex>, tk> $$1) {
      return a(
         $$0,
         $$1,
         $$1x -> $$1x.then(
               ((RequiredArgumentBuilder)ey.a("rotationSteps", IntegerArgumentType.integer())
                     .executes(
                        $$1xx -> a(
                              $$1.apply($$1xx),
                              new te(IntegerArgumentType.getInteger($$1xx, "numberOfTimes"), BoolArgumentType.getBool($$1xx, "untilFailed")),
                              IntegerArgumentType.getInteger($$1xx, "rotationSteps"),
                              8
                           )
                     ))
                  .then(
                     ey.a("testsPerRow", IntegerArgumentType.integer())
                        .executes(
                           $$1xx -> a(
                                 $$1.apply($$1xx),
                                 new te(IntegerArgumentType.getInteger($$1xx, "numberOfTimes"), BoolArgumentType.getBool($$1xx, "untilFailed")),
                                 IntegerArgumentType.getInteger($$1xx, "rotationSteps"),
                                 IntegerArgumentType.getInteger($$1xx, "testsPerRow")
                              )
                        )
                  )
            )
      );
   }

   public static void a(CommandDispatcher<ex> $$0, et $$1) {
      ArgumentBuilder<ex, ?> $$2 = b(
         ey.a("onlyRequiredTests", BoolArgumentType.bool()), $$0x -> tk.a().a($$0x, BoolArgumentType.getBool($$0x, "onlyRequiredTests"))
      );
      LiteralArgumentBuilder<ex> $$3 = (LiteralArgumentBuilder<ex>)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ey.a(
                                                               "test"
                                                            )
                                                            .requires($$0x -> $$0x.c(2)))
                                                         .then(
                                                            ey.a("run")
                                                               .then(b(ey.a("tests", gc.a($$1, me.bf)), $$0x -> tk.a().a($$0x, gc.a($$0x, "tests", me.bf))))
                                                         ))
                                                      .then(
                                                         ey.a("runmultiple")
                                                            .then(
                                                               ((RequiredArgumentBuilder)ey.a("tests", gc.a($$1, me.bf))
                                                                     .executes($$0x -> a(tk.a().a($$0x, gc.a($$0x, "tests", me.bf)), te.a(), 0, 8)))
                                                                  .then(
                                                                     ey.a("amount", IntegerArgumentType.integer())
                                                                        .executes(
                                                                           $$0x -> a(
                                                                                 tk.a()
                                                                                    .a(IntegerArgumentType.getInteger($$0x, "amount"))
                                                                                    .a($$0x, gc.a($$0x, "tests", me.bf)),
                                                                                 te.a(),
                                                                                 0,
                                                                                 8
                                                                              )
                                                                        )
                                                                  )
                                                            )
                                                      ))
                                                   .then(a(ey.a("runthese"), tk.a()::b)))
                                                .then(a(ey.a("runclosest"), tk.a()::a)))
                                             .then(a(ey.a("runthat"), tk.a()::c)))
                                          .then(b(ey.a("runfailed").then($$2), tk.a()::d)))
                                       .then(
                                          ey.a("verify").then(ey.a("tests", gc.a($$1, me.bf)).executes($$0x -> d(tk.a().a($$0x, gc.a($$0x, "tests", me.bf)))))
                                       ))
                                    .then(ey.a("locate").then(ey.a("tests", fw.a($$1, me.bf)).executes($$0x -> e(tk.a().a($$0x, gc.a($$0x, "tests", me.bf)))))))
                                 .then(ey.a("resetclosest").executes($$0x -> a(tk.a().a($$0x)))))
                              .then(ey.a("resetthese").executes($$0x -> a(tk.a().b($$0x)))))
                           .then(ey.a("resetthat").executes($$0x -> a(tk.a().c($$0x)))))
                        .then(ey.a("clearthat").executes($$0x -> b(tk.a().c($$0x)))))
                     .then(ey.a("clearthese").executes($$0x -> b(tk.a().b($$0x)))))
                  .then(
                     ((LiteralArgumentBuilder)ey.a("clearall").executes($$0x -> b(tk.a().a($$0x, 200))))
                        .then(
                           ey.a("radius", IntegerArgumentType.integer())
                              .executes($$0x -> b(tk.a().a($$0x, azk.a(IntegerArgumentType.getInteger($$0x, "radius"), 0, 1024))))
                        )
                  ))
               .then(ey.a("stop").executes($$0x -> a())))
            .then(
               ((LiteralArgumentBuilder)ey.a("pos").executes($$0x -> a((ex)$$0x.getSource(), "pos")))
                  .then(ey.a("var", StringArgumentType.word()).executes($$0x -> a((ex)$$0x.getSource(), StringArgumentType.getString($$0x, "var"))))
            ))
         .then(
            ey.a("create")
               .then(
                  ((RequiredArgumentBuilder)ey.a("id", fy.a()).suggests(th::a).executes($$0x -> a((ex)$$0x.getSource(), fy.a($$0x, "id"), 5, 5, 5)))
                     .then(
                        ((RequiredArgumentBuilder)ey.a("width", IntegerArgumentType.integer())
                              .executes(
                                 $$0x -> a(
                                       (ex)$$0x.getSource(),
                                       fy.a($$0x, "id"),
                                       IntegerArgumentType.getInteger($$0x, "width"),
                                       IntegerArgumentType.getInteger($$0x, "width"),
                                       IntegerArgumentType.getInteger($$0x, "width")
                                    )
                              ))
                           .then(
                              ey.a("height", IntegerArgumentType.integer())
                                 .then(
                                    ey.a("depth", IntegerArgumentType.integer())
                                       .executes(
                                          $$0x -> a(
                                                (ex)$$0x.getSource(),
                                                fy.a($$0x, "id"),
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
         $$3 = (LiteralArgumentBuilder<ex>)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)$$3.then(
                     ey.a("export").then(ey.a("test", fw.a($$1, me.bf)).executes($$0x -> a((ex)$$0x.getSource(), fw.a($$0x, "test", me.bf))))
                  ))
                  .then(ey.a("exportclosest").executes($$0x -> c(tk.a().a($$0x)))))
               .then(ey.a("exportthese").executes($$0x -> c(tk.a().b($$0x)))))
            .then(ey.a("exportthat").executes($$0x -> c(tk.a().c($$0x))));
      }

      $$0.register($$3);
   }

   public static CompletableFuture<Suggestions> a(CommandContext<ex> $$0, SuggestionsBuilder $$1) {
      Stream<String> $$2 = ((ex)$$0.getSource()).u().f(me.aJ).c().map(js::g);
      return fc.b($$2, $$1);
   }

   private static int a(ex $$0, so $$1) {
      dxg $$2 = $$1.f();
      $$2.a($$0::a);
      return 1;
   }

   private static Stream<so> a(ex $$0, te $$1, tn $$2) {
      return $$2.findTestPos().map($$2x -> a($$2x, $$0, $$1)).flatMap(Optional::stream);
   }

   private static Stream<so> a(ex $$0, te $$1, tm $$2, int $$3) {
      return $$2.findTests().filter($$1x -> a($$0, ((sp)$$1x.a()).e())).map($$3x -> new so($$3x, tg.a($$3), $$0.e(), $$1));
   }

   private static Optional<so> a(jj $$0, ex $$1, te $$2) {
      arn $$3 = $$1.e();
      if ($$3.c_($$0) instanceof dxg $$4) {
         Optional<js.c<sp>> $$6 = $$4.j().flatMap($$1.u().f(me.bf)::a);
         if ($$6.isEmpty()) {
            $$1.b(wv.a("commands.test.error.non_existant_test", $$4.k()));
            return Optional.empty();
         } else {
            js.c<sp> $$7 = $$6.get();
            so $$8 = new so($$7, $$4.u(), $$3, $$2);
            $$8.a($$0);
            return !a($$1, $$8.t()) ? Optional.empty() : Optional.of($$8);
         }
      } else {
         $$1.b(wv.a("commands.test.error.test_instance_not_found.position", $$0.u(), $$0.v(), $$0.w()));
         return Optional.empty();
      }
   }

   private static int a(ex $$0, ald $$1, int $$2, int $$3, int $$4) {
      if ($$2 <= 48 && $$3 <= 48 && $$4 <= 48) {
         arn $$5 = $$0.e();
         jj $$6 = a($$0);
         dxg $$7 = tg.a($$1, $$6, new kn($$2, $$3, $$4), drm.a, $$5);
         jj $$8 = $$7.z();
         jj $$9 = $$8.b($$2 - 1, 0, $$4 - 1);
         jj.d($$8, $$9).forEach($$1x -> $$5.b($$1x, dkw.I.m()));
         return 0;
      } else {
         throw new IllegalArgumentException("The structure must be less than 48 blocks big in each axis");
      }
   }

   private static int a(ex $$0, String $$1) throws CommandSyntaxException {
      fcq $$2 = (fcq)$$0.h().a(10.0, 1.0F, false);
      jj $$3 = $$2.b();
      arn $$4 = $$0.e();
      Optional<jj> $$5 = tg.a($$3, 15, $$4);
      if ($$5.isEmpty()) {
         $$5 = tg.a($$3, 200, $$4);
      }

      if ($$5.isEmpty()) {
         throw p.create($$3.u(), $$3.v(), $$3.w());
      } else if ($$4.c_($$5.get()) instanceof dxg $$6) {
         jj $$8 = $$3.b($$5.get());
         String $$9 = $$8.u() + ", " + $$8.v() + ", " + $$8.w();
         String $$10 = $$6.k().getString();
         xj $$11 = wv.a("commands.test.coordinates", $$8.u(), $$8.v(), $$8.w())
            .b(xs.a.a(true).a(n.k).a(new xb.e(wv.c("commands.test.coordinates.copy"))).a(new wt.c("final BlockPos " + $$1 + " = new BlockPos(" + $$9 + ");")));
         $$0.a(() -> wv.a("commands.test.relative_position", $$10, $$11), false);
         agj.a($$4, new jj($$3), $$9, -2147418368, 10000);
         return 1;
      } else {
         throw m.create();
      }
   }

   private static int a() {
      sw.a.a();
      return 1;
   }

   public static int a(ex $$0, st $$1) {
      $$1.a(new th.a($$0));
      tc $$2 = new tc($$1.a());
      $$2.a(new th.b($$0, $$2));
      $$2.a($$0x -> se.a($$0x.w()));
      $$1.b();
      return 1;
   }

   private static int a(ex $$0, js<sp> $$1) {
      return !dxg.a($$0.e(), $$1.a().e(), $$0::a) ? 0 : 1;
   }

   private static boolean a(ex $$0, ald $$1) {
      if ($$0.e().r().b($$1).isEmpty()) {
         $$0.b(wv.a("commands.test.error.structure_not_found", wv.a($$1)));
         return false;
      } else {
         return true;
      }
   }

   private static jj a(ex $$0) {
      jj $$1 = jj.a((kc)$$0.d());
      int $$2 = $$0.e().a(eel.a.b, $$1).v();
      return new jj($$1.u(), $$2, $$1.w() + 3);
   }

   static record a(ex a) implements sk {
      @Override
      public void a(si $$0) {
         this.a.a(() -> wv.a("commands.test.batch.starting", $$0.c().g(), $$0.a()), true);
      }

      @Override
      public void b(si $$0) {
      }
   }

   public static record b(ex a, tc b) implements sr {
      @Override
      public void a(so $$0) {
      }

      @Override
      public void a(so $$0, st $$1) {
         this.c();
      }

      @Override
      public void b(so $$0, st $$1) {
         this.c();
      }

      @Override
      public void a(so $$0, so $$1, st $$2) {
         this.b.a($$1);
      }

      private void c() {
         if (this.b.i()) {
            this.a.a(() -> wv.a("commands.test.summary", this.b.h()).a(n.p), true);
            if (this.b.d()) {
               this.a.b(wv.a("commands.test.summary.failed", this.b.a()));
            } else {
               this.a.a(() -> wv.c("commands.test.summary.all_required_passed").a(n.k), true);
            }

            if (this.b.e()) {
               this.a.a(wv.a("commands.test.summary.optional_failed", this.b.b()));
            }
         }
      }
   }
}
