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

public class hjv extends auu<hjv.a> {
   public static final akv a = akv.b("empty");
   public static final him b = new him(a, brl.a(1.0F), brl.a(1.0F), 1, him.a.a, false, false, 16);
   public static final akv c = akv.b("intentionally_empty");
   public static final hjw d = new hjw(c, null);
   public static final him e = new him(c, brl.a(1.0F), brl.a(1.0F), 1, him.a.a, false, false, 16);
   static final Logger f = LogUtils.getLogger();
   private static final String g = "sounds.json";
   private static final Gson h = new GsonBuilder().registerTypeHierarchyAdapter(wp.class, new wp.b(kf.b)).registerTypeAdapter(hin.class, new hio()).create();
   private static final TypeToken<Map<String, hin>> i = new TypeToken<Map<String, hin>>() {
   };
   private final Map<akv, hjw> j = Maps.newHashMap();
   private final hjs k;
   private final Map<akv, aun> l = new HashMap<>();

   public hjv(fln $$0) {
      this.k = new hjs(this, $$0, aus.fromMap(this.l));
   }

   protected hjv.a a(aup $$0, bot $$1) {
      hjv.a $$2 = new hjv.a();

      try (boy $$3 = $$1.d("list")) {
         $$2.a($$0);
      }

      for (String $$4 : $$0.a()) {
         try (boy $$5 = $$1.d($$4)) {
            for (aun $$7 : $$0.a(akv.a($$4, "sounds.json"))) {
               $$1.a($$7.b());

               try (Reader $$8 = $$7.e()) {
                  $$1.a("parse");
                  Map<String, hin> $$9 = ayp.a(h, $$8, i);
                  $$1.b("register");

                  for (Entry<String, hin> $$10 : $$9.entrySet()) {
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

   protected void a(hjv.a $$0, aup $$1, bot $$2) {
      $$0.a(this.j, this.l, this.k);
      if (ab.aU) {
         for (akv $$3 : this.j.keySet()) {
            hjw $$4 = this.j.get($$3);
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

   public fdj b() {
      return this.k.i();
   }

   static boolean a(him $$0, akv $$1, aus $$2) {
      akv $$3 = $$0.b();
      if ($$2.getResource($$3).isEmpty()) {
         f.warn("File {} does not exist, cannot add it to event {}", $$3, $$1);
         return false;
      } else {
         return true;
      }
   }

   @Nullable
   public hjw a(akv $$0) {
      return this.j.get($$0);
   }

   public Collection<akv> d() {
      return this.j.keySet();
   }

   public void a(hiq $$0) {
      this.k.a($$0);
   }

   public void a(hip $$0) {
      this.k.c($$0);
   }

   public void a(hip $$0, int $$1) {
      this.k.a($$0, $$1);
   }

   public void a(fkr $$0) {
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

   public void b(hip $$0) {
      this.k.a($$0);
   }

   public void a(hip $$0, float $$1) {
      this.k.a($$0, $$1);
   }

   public boolean c(hip $$0) {
      return this.k.b($$0);
   }

   public void a(hju $$0) {
      this.k.a($$0);
   }

   public void b(hju $$0) {
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
      final Map<akv, hjw> a = Maps.newHashMap();
      private Map<akv, aun> b = Map.of();

      void a(aup $$0) {
         this.b = him.a.a($$0);
      }

      void a(akv $$0, hin $$1) {
         hjw $$2 = this.a.get($$0);
         boolean $$3 = $$2 == null;
         if ($$3 || $$1.b()) {
            if (!$$3) {
               hjv.f.debug("Replaced sound event location {}", $$0);
            }

            $$2 = new hjw($$0, $$1.c());
            this.a.put($$0, $$2);
         }

         aus $$4 = aus.fromMap(this.b);

         for (final him $$5 : $$1.a()) {
            final akv $$6 = $$5.a();
            hjx<him> $$8;
            switch ($$5.f()) {
               case a:
                  if (!hjv.a($$5, $$0, $$4)) {
                     continue;
                  }

                  $$8 = $$5;
                  break;
               case b:
                  $$8 = new hjx<him>() {
                     @Override
                     public int e() {
                        hjw $$0 = a.this.a.get($$6);
                        return $$0 == null ? 0 : $$0.e();
                     }

                     public him a(azh $$0) {
                        hjw $$1 = a.this.a.get($$6);
                        if ($$1 == null) {
                           return hjv.b;
                        } else {
                           him $$2 = $$1.a($$0);
                           return new him($$2.a(), new brr($$2.c(), $$5.c()), new brr($$2.d(), $$5.d()), $$5.e(), him.a.a, $$2.g() || $$5.g(), $$2.h(), $$2.i());
                        }
                     }

                     @Override
                     public void a(hjs $$0) {
                        hjw $$1 = a.this.a.get($$6);
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

      public void a(Map<akv, hjw> $$0, Map<akv, aun> $$1, hjs $$2) {
         $$0.clear();
         $$1.clear();
         $$1.putAll(this.b);

         for (Entry<akv, hjw> $$3 : this.a.entrySet()) {
            $$0.put($$3.getKey(), $$3.getValue());
            $$3.getValue().a($$2);
         }
      }
   }
}
