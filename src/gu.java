import com.google.common.collect.Maps;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.function.Predicate;

public class gu {
   private static final Map<String, gu.b> i = Maps.newHashMap();
   public static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> wu.b("argument.entity.options.unknown", $$0));
   public static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> wu.b("argument.entity.options.inapplicable", $$0));
   public static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(wu.c("argument.entity.options.distance.negative"));
   public static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(wu.c("argument.entity.options.level.negative"));
   public static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(wu.c("argument.entity.options.limit.toosmall"));
   public static final DynamicCommandExceptionType f = new DynamicCommandExceptionType($$0 -> wu.b("argument.entity.options.sort.irreversible", $$0));
   public static final DynamicCommandExceptionType g = new DynamicCommandExceptionType($$0 -> wu.b("argument.entity.options.mode.invalid", $$0));
   public static final DynamicCommandExceptionType h = new DynamicCommandExceptionType($$0 -> wu.b("argument.entity.options.type.invalid", $$0));

   private static void a(String $$0, gu.a $$1, Predicate<gt> $$2, wu $$3) {
      i.put($$0, new gu.b($$1, $$2, $$3));
   }

   public static void a() {
      if (i.isEmpty()) {
         a("name", $$0 -> {
            int $$1 = $$0.g().getCursor();
            boolean $$2 = $$0.e();
            String $$3 = $$0.g().readString();
            if ($$0.w() && !$$2) {
               $$0.g().setCursor($$1);
               throw b.createWithContext($$0.g(), "name");
            } else {
               if ($$2) {
                  $$0.c(true);
               } else {
                  $$0.b(true);
               }

               $$0.a($$2x -> $$2x.ad().getString().equals($$3) != $$2);
            }
         }, $$0 -> !$$0.v(), wu.c("argument.entity.options.name.description"));
         a("distance", $$0 -> {
            int $$1 = $$0.g().getCursor();
            ct.c $$2 = ct.c.a($$0.g());
            if ((!$$2.a().isPresent() || !($$2.a().get() < 0.0)) && (!$$2.b().isPresent() || !($$2.b().get() < 0.0))) {
               $$0.a($$2);
               $$0.h();
            } else {
               $$0.g().setCursor($$1);
               throw c.createWithContext($$0.g());
            }
         }, $$0 -> $$0.i().c(), wu.c("argument.entity.options.distance.description"));
         a("level", $$0 -> {
            int $$1 = $$0.g().getCursor();
            ct.d $$2 = ct.d.a($$0.g());
            if ((!$$2.a().isPresent() || $$2.a().get() >= 0) && (!$$2.b().isPresent() || $$2.b().get() >= 0)) {
               $$0.a($$2);
               $$0.a(false);
            } else {
               $$0.g().setCursor($$1);
               throw d.createWithContext($$0.g());
            }
         }, $$0 -> $$0.j().c(), wu.c("argument.entity.options.level.description"));
         a("x", $$0 -> {
            $$0.h();
            $$0.a($$0.g().readDouble());
         }, $$0 -> $$0.m() == null, wu.c("argument.entity.options.x.description"));
         a("y", $$0 -> {
            $$0.h();
            $$0.b($$0.g().readDouble());
         }, $$0 -> $$0.n() == null, wu.c("argument.entity.options.y.description"));
         a("z", $$0 -> {
            $$0.h();
            $$0.c($$0.g().readDouble());
         }, $$0 -> $$0.o() == null, wu.c("argument.entity.options.z.description"));
         a("dx", $$0 -> {
            $$0.h();
            $$0.d($$0.g().readDouble());
         }, $$0 -> $$0.p() == null, wu.c("argument.entity.options.dx.description"));
         a("dy", $$0 -> {
            $$0.h();
            $$0.e($$0.g().readDouble());
         }, $$0 -> $$0.q() == null, wu.c("argument.entity.options.dy.description"));
         a("dz", $$0 -> {
            $$0.h();
            $$0.f($$0.g().readDouble());
         }, $$0 -> $$0.r() == null, wu.c("argument.entity.options.dz.description"));
         a("x_rotation", $$0 -> $$0.a(du.a($$0.g(), true, axz::g)), $$0 -> $$0.k() == du.a, wu.c("argument.entity.options.x_rotation.description"));
         a("y_rotation", $$0 -> $$0.b(du.a($$0.g(), true, axz::g)), $$0 -> $$0.l() == du.a, wu.c("argument.entity.options.y_rotation.description"));
         a("limit", $$0 -> {
            int $$1 = $$0.g().getCursor();
            int $$2 = $$0.g().readInt();
            if ($$2 < 1) {
               $$0.g().setCursor($$1);
               throw e.createWithContext($$0.g());
            } else {
               $$0.a($$2);
               $$0.d(true);
            }
         }, $$0 -> !$$0.u() && !$$0.x(), wu.c("argument.entity.options.limit.description"));
         a("sort", $$0 -> {
            int $$1 = $$0.g().getCursor();
            String $$2 = $$0.g().readUnquotedString();
            $$0.a(($$0x, $$1x) -> ei.b(Arrays.asList("nearest", "furthest", "random", "arbitrary"), $$0x));

            $$0.a(switch ($$2) {
               case "nearest" -> gt.k;
               case "furthest" -> gt.l;
               case "random" -> gt.m;
               case "arbitrary" -> gs.b;
               default -> {
                  $$0.g().setCursor($$1);
                  throw f.createWithContext($$0.g(), $$2);
               }
            });
            $$0.e(true);
         }, $$0 -> !$$0.u() && !$$0.y(), wu.c("argument.entity.options.sort.description"));
         a("gamemode", $$0 -> {
            $$0.a(($$1x, $$2x) -> {
               String $$3x = $$1x.getRemaining().toLowerCase(Locale.ROOT);
               boolean $$4x = !$$0.A();
               boolean $$5 = true;
               if (!$$3x.isEmpty()) {
                  if ($$3x.charAt(0) == '!') {
                     $$4x = false;
                     $$3x = $$3x.substring(1);
                  } else {
                     $$5 = false;
                  }
               }

               for (daa $$6 : daa.values()) {
                  if ($$6.b().toLowerCase(Locale.ROOT).startsWith($$3x)) {
                     if ($$5) {
                        $$1x.suggest("!" + $$6.b());
                     }

                     if ($$4x) {
                        $$1x.suggest($$6.b());
                     }
                  }
               }

               return $$1x.buildFuture();
            });
            int $$1 = $$0.g().getCursor();
            boolean $$2 = $$0.e();
            if ($$0.A() && !$$2) {
               $$0.g().setCursor($$1);
               throw b.createWithContext($$0.g(), "gamemode");
            } else {
               String $$3 = $$0.g().readUnquotedString();
               daa $$4 = daa.a($$3, null);
               if ($$4 == null) {
                  $$0.g().setCursor($$1);
                  throw g.createWithContext($$0.g(), $$3);
               } else {
                  $$0.a(false);
                  $$0.a($$2x -> {
                     if (!($$2x instanceof aqi)) {
                        return false;
                     } else {
                        daa $$3x = ((aqi)$$2x).f.b();
                        return $$2 ? $$3x != $$4 : $$3x == $$4;
                     }
                  });
                  if ($$2) {
                     $$0.g(true);
                  } else {
                     $$0.f(true);
                  }
               }
            }
         }, $$0 -> !$$0.z(), wu.c("argument.entity.options.gamemode.description"));
         a("team", $$0 -> {
            boolean $$1 = $$0.e();
            String $$2 = $$0.g().readUnquotedString();
            $$0.a($$2x -> {
               if (!($$2x instanceof bsa)) {
                  return false;
               } else {
                  euv $$3 = $$2x.ch();
                  String $$4 = $$3 == null ? "" : $$3.b();
                  return $$4.equals($$2) != $$1;
               }
            });
            if ($$1) {
               $$0.i(true);
            } else {
               $$0.h(true);
            }
         }, $$0 -> !$$0.B(), wu.c("argument.entity.options.team.description"));
         a("type", $$0 -> {
            $$0.a(($$1x, $$2x) -> {
               ei.a(ld.g.e(), $$1x, String.valueOf('!'));
               ei.a(ld.g.j().map(awg::b), $$1x, "!#");
               if (!$$0.F()) {
                  ei.a(ld.g.e(), $$1x);
                  ei.a(ld.g.j().map(awg::b), $$1x, String.valueOf('#'));
               }

               return $$1x.buildFuture();
            });
            int $$1 = $$0.g().getCursor();
            boolean $$2 = $$0.e();
            if ($$0.F() && !$$2) {
               $$0.g().setCursor($$1);
               throw b.createWithContext($$0.g(), "type");
            } else {
               if ($$2) {
                  $$0.D();
               }

               if ($$0.f()) {
                  awg<brn<?>> $$3 = awg.a(le.v, akh.a($$0.g()));
                  $$0.a($$2x -> $$2x.ai().a($$3) != $$2);
               } else {
                  akh $$4 = akh.a($$0.g());
                  brn<?> $$5 = ld.g.b($$4).orElseThrow(() -> {
                     $$0.g().setCursor($$1);
                     return h.createWithContext($$0.g(), $$4.toString());
                  });
                  if (Objects.equals(brn.bx, $$5) && !$$2) {
                     $$0.a(false);
                  }

                  $$0.a($$2x -> Objects.equals($$5, $$2x.ai()) != $$2);
                  if (!$$2) {
                     $$0.a($$5);
                  }
               }
            }
         }, $$0 -> !$$0.E(), wu.c("argument.entity.options.type.description"));
         a("tag", $$0 -> {
            boolean $$1 = $$0.e();
            String $$2 = $$0.g().readUnquotedString();
            $$0.a($$2x -> "".equals($$2) ? $$2x.ak().isEmpty() != $$1 : $$2x.ak().contains($$2) != $$1);
         }, $$0 -> true, wu.c("argument.entity.options.tag.description"));
         a("nbt", $$0 -> {
            boolean $$1 = $$0.e();
            ua $$2 = new uy($$0.g()).f();
            $$0.a($$2x -> {
               ua $$3 = $$2x.f(new ua());
               if ($$2x instanceof aqi $$4) {
                  csz $$5 = $$4.ga().f();
                  if (!$$5.d()) {
                     $$3.a("SelectedItem", $$5.a($$4.dP()));
                  }
               }

               return up.a($$2, $$3, true) != $$1;
            });
         }, $$0 -> true, wu.c("argument.entity.options.nbt.description"));
         a("scores", $$0 -> {
            StringReader $$1 = $$0.g();
            Map<String, ct.d> $$2 = Maps.newHashMap();
            $$1.expect('{');
            $$1.skipWhitespace();

            while ($$1.canRead() && $$1.peek() != '}') {
               $$1.skipWhitespace();
               String $$3 = $$1.readUnquotedString();
               $$1.skipWhitespace();
               $$1.expect('=');
               $$1.skipWhitespace();
               ct.d $$4 = ct.d.a($$1);
               $$2.put($$3, $$4);
               $$1.skipWhitespace();
               if ($$1.canRead() && $$1.peek() == ',') {
                  $$1.skip();
               }
            }

            $$1.expect('}');
            if (!$$2.isEmpty()) {
               $$0.a($$1x -> {
                  eut $$2x = $$1x.cM().aK();

                  for (Entry<String, ct.d> $$3x : $$2.entrySet()) {
                     eul $$4x = $$2x.a($$3x.getKey());
                     if ($$4x == null) {
                        return false;
                     }

                     eup $$5 = $$2x.d($$1x, $$4x);
                     if ($$5 == null) {
                        return false;
                     }

                     if (!$$3x.getValue().d($$5.a())) {
                        return false;
                     }
                  }

                  return true;
               });
            }

            $$0.j(true);
         }, $$0 -> !$$0.G(), wu.c("argument.entity.options.scores.description"));
         a("advancements", $$0 -> {
            StringReader $$1 = $$0.g();
            Map<akh, Predicate<ah>> $$2 = Maps.newHashMap();
            $$1.expect('{');
            $$1.skipWhitespace();

            while ($$1.canRead() && $$1.peek() != '}') {
               $$1.skipWhitespace();
               akh $$3 = akh.a($$1);
               $$1.skipWhitespace();
               $$1.expect('=');
               $$1.skipWhitespace();
               if ($$1.canRead() && $$1.peek() == '{') {
                  Map<String, Predicate<ao>> $$4 = Maps.newHashMap();
                  $$1.skipWhitespace();
                  $$1.expect('{');
                  $$1.skipWhitespace();

                  while ($$1.canRead() && $$1.peek() != '}') {
                     $$1.skipWhitespace();
                     String $$5 = $$1.readUnquotedString();
                     $$1.skipWhitespace();
                     $$1.expect('=');
                     $$1.skipWhitespace();
                     boolean $$6 = $$1.readBoolean();
                     $$4.put($$5, $$1x -> $$1x.a() == $$6);
                     $$1.skipWhitespace();
                     if ($$1.canRead() && $$1.peek() == ',') {
                        $$1.skip();
                     }
                  }

                  $$1.skipWhitespace();
                  $$1.expect('}');
                  $$1.skipWhitespace();
                  $$2.put($$3, $$1x -> {
                     for (Entry<String, Predicate<ao>> $$2x : $$4.entrySet()) {
                        ao $$3x = $$1x.c($$2x.getKey());
                        if ($$3x == null || !$$2x.getValue().test($$3x)) {
                           return false;
                        }
                     }

                     return true;
                  });
               } else {
                  boolean $$7 = $$1.readBoolean();
                  $$2.put($$3, $$1x -> $$1x.a() == $$7);
               }

               $$1.skipWhitespace();
               if ($$1.canRead() && $$1.peek() == ',') {
                  $$1.skip();
               }
            }

            $$1.expect('}');
            if (!$$2.isEmpty()) {
               $$0.a($$1x -> {
                  if (!($$1x instanceof aqi $$2x)) {
                     return false;
                  } else {
                     akp $$4 = $$2x.Q();
                     aku $$5x = $$2x.cM().aE();

                     for (Entry<akh, Predicate<ah>> $$6x : $$2.entrySet()) {
                        af $$7x = $$5x.a($$6x.getKey());
                        if ($$7x == null || !$$6x.getValue().test($$4.b($$7x))) {
                           return false;
                        }
                     }

                     return true;
                  }
               });
               $$0.a(false);
            }

            $$0.k(true);
         }, $$0 -> !$$0.H(), wu.c("argument.entity.options.advancements.description"));
         a("predicate", $$0 -> {
            boolean $$1 = $$0.e();
            akg<erq> $$2 = akg.a(le.aW, akh.a($$0.g()));
            $$0.a($$2x -> {
               if (!($$2x.dN() instanceof aqh)) {
                  return false;
               } else {
                  aqh $$3 = (aqh)$$2x.dN();
                  Optional<erq> $$4 = $$3.o().be().b().a(le.aW, $$2).map(iw::a);
                  if ($$4.isEmpty()) {
                     return false;
                  } else {
                     eoo $$5 = new eoo.a($$3).a(erc.a, $$2x).a(erc.f, $$2x.dl()).a(erb.e);
                     eol $$6 = new eol.a($$5).a(Optional.empty());
                     $$6.b(eol.a($$4.get()));
                     return $$1 ^ $$4.get().test($$6);
                  }
               }
            });
         }, $$0 -> true, wu.c("argument.entity.options.predicate.description"));
      }
   }

   public static gu.a a(gt $$0, String $$1, int $$2) throws CommandSyntaxException {
      gu.b $$3 = i.get($$1);
      if ($$3 != null) {
         if ($$3.b.test($$0)) {
            return $$3.a;
         } else {
            throw b.createWithContext($$0.g(), $$1);
         }
      } else {
         $$0.g().setCursor($$2);
         throw a.createWithContext($$0.g(), $$1);
      }
   }

   public static void a(gt $$0, SuggestionsBuilder $$1) {
      String $$2 = $$1.getRemaining().toLowerCase(Locale.ROOT);

      for (Entry<String, gu.b> $$3 : i.entrySet()) {
         if ($$3.getValue().b.test($$0) && $$3.getKey().toLowerCase(Locale.ROOT).startsWith($$2)) {
            $$1.suggest($$3.getKey() + "=", $$3.getValue().c);
         }
      }
   }

   public interface a {
      void handle(gt var1) throws CommandSyntaxException;
   }

   static record b(gu.a a, Predicate<gt> b, wu c) {
   }
}
