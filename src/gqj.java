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

public class gqj extends atj<gqj.a> {
   public static final gpc a = new gpc("minecraft:empty", bng.a(1.0F), bng.a(1.0F), 1, gpc.a.a, false, false, 16);
   public static final ajv b = new ajv("minecraft", "intentionally_empty");
   public static final gqk c = new gqk(b, null);
   public static final gpc d = new gpc(b.toString(), bng.a(1.0F), bng.a(1.0F), 1, gpc.a.a, false, false, 16);
   static final Logger e = LogUtils.getLogger();
   private static final String f = "sounds.json";
   private static final Gson g = new GsonBuilder().registerTypeHierarchyAdapter(wi.class, new wi.b(jb.b)).registerTypeAdapter(gpd.class, new gpe()).create();
   private static final TypeToken<Map<String, gpd>> h = new TypeToken<Map<String, gpd>>() {
   };
   private final Map<ajv, gqk> i = Maps.newHashMap();
   private final gqg j;
   private final Map<ajv, atc> k = new HashMap<>();

   public gqj(fcc $$0) {
      this.j = new gqg(this, $$0, ath.fromMap(this.k));
   }

   protected gqj.a a(ate $$0, bkt $$1) {
      gqj.a $$2 = new gqj.a();
      $$1.a();
      $$1.a("list");
      $$2.a($$0);
      $$1.c();

      for (String $$3 : $$0.a()) {
         $$1.a($$3);

         try {
            for (atc $$5 : $$0.a(new ajv($$3, "sounds.json"))) {
               $$1.a($$5.b());

               try (Reader $$6 = $$5.e()) {
                  $$1.a("parse");
                  Map<String, gpd> $$7 = axc.a(g, $$6, h);
                  $$1.b("register");

                  for (Entry<String, gpd> $$8 : $$7.entrySet()) {
                     $$2.a(new ajv($$3, $$8.getKey()), $$8.getValue());
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

   protected void a(gqj.a $$0, ate $$1, bkt $$2) {
      $$0.a(this.i, this.k, this.j);
      if (aa.aW) {
         for (ajv $$3 : this.i.keySet()) {
            gqk $$4 = this.i.get($$3);
            if (!wl.b($$4.a()) && kt.b.d($$3)) {
               e.error("Missing subtitle {} for sound event: {}", $$4.a(), $$3);
            }
         }
      }

      if (e.isDebugEnabled()) {
         for (ajv $$5 : this.i.keySet()) {
            if (!kt.b.d($$5)) {
               e.debug("Not having sound event for: {}", $$5);
            }
         }
      }

      this.j.a();
   }

   public List<String> a() {
      return this.j.h();
   }

   public euo b() {
      return this.j.i();
   }

   static boolean a(gpc $$0, ajv $$1, ath $$2) {
      ajv $$3 = $$0.b();
      if ($$2.getResource($$3).isEmpty()) {
         e.warn("File {} does not exist, cannot add it to event {}", $$3, $$1);
         return false;
      } else {
         return true;
      }
   }

   @Nullable
   public gqk a(ajv $$0) {
      return this.i.get($$0);
   }

   public Collection<ajv> d() {
      return this.i.keySet();
   }

   public void a(gpg $$0) {
      this.j.a($$0);
   }

   public void a(gpf $$0) {
      this.j.c($$0);
   }

   public void a(gpf $$0, int $$1) {
      this.j.a($$0, $$1);
   }

   public void a(fbj $$0) {
      this.j.a($$0);
   }

   public void e() {
      this.j.e();
   }

   public void f() {
      this.j.d();
   }

   public void g() {
      this.j.b();
   }

   public void h() {
      this.j.c();
   }

   public void a(boolean $$0) {
      this.j.a($$0);
   }

   public void i() {
      this.j.f();
   }

   public void a(aup $$0, float $$1) {
      if ($$0 == aup.a && $$1 <= 0.0F) {
         this.f();
      }

      this.j.a($$0, $$1);
   }

   public void b(gpf $$0) {
      this.j.a($$0);
   }

   public boolean c(gpf $$0) {
      return this.j.b($$0);
   }

   public void a(gqi $$0) {
      this.j.a($$0);
   }

   public void b(gqi $$0) {
      this.j.b($$0);
   }

   public void a(@Nullable ajv $$0, @Nullable aup $$1) {
      this.j.a($$0, $$1);
   }

   public String j() {
      return this.j.g();
   }

   public void k() {
      this.j.a();
   }

   protected static class a {
      final Map<ajv, gqk> a = Maps.newHashMap();
      private Map<ajv, atc> b = Map.of();

      void a(ate $$0) {
         this.b = gpc.a.a($$0);
      }

      void a(ajv $$0, gpd $$1) {
         gqk $$2 = this.a.get($$0);
         boolean $$3 = $$2 == null;
         if ($$3 || $$1.b()) {
            if (!$$3) {
               gqj.e.debug("Replaced sound event location {}", $$0);
            }

            $$2 = new gqk($$0, $$1.c());
            this.a.put($$0, $$2);
         }

         ath $$4 = ath.fromMap(this.b);

         for (final gpc $$5 : $$1.a()) {
            final ajv $$6 = $$5.a();
            gql<gpc> $$8;
            switch ($$5.f()) {
               case a:
                  if (!gqj.a($$5, $$0, $$4)) {
                     continue;
                  }

                  $$8 = $$5;
                  break;
               case b:
                  $$8 = new gql<gpc>() {
                     @Override
                     public int e() {
                        gqk $$0 = a.this.a.get($$6);
                        return $$0 == null ? 0 : $$0.e();
                     }

                     public gpc a(axt $$0) {
                        gqk $$1 = a.this.a.get($$6);
                        if ($$1 == null) {
                           return gqj.a;
                        } else {
                           gpc $$2 = $$1.a($$0);
                           return new gpc(
                              $$2.a().toString(), new bnm($$2.c(), $$5.c()), new bnm($$2.d(), $$5.d()), $$5.e(), gpc.a.a, $$2.g() || $$5.g(), $$2.h(), $$2.i()
                           );
                        }
                     }

                     @Override
                     public void a(gqg $$0) {
                        gqk $$1 = a.this.a.get($$6);
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

      public void a(Map<ajv, gqk> $$0, Map<ajv, atc> $$1, gqg $$2) {
         $$0.clear();
         $$1.clear();
         $$1.putAll(this.b);

         for (Entry<ajv, gqk> $$3 : this.a.entrySet()) {
            $$0.put($$3.getKey(), $$3.getValue());
            $$3.getValue().a($$2);
         }
      }
   }
}
