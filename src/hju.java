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

public class hju extends auu<hju.a> {
   public static final akv a = akv.b("empty");
   public static final hil b = new hil(a, brk.a(1.0F), brk.a(1.0F), 1, hil.a.a, false, false, 16);
   public static final akv c = akv.b("intentionally_empty");
   public static final hjv d = new hjv(c, null);
   public static final hil e = new hil(c, brk.a(1.0F), brk.a(1.0F), 1, hil.a.a, false, false, 16);
   static final Logger f = LogUtils.getLogger();
   private static final String g = "sounds.json";
   private static final Gson h = new GsonBuilder().registerTypeHierarchyAdapter(wp.class, new wp.b(kf.b)).registerTypeAdapter(him.class, new hin()).create();
   private static final TypeToken<Map<String, him>> i = new TypeToken<Map<String, him>>() {
   };
   private final Map<akv, hjv> j = Maps.newHashMap();
   private final hjr k;
   private final Map<akv, aun> l = new HashMap<>();

   public hju(flm $$0) {
      this.k = new hjr(this, $$0, aus.fromMap(this.l));
   }

   protected hju.a a(aup $$0, bos $$1) {
      hju.a $$2 = new hju.a();

      try (box $$3 = $$1.d("list")) {
         $$2.a($$0);
      }

      for (String $$4 : $$0.a()) {
         try (box $$5 = $$1.d($$4)) {
            for (aun $$7 : $$0.a(akv.a($$4, "sounds.json"))) {
               $$1.a($$7.b());

               try (Reader $$8 = $$7.e()) {
                  $$1.a("parse");
                  Map<String, him> $$9 = ayp.a(h, $$8, i);
                  $$1.b("register");

                  for (Entry<String, him> $$10 : $$9.entrySet()) {
                     $$2.a(akv.a($$4, $$10.getKey()), $$10.getValue());
                  }

                  $$1.c();
               } catch (RuntimeException var19) {
                  f.warn("Invalid {} in resourcepack: '{}'", new Object[]{"sounds.json", $$7.b(), var19});
               }

               $$1.c();
            }
         } catch (IOException var21) {
         }
      }

      return $$2;
   }

   protected void a(hju.a $$0, aup $$1, bos $$2) {
      $$0.a(this.j, this.l, this.k);
      if (ab.aU) {
         for (akv $$3 : this.j.keySet()) {
            hjv $$4 = this.j.get($$3);
            if (!ws.b($$4.a()) && mb.b.d($$3)) {
               f.error("Missing subtitle {} for sound event: {}", $$4.a(), $$3);
            }
         }
      }

      if (f.isDebugEnabled()) {
         for (akv $$5 : this.j.keySet()) {
            if (!mb.b.d($$5)) {
               f.debug("Not having sound event for: {}", $$5);
            }
         }
      }

      this.k.a();
   }

   public List<String> a() {
      return this.k.h();
   }

   public fdi b() {
      return this.k.i();
   }

   static boolean a(hil $$0, akv $$1, aus $$2) {
      akv $$3 = $$0.b();
      if ($$2.getResource($$3).isEmpty()) {
         f.warn("File {} does not exist, cannot add it to event {}", $$3, $$1);
         return false;
      } else {
         return true;
      }
   }

   @Nullable
   public hjv a(akv $$0) {
      return this.j.get($$0);
   }

   public Collection<akv> d() {
      return this.j.keySet();
   }

   public void a(hip $$0) {
      this.k.a($$0);
   }

   public void a(hio $$0) {
      this.k.c($$0);
   }

   public void a(hio $$0, int $$1) {
      this.k.a($$0, $$1);
   }

   public void a(fkq $$0) {
      this.k.a($$0);
   }

   public void e() {
      this.k.e();
   }

   public void f() {
      this.k.d();
   }

   public void g() {
      this.k.b();
   }

   public void h() {
      this.k.c();
   }

   public void a(boolean $$0) {
      this.k.a($$0);
   }

   public void i() {
      this.k.f();
   }

   public void a(awb $$0, float $$1) {
      if ($$0 == awb.a && $$1 <= 0.0F) {
         this.f();
      }

      this.k.a($$0, $$1);
   }

   public void b(hio $$0) {
      this.k.a($$0);
   }

   public void a(hio $$0, float $$1) {
      this.k.a($$0, $$1);
   }

   public boolean c(hio $$0) {
      return this.k.b($$0);
   }

   public void a(hjt $$0) {
      this.k.a($$0);
   }

   public void b(hjt $$0) {
      this.k.b($$0);
   }

   public void a(@Nullable akv $$0, @Nullable awb $$1) {
      this.k.a($$0, $$1);
   }

   public String j() {
      return this.k.g();
   }

   public void k() {
      this.k.a();
   }

   protected static class a {
      final Map<akv, hjv> a = Maps.newHashMap();
      private Map<akv, aun> b = Map.of();

      void a(aup $$0) {
         this.b = hil.a.a($$0);
      }

      void a(akv $$0, him $$1) {
         hjv $$2 = this.a.get($$0);
         boolean $$3 = $$2 == null;
         if ($$3 || $$1.b()) {
            if (!$$3) {
               hju.f.debug("Replaced sound event location {}", $$0);
            }

            $$2 = new hjv($$0, $$1.c());
            this.a.put($$0, $$2);
         }

         aus $$4 = aus.fromMap(this.b);

         for (final hil $$5 : $$1.a()) {
            final akv $$6 = $$5.a();
            hjw<hil> $$8;
            switch ($$5.f()) {
               case a:
                  if (!hju.a($$5, $$0, $$4)) {
                     continue;
                  }

                  $$8 = $$5;
                  break;
               case b:
                  $$8 = new hjw<hil>() {
                     @Override
                     public int e() {
                        hjv $$0 = a.this.a.get($$6);
                        return $$0 == null ? 0 : $$0.e();
                     }

                     public hil a(azh $$0) {
                        hjv $$1 = a.this.a.get($$6);
                        if ($$1 == null) {
                           return hju.b;
                        } else {
                           hil $$2 = $$1.a($$0);
                           return new hil($$2.a(), new brq($$2.c(), $$5.c()), new brq($$2.d(), $$5.d()), $$5.e(), hil.a.a, $$2.g() || $$5.g(), $$2.h(), $$2.i());
                        }
                     }

                     @Override
                     public void a(hjr $$0) {
                        hjv $$1 = a.this.a.get($$6);
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

      public void a(Map<akv, hjv> $$0, Map<akv, aun> $$1, hjr $$2) {
         $$0.clear();
         $$1.clear();
         $$1.putAll(this.b);

         for (Entry<akv, hjv> $$3 : this.a.entrySet()) {
            $$0.put($$3.getKey(), $$3.getValue());
            $$3.getValue().a($$2);
         }
      }
   }
}
