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

public class gcs extends anp<gcs.a> {
   public static final gbl a = new gbl("minecraft:empty", bfp.a(1.0F), bfp.a(1.0F), 1, gbl.a.a, false, false, 16);
   public static final aep b = new aep("minecraft", "intentionally_empty");
   public static final gct c = new gct(b, null);
   public static final gbl d = new gbl(b.toString(), bfp.a(1.0F), bfp.a(1.0F), 1, gbl.a.a, false, false, 16);
   static final Logger e = LogUtils.getLogger();
   private static final String f = "sounds.json";
   private static final Gson g = new GsonBuilder().registerTypeHierarchyAdapter(te.class, new te.a()).registerTypeAdapter(gbm.class, new gbn()).create();
   private static final TypeToken<Map<String, gbm>> h = new TypeToken<Map<String, gbm>>() {
   };
   private final Map<aep, gct> i = Maps.newHashMap();
   private final gcp j;
   private final Map<aep, ani> k = new HashMap<>();

   public gcs(eqr $$0) {
      this.j = new gcp(this, $$0, ann.fromMap(this.k));
   }

   protected gcs.a a(ank $$0, bde $$1) {
      gcs.a $$2 = new gcs.a();
      $$1.a();
      $$1.a("list");
      $$2.a($$0);
      $$1.c();

      for (String $$3 : $$0.a()) {
         $$1.a($$3);

         try {
            for (ani $$5 : $$0.a(new aep($$3, "sounds.json"))) {
               $$1.a($$5.b());

               try (Reader $$6 = $$5.e()) {
                  $$1.a("parse");
                  Map<String, gbm> $$7 = arf.a(g, $$6, h);
                  $$1.b("register");

                  for (Entry<String, gbm> $$8 : $$7.entrySet()) {
                     $$2.a(new aep($$3, $$8.getKey()), $$8.getValue());
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

   protected void a(gcs.a $$0, ank $$1, bde $$2) {
      $$0.a(this.i, this.k, this.j);
      if (aa.aS) {
         for (aep $$3 : this.i.keySet()) {
            gct $$4 = this.i.get($$3);
            if (!tg.b($$4.a()) && jc.c.c($$3)) {
               e.error("Missing subtitle {} for sound event: {}", $$4.a(), $$3);
            }
         }
      }

      if (e.isDebugEnabled()) {
         for (aep $$5 : this.i.keySet()) {
            if (!jc.c.c($$5)) {
               e.debug("Not having sound event for: {}", $$5);
            }
         }
      }

      this.j.a();
   }

   public List<String> a() {
      return this.j.g();
   }

   static boolean a(gbl $$0, aep $$1, ann $$2) {
      aep $$3 = $$0.b();
      if ($$2.getResource($$3).isEmpty()) {
         e.warn("File {} does not exist, cannot add it to event {}", $$3, $$1);
         return false;
      } else {
         return true;
      }
   }

   @Nullable
   public gct a(aep $$0) {
      return this.i.get($$0);
   }

   public Collection<aep> b() {
      return this.i.keySet();
   }

   public void a(gbp $$0) {
      this.j.a($$0);
   }

   public void a(gbo $$0) {
      this.j.c($$0);
   }

   public void a(gbo $$0, int $$1) {
      this.j.a($$0, $$1);
   }

   public void a(epy $$0) {
      this.j.a($$0);
   }

   public void d() {
      this.j.d();
   }

   public void e() {
      this.j.c();
   }

   public void f() {
      this.j.b();
   }

   public void a(boolean $$0) {
      this.j.a($$0);
   }

   public void g() {
      this.j.e();
   }

   public void a(aov $$0, float $$1) {
      if ($$0 == aov.a && $$1 <= 0.0F) {
         this.e();
      }

      this.j.a($$0, $$1);
   }

   public void b(gbo $$0) {
      this.j.a($$0);
   }

   public boolean c(gbo $$0) {
      return this.j.b($$0);
   }

   public void a(gcr $$0) {
      this.j.a($$0);
   }

   public void b(gcr $$0) {
      this.j.b($$0);
   }

   public void a(@Nullable aep $$0, @Nullable aov $$1) {
      this.j.a($$0, $$1);
   }

   public String h() {
      return this.j.f();
   }

   public void i() {
      this.j.a();
   }

   protected static class a {
      final Map<aep, gct> a = Maps.newHashMap();
      private Map<aep, ani> b = Map.of();

      void a(ank $$0) {
         this.b = gbl.a.a($$0);
      }

      void a(aep $$0, gbm $$1) {
         gct $$2 = this.a.get($$0);
         boolean $$3 = $$2 == null;
         if ($$3 || $$1.b()) {
            if (!$$3) {
               gcs.e.debug("Replaced sound event location {}", $$0);
            }

            $$2 = new gct($$0, $$1.c());
            this.a.put($$0, $$2);
         }

         ann $$4 = ann.fromMap(this.b);

         for (final gbl $$5 : $$1.a()) {
            final aep $$6 = $$5.a();
            gcu<gbl> $$8;
            switch ($$5.f()) {
               case a:
                  if (!gcs.a($$5, $$0, $$4)) {
                     continue;
                  }

                  $$8 = $$5;
                  break;
               case b:
                  $$8 = new gcu<gbl>() {
                     @Override
                     public int e() {
                        gct $$0 = a.this.a.get($$6);
                        return $$0 == null ? 0 : $$0.e();
                     }

                     public gbl a(art $$0) {
                        gct $$1 = a.this.a.get($$6);
                        if ($$1 == null) {
                           return gcs.a;
                        } else {
                           gbl $$2 = $$1.a($$0);
                           return new gbl(
                              $$2.a().toString(), new bfv($$2.c(), $$5.c()), new bfv($$2.d(), $$5.d()), $$5.e(), gbl.a.a, $$2.g() || $$5.g(), $$2.h(), $$2.i()
                           );
                        }
                     }

                     @Override
                     public void a(gcp $$0) {
                        gct $$1 = a.this.a.get($$6);
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

      public void a(Map<aep, gct> $$0, Map<aep, ani> $$1, gcp $$2) {
         $$0.clear();
         $$1.clear();
         $$1.putAll(this.b);

         for (Entry<aep, gct> $$3 : this.a.entrySet()) {
            $$0.put($$3.getKey(), $$3.getValue());
            $$3.getValue().a($$2);
         }
      }
   }
}
