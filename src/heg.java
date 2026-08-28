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

public class heg extends avi<heg.a> {
   public static final alj a = alj.b("empty");
   public static final hcy b = new hcy(a, brl.a(1.0F), brl.a(1.0F), 1, hcy.a.a, false, false, 16);
   public static final alj c = alj.b("intentionally_empty");
   public static final heh d = new heh(c, null);
   public static final hcy e = new hcy(c, brl.a(1.0F), brl.a(1.0F), 1, hcy.a.a, false, false, 16);
   static final Logger f = LogUtils.getLogger();
   private static final String g = "sounds.json";
   private static final Gson h = new GsonBuilder().registerTypeHierarchyAdapter(xj.class, new xj.b(ke.b)).registerTypeAdapter(hcz.class, new hda()).create();
   private static final TypeToken<Map<String, hcz>> i = new TypeToken<Map<String, hcz>>() {
   };
   private final Map<alj, heh> j = Maps.newHashMap();
   private final hed k;
   private final Map<alj, avb> l = new HashMap<>();

   public heg(fki $$0) {
      this.k = new hed(this, $$0, avg.fromMap(this.l));
   }

   protected heg.a a(avd $$0, bou $$1) {
      heg.a $$2 = new heg.a();

      try (boz $$3 = $$1.d("list")) {
         $$2.a($$0);
      }

      for (String $$4 : $$0.a()) {
         try (boz $$5 = $$1.d($$4)) {
            for (avb $$7 : $$0.a(alj.a($$4, "sounds.json"))) {
               $$1.a($$7.b());

               try (Reader $$8 = $$7.e()) {
                  $$1.a("parse");
                  Map<String, hcz> $$9 = azc.a(h, $$8, i);
                  $$1.b("register");

                  for (Entry<String, hcz> $$10 : $$9.entrySet()) {
                     $$2.a(alj.a($$4, $$10.getKey()), $$10.getValue());
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

   protected void a(heg.a $$0, avd $$1, bou $$2) {
      $$0.a(this.j, this.l, this.k);
      if (ab.aU) {
         for (alj $$3 : this.j.keySet()) {
            heh $$4 = this.j.get($$3);
            if (!xm.b($$4.a()) && lz.b.d($$3)) {
               f.error("Missing subtitle {} for sound event: {}", $$4.a(), $$3);
            }
         }
      }

      if (f.isDebugEnabled()) {
         for (alj $$5 : this.j.keySet()) {
            if (!lz.b.d($$5)) {
               f.debug("Not having sound event for: {}", $$5);
            }
         }
      }

      this.k.a();
   }

   public List<String> a() {
      return this.k.h();
   }

   public fcg b() {
      return this.k.i();
   }

   static boolean a(hcy $$0, alj $$1, avg $$2) {
      alj $$3 = $$0.b();
      if ($$2.getResource($$3).isEmpty()) {
         f.warn("File {} does not exist, cannot add it to event {}", $$3, $$1);
         return false;
      } else {
         return true;
      }
   }

   @Nullable
   public heh a(alj $$0) {
      return this.j.get($$0);
   }

   public Collection<alj> d() {
      return this.j.keySet();
   }

   public void a(hdc $$0) {
      this.k.a($$0);
   }

   public void a(hdb $$0) {
      this.k.c($$0);
   }

   public void a(hdb $$0, int $$1) {
      this.k.a($$0, $$1);
   }

   public void a(fjn $$0) {
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

   public void a(awo $$0, float $$1) {
      if ($$0 == awo.a && $$1 <= 0.0F) {
         this.f();
      }

      this.k.a($$0, $$1);
   }

   public void b(hdb $$0) {
      this.k.a($$0);
   }

   public boolean c(hdb $$0) {
      return this.k.b($$0);
   }

   public void a(hef $$0) {
      this.k.a($$0);
   }

   public void b(hef $$0) {
      this.k.b($$0);
   }

   public void a(@Nullable alj $$0, @Nullable awo $$1) {
      this.k.a($$0, $$1);
   }

   public String j() {
      return this.k.g();
   }

   public void k() {
      this.k.a();
   }

   protected static class a {
      final Map<alj, heh> a = Maps.newHashMap();
      private Map<alj, avb> b = Map.of();

      void a(avd $$0) {
         this.b = hcy.a.a($$0);
      }

      void a(alj $$0, hcz $$1) {
         heh $$2 = this.a.get($$0);
         boolean $$3 = $$2 == null;
         if ($$3 || $$1.b()) {
            if (!$$3) {
               heg.f.debug("Replaced sound event location {}", $$0);
            }

            $$2 = new heh($$0, $$1.c());
            this.a.put($$0, $$2);
         }

         avg $$4 = avg.fromMap(this.b);

         for (final hcy $$5 : $$1.a()) {
            final alj $$6 = $$5.a();
            hei<hcy> $$8;
            switch ($$5.f()) {
               case a:
                  if (!heg.a($$5, $$0, $$4)) {
                     continue;
                  }

                  $$8 = $$5;
                  break;
               case b:
                  $$8 = new hei<hcy>() {
                     @Override
                     public int e() {
                        heh $$0 = a.this.a.get($$6);
                        return $$0 == null ? 0 : $$0.e();
                     }

                     public hcy a(azu $$0) {
                        heh $$1 = a.this.a.get($$6);
                        if ($$1 == null) {
                           return heg.b;
                        } else {
                           hcy $$2 = $$1.a($$0);
                           return new hcy($$2.a(), new brr($$2.c(), $$5.c()), new brr($$2.d(), $$5.d()), $$5.e(), hcy.a.a, $$2.g() || $$5.g(), $$2.h(), $$2.i());
                        }
                     }

                     @Override
                     public void a(hed $$0) {
                        heh $$1 = a.this.a.get($$6);
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

      public void a(Map<alj, heh> $$0, Map<alj, avb> $$1, hed $$2) {
         $$0.clear();
         $$1.clear();
         $$1.putAll(this.b);

         for (Entry<alj, heh> $$3 : this.a.entrySet()) {
            $$0.put($$3.getKey(), $$3.getValue());
            $$3.getValue().a($$2);
         }
      }
   }
}
