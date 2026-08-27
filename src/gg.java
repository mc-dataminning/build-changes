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

public class gg {
   private static final Map<String, gg.b> i = Maps.newHashMap();
   public static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> uv.b("argument.entity.options.unknown", $$0));
   public static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> uv.b("argument.entity.options.inapplicable", $$0));
   public static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(uv.c("argument.entity.options.distance.negative"));
   public static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(uv.c("argument.entity.options.level.negative"));
   public static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(uv.c("argument.entity.options.limit.toosmall"));
   public static final DynamicCommandExceptionType f = new DynamicCommandExceptionType($$0 -> uv.b("argument.entity.options.sort.irreversible", $$0));
   public static final DynamicCommandExceptionType g = new DynamicCommandExceptionType($$0 -> uv.b("argument.entity.options.mode.invalid", $$0));
   public static final DynamicCommandExceptionType h = new DynamicCommandExceptionType($$0 -> uv.b("argument.entity.options.type.invalid", $$0));

   private static void a(String $$0, gg.a $$1, Predicate<gf> $$2, uv $$3) {
      i.put($$0, new gg.b($$1, $$2, $$3));
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
         }, $$0 -> !$$0.v(), uv.c("argument.entity.options.name.description"));
         a("distance", $$0 -> {
            int $$1 = $$0.g().getCursor();
            cl.c $$2 = cl.c.a($$0.g());
            if ((!$$2.a().isPresent() || !($$2.a().get() < 0.0)) && (!$$2.b().isPresent() || !($$2.b().get() < 0.0))) {
               $$0.a($$2);
               $$0.h();
            } else {
               $$0.g().setCursor($$1);
               throw c.createWithContext($$0.g());
            }
         }, $$0 -> $$0.i().c(), uv.c("argument.entity.options.distance.description"));
         a("level", $$0 -> {
            int $$1 = $$0.g().getCursor();
            cl.d $$2 = cl.d.a($$0.g());
            if ((!$$2.a().isPresent() || $$2.a().get() >= 0) && (!$$2.b().isPresent() || $$2.b().get() >= 0)) {
               $$0.a($$2);
               $$0.a(false);
            } else {
               $$0.g().setCursor($$1);
               throw d.createWithContext($$0.g());
            }
         }, $$0 -> $$0.j().c(), uv.c("argument.entity.options.level.description"));
         a("x", $$0 -> {
            $$0.h();
            $$0.a($$0.g().readDouble());
         }, $$0 -> $$0.m() == null, uv.c("argument.entity.options.x.description"));
         a("y", $$0 -> {
            $$0.h();
            $$0.b($$0.g().readDouble());
         }, $$0 -> $$0.n() == null, uv.c("argument.entity.options.y.description"));
         a("z", $$0 -> {
            $$0.h();
            $$0.c($$0.g().readDouble());
         }, $$0 -> $$0.o() == null, uv.c("argument.entity.options.z.description"));
         a("dx", $$0 -> {
            $$0.h();
            $$0.d($$0.g().readDouble());
         }, $$0 -> $$0.p() == null, uv.c("argument.entity.options.dx.description"));
         a("dy", $$0 -> {
            $$0.h();
            $$0.e($$0.g().readDouble());
         }, $$0 -> $$0.q() == null, uv.c("argument.entity.options.dy.description"));
         a("dz", $$0 -> {
            $$0.h();
            $$0.f($$0.g().readDouble());
         }, $$0 -> $$0.r() == null, uv.c("argument.entity.options.dz.description"));
         a("x_rotation", $$0 -> $$0.a(dj.a($$0.g(), true, atq::g)), $$0 -> $$0.k() == dj.a, uv.c("argument.entity.options.x_rotation.description"));
         a("y_rotation", $$0 -> $$0.b(dj.a($$0.g(), true, atq::g)), $$0 -> $$0.l() == dj.a, uv.c("argument.entity.options.y_rotation.description"));
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
         }, $$0 -> !$$0.u() && !$$0.x(), uv.c("argument.entity.options.limit.description"));
         a("sort", $$0 -> {
            int $$1 = $$0.g().getCursor();
            String $$2 = $$0.g().readUnquotedString();
            $$0.a(($$0x, $$1x) -> dy.b(Arrays.asList("nearest", "furthest", "random", "arbitrary"), $$0x));

            $$0.a(switch ($$2) {
               case "nearest" -> gf.k;
               case "furthest" -> gf.l;
               case "random" -> gf.m;
               case "arbitrary" -> ge.b;
               default -> {
                  $$0.g().setCursor($$1);
                  throw f.createWithContext($$0.g(), $$2);
               }
            });
            $$0.e(true);
         }, $$0 -> !$$0.u() && !$$0.y(), uv.c("argument.entity.options.sort.description"));
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

               for (csc $$6 : csc.values()) {
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
               csc $$4 = csc.a($$3, null);
               if ($$4 == null) {
                  $$0.g().setCursor($$1);
                  throw g.createWithContext($$0.g(), $$3);
               } else {
                  $$0.a(false);
                  $$0.a($$2x -> {
                     if (!($$2x instanceof amj)) {
                        return false;
                     } else {
                        csc $$3x = ((amj)$$2x).e.b();
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
         }, $$0 -> !$$0.z(), uv.c("argument.entity.options.gamemode.description"));
         a("team", $$0 -> {
            boolean $$1 = $$0.e();
            String $$2 = $$0.g().readUnquotedString();
            $$0.a($$2x -> {
               if (!($$2x instanceof bll)) {
                  return false;
               } else {
                  ela $$3 = $$2x.cg();
                  String $$4 = $$3 == null ? "" : $$3.b();
                  return $$4.equals($$2) != $$1;
               }
            });
            if ($$1) {
               $$0.i(true);
            } else {
               $$0.h(true);
            }
         }, $$0 -> !$$0.B(), uv.c("argument.entity.options.team.description"));
         a("type", $$0 -> {
            $$0.a(($$1x, $$2x) -> {
               dy.a(kc.h.e(), $$1x, String.valueOf('!'));
               dy.a(kc.h.j().map(arz::b), $$1x, "!#");
               if (!$$0.F()) {
                  dy.a(kc.h.e(), $$1x);
                  dy.a(kc.h.j().map(arz::b), $$1x, String.valueOf('#'));
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
                  arz<bkz<?>> $$3 = arz.a(kd.t, agm.a($$0.g()));
                  $$0.a($$2x -> $$2x.ai().a($$3) != $$2);
               } else {
                  agm $$4 = agm.a($$0.g());
                  bkz<?> $$5 = kc.h.b($$4).orElseThrow(() -> {
                     $$0.g().setCursor($$1);
                     return h.createWithContext($$0.g(), $$4.toString());
                  });
                  if (Objects.equals(bkz.bt, $$5) && !$$2) {
                     $$0.a(false);
                  }

                  $$0.a($$2x -> Objects.equals($$5, $$2x.ai()) != $$2);
                  if (!$$2) {
                     $$0.a($$5);
                  }
               }
            }
         }, $$0 -> !$$0.E(), uv.c("argument.entity.options.type.description"));
         a("tag", $$0 -> {
            boolean $$1 = $$0.e();
            String $$2 = $$0.g().readUnquotedString();
            $$0.a($$2x -> "".equals($$2) ? $$2x.ak().isEmpty() != $$1 : $$2x.ak().contains($$2) != $$1);
         }, $$0 -> true, uv.c("argument.entity.options.tag.description"));
         a("nbt", $$0 -> {
            boolean $$1 = $$0.e();
            sd $$2 = new tb($$0.g()).f();
            $$0.a($$2x -> {
               sd $$3 = $$2x.f(new sd());
               if ($$2x instanceof amj) {
                  clo $$4 = ((amj)$$2x).fT().f();
                  if (!$$4.b()) {
                     $$3.a("SelectedItem", $$4.b(new sd()));
                  }
               }

               return ss.a($$2, $$3, true) != $$1;
            });
         }, $$0 -> true, uv.c("argument.entity.options.nbt.description"));
         a("scores", $$0 -> {
            StringReader $$1 = $$0.g();
            Map<String, cl.d> $$2 = Maps.newHashMap();
            $$1.expect('{');
            $$1.skipWhitespace();

            while ($$1.canRead() && $$1.peek() != '}') {
               $$1.skipWhitespace();
               String $$3 = $$1.readUnquotedString();
               $$1.skipWhitespace();
               $$1.expect('=');
               $$1.skipWhitespace();
               cl.d $$4 = cl.d.a($$1);
               $$2.put($$3, $$4);
               $$1.skipWhitespace();
               if ($$1.canRead() && $$1.peek() == ',') {
                  $$1.skip();
               }
            }

            $$1.expect('}');
            if (!$$2.isEmpty()) {
               $$0.a($$1x -> {
                  eky $$2x = $$1x.cL().aH();
                  String $$3x = $$1x.cy();

                  for (Entry<String, cl.d> $$4x : $$2.entrySet()) {
                     ekv $$5 = $$2x.b($$4x.getKey());
                     if ($$5 == null) {
                        return false;
                     }

                     if (!$$2x.b($$3x, $$5)) {
                        return false;
                     }

                     ekx $$6 = $$2x.c($$3x, $$5);
                     int $$7 = $$6.b();
                     if (!$$4x.getValue().d($$7)) {
                        return false;
                     }
                  }

                  return true;
               });
            }

            $$0.j(true);
         }, $$0 -> !$$0.G(), uv.c("argument.entity.options.scores.description"));
         a("advancements", $$0 -> {
            StringReader $$1 = $$0.g();
            Map<agm, Predicate<ah>> $$2 = Maps.newHashMap();
            $$1.expect('{');
            $$1.skipWhitespace();

            while ($$1.canRead() && $$1.peek() != '}') {
               $$1.skipWhitespace();
               agm $$3 = agm.a($$1);
               $$1.skipWhitespace();
               $$1.expect('=');
               $$1.skipWhitespace();
               if ($$1.canRead() && $$1.peek() == '{') {
                  Map<String, Predicate<an>> $$4 = Maps.newHashMap();
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
                     for (Entry<String, Predicate<an>> $$2x : $$4.entrySet()) {
                        an $$3x = $$1x.c($$2x.getKey());
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
                  if (!($$1x instanceof amj $$2x)) {
                     return false;
                  } else {
                     agu $$4 = $$2x.Q();
                     agy $$5x = $$2x.cL().aB();

                     for (Entry<agm, Predicate<ah>> $$6x : $$2.entrySet()) {
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
         }, $$0 -> !$$0.H(), uv.c("argument.entity.options.advancements.description"));
         a("predicate", $$0 -> {
            boolean $$1 = $$0.e();
            agm $$2 = agm.a($$0.g());
            $$0.a($$2x -> {
               if (!($$2x.dN() instanceof ami)) {
                  return false;
               } else {
                  ami $$3 = (ami)$$2x.dN();
                  eib $$4 = $$3.n().aJ().getElement(efh.a, $$2);
                  if ($$4 == null) {
                     return false;
                  } else {
                     efi $$5 = new efi.a($$3).a(ehn.a, $$2x).a(ehn.f, $$2x.dl()).a(ehm.e);
                     efc $$6 = new efc.a($$5).a(Optional.empty());
                     $$6.b(efc.a($$4));
                     return $$1 ^ $$4.test($$6);
                  }
               }
            });
         }, $$0 -> true, uv.c("argument.entity.options.predicate.description"));
      }
   }

   public static gg.a a(gf $$0, String $$1, int $$2) throws CommandSyntaxException {
      gg.b $$3 = i.get($$1);
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

   public static void a(gf $$0, SuggestionsBuilder $$1) {
      String $$2 = $$1.getRemaining().toLowerCase(Locale.ROOT);

      for (Entry<String, gg.b> $$3 : i.entrySet()) {
         if ($$3.getValue().b.test($$0) && $$3.getKey().toLowerCase(Locale.ROOT).startsWith($$2)) {
            $$1.suggest($$3.getKey() + "=", $$3.getValue().c);
         }
      }
   }

   public interface a {
      void handle(gf var1) throws CommandSyntaxException;
   }

   static record b(gg.a a, Predicate<gf> b, uv c) {
   }
}
