import com.google.common.collect.Maps;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.io.Reader;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class gjc extends aqm<gjc.a> {
   public static final ghv a = new ghv("minecraft:empty", bjb.a(1.0F), bjb.a(1.0F), 1, ghv.a.a, false, false, 16);
   public static final ahg b = new ahg("minecraft", "intentionally_empty");
   public static final gjd c = new gjd(b, null);
   public static final ghv d = new ghv(b.toString(), bjb.a(1.0F), bjb.a(1.0F), 1, ghv.a.a, false, false, 16);
   static final Logger e = LogUtils.getLogger();
   private static final String f = "sounds.json";
   private static final Gson g = new GsonBuilder().registerTypeHierarchyAdapter(vf.class, new vf.b()).registerTypeAdapter(ghw.class, new ghx()).create();
   private static final TypeToken<Map<String, ghw>> h = new TypeToken<Map<String, ghw>>() {
   };
   private final Map<ahg, gjd> i = Maps.newHashMap();
   private final giz j;
   private final Map<ahg, aqf> k = new HashMap<>();

   public gjc(evk $$0) {
      this.j = new giz(this, $$0, aqk.fromMap(this.k));
   }

   protected gjc.a a(aqh $$0, bgr $$1) {
      gjc.a $$2 = new gjc.a();
      $$1.a();
      $$1.a("list");
      $$2.a($$0);
      $$1.c();

      for (String $$3 : $$0.a()) {
         $$1.a($$3);

         try {
            for (aqf $$5 : $$0.a(new ahg($$3, "sounds.json"))) {
               $$1.a($$5.b());

               try (Reader $$6 = $$5.e()) {
                  $$1.a("parse");
                  Map<String, ghw> $$7 = aud.a(g, $$6, h);
                  $$1.b("register");

                  for (Entry<String, ghw> $$8 : $$7.entrySet()) {
                     $$2.a(new ahg($$3, $$8.getKey()), $$8.getValue());
                  }

                  $$1.c();
               } catch (RuntimeException var15) {
                  e.warn("Invalid {} in resourcepack: '{}'", new Object[]{"sounds.json", $$5.b(), var15});
               }

               $$1.c();
            }
         } catch (IOException var16) {
         }

         $$1.c();
      }

      $$1.b();
      return $$2;
   }

   protected void a(gjc.a $$0, aqh $$1, bgr $$2) {
      $$0.a(this.i, this.k, this.j);
      if (aa.aW) {
         for (ahg $$3 : this.i.keySet()) {
            gjd $$4 = this.i.get($$3);
            if (!vi.b($$4.a()) && kd.b.c($$3)) {
               e.error("Missing subtitle {} for sound event: {}", $$4.a(), $$3);
            }
         }
      }

      if (e.isDebugEnabled()) {
         for (ahg $$5 : this.i.keySet()) {
            if (!kd.b.c($$5)) {
               e.debug("Not having sound event for: {}", $$5);
            }
         }
      }

      this.j.a();
   }

   public List<String> a() {
      return this.j.h();
   }

   static boolean a(ghv $$0, ahg $$1, aqk $$2) {
      ahg $$3 = $$0.b();
      if ($$2.getResource($$3).isEmpty()) {
         e.warn("File {} does not exist, cannot add it to event {}", $$3, $$1);
         return false;
      } else {
         return true;
      }
   }

   @Nullable
   public gjd a(ahg $$0) {
      return this.i.get($$0);
   }

   public Collection<ahg> b() {
      return this.i.keySet();
   }

   public void a(ghz $$0) {
      this.j.a($$0);
   }

   public void a(ghy $$0) {
      this.j.c($$0);
   }

   public void a(ghy $$0, int $$1) {
      this.j.a($$0, $$1);
   }

   public void a(eur $$0) {
      this.j.a($$0);
   }

   public void d() {
      this.j.e();
   }

   public void e() {
      this.j.d();
   }

   public void f() {
      this.j.b();
   }

   public void g() {
      this.j.c();
   }

   public void a(boolean $$0) {
      this.j.a($$0);
   }

   public void h() {
      this.j.f();
   }

   public void a(ars $$0, float $$1) {
      if ($$0 == ars.a && $$1 <= 0.0F) {
         this.e();
      }

      this.j.a($$0, $$1);
   }

   public void b(ghy $$0) {
      this.j.a($$0);
   }

   public boolean c(ghy $$0) {
      return this.j.b($$0);
   }

   public void a(gjb $$0) {
      this.j.a($$0);
   }

   public void b(gjb $$0) {
      this.j.b($$0);
   }

   public void a(@Nullable ahg $$0, @Nullable ars $$1) {
      this.j.a($$0, $$1);
   }

   public String i() {
      return this.j.g();
   }

   public void j() {
      this.j.a();
   }

   protected static class a {
      final Map<ahg, gjd> a = Maps.newHashMap();
      private Map<ahg, aqf> b = Map.of();

      void a(aqh $$0) {
         this.b = ghv.a.a($$0);
      }

      void a(ahg $$0, ghw $$1) {
         gjd $$2 = this.a.get($$0);
         boolean $$3 = $$2 == null;
         if ($$3 || $$1.b()) {
            if (!$$3) {
               gjc.e.debug("Replaced sound event location {}", $$0);
            }

            $$2 = new gjd($$0, $$1.c());
            this.a.put($$0, $$2);
         }

         aqk $$4 = aqk.fromMap(this.b);

         for (final ghv $$5 : $$1.a()) {
            final ahg $$6 = $$5.a();
            gje<ghv> $$8;
            switch ($$5.f()) {
               case a:
                  if (!gjc.a($$5, $$0, $$4)) {
                     continue;
                  }

                  $$8 = $$5;
                  break;
               case b:
                  $$8 = new gje<ghv>() {
                     @Override
                     public int e() {
                        gjd $$0 = a.this.a.get($$6);
                        return $$0 == null ? 0 : $$0.e();
                     }

                     public ghv a(auu $$0) {
                        gjd $$1 = a.this.a.get($$6);
                        if ($$1 == null) {
                           return gjc.a;
                        } else {
                           ghv $$2 = $$1.a($$0);
                           return new ghv(
                              $$2.a().toString(), new bjh($$2.c(), $$5.c()), new bjh($$2.d(), $$5.d()), $$5.e(), ghv.a.a, $$2.g() || $$5.g(), $$2.h(), $$2.i()
                           );
                        }
                     }

                     @Override
                     public void a(giz $$0) {
                        gjd $$1 = a.this.a.get($$6);
                        if ($$1 != null) {
                           $$1.a($$0);
                        }
                     }
                  };
                  break;
               default:
                  throw new IllegalStateException("Unknown SoundEventRegistration type: " + $$5.f());
            }

            $$2.a($$8);
         }
      }

      public void a(Map<ahg, gjd> $$0, Map<ahg, aqf> $$1, giz $$2) {
         $$0.clear();
         $$1.clear();
         $$1.putAll(this.b);

         for (Entry<ahg, gjd> $$3 : this.a.entrySet()) {
            $$0.put($$3.getKey(), $$3.getValue());
            $$3.getValue().a($$2);
         }
      }
   }
}
