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

public class hbj extends auy<hbj.a> {
   public static final alb a = alb.b("empty");
   public static final hab b = new hab(a, bql.a(1.0F), bql.a(1.0F), 1, hab.a.a, false, false, 16);
   public static final alb c = alb.b("intentionally_empty");
   public static final hbk d = new hbk(c, null);
   public static final hab e = new hab(c, bql.a(1.0F), bql.a(1.0F), 1, hab.a.a, false, false, 16);
   static final Logger f = LogUtils.getLogger();
   private static final String g = "sounds.json";
   private static final Gson h = new GsonBuilder().registerTypeHierarchyAdapter(xd.class, new xd.b(kb.b)).registerTypeAdapter(hac.class, new had()).create();
   private static final TypeToken<Map<String, hac>> i = new TypeToken<Map<String, hac>>() {
   };
   private final Map<alb, hbk> j = Maps.newHashMap();
   private final hbg k;
   private final Map<alb, auq> l = new HashMap<>();

   public hbj(fif $$0) {
      this.k = new hbg(this, $$0, auv.fromMap(this.l));
   }

   protected hbj.a a(aus $$0, bny $$1) {
      hbj.a $$2 = new hbj.a();
      $$1.a();
      $$1.a("list");
      $$2.a($$0);
      $$1.c();

      for (String $$3 : $$0.a()) {
         $$1.a($$3);

         try {
            for (auq $$5 : $$0.a(alb.a($$3, "sounds.json"))) {
               $$1.a($$5.b());

               try (Reader $$6 = $$5.e()) {
                  $$1.a("parse");
                  Map<String, hac> $$7 = ays.a(h, $$6, i);
                  $$1.b("register");

                  for (Entry<String, hac> $$8 : $$7.entrySet()) {
                     $$2.a(alb.a($$3, $$8.getKey()), $$8.getValue());
                  }

                  $$1.c();
               } catch (RuntimeException var15) {
                  f.warn("Invalid {} in resourcepack: '{}'", new Object[]{"sounds.json", $$5.b(), var15});
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

   protected void a(hbj.a $$0, aus $$1, bny $$2) {
      $$0.a(this.j, this.l, this.k);
      if (ab.aW) {
         for (alb $$3 : this.j.keySet()) {
            hbk $$4 = this.j.get($$3);
            if (!xg.b($$4.a()) && lu.b.d($$3)) {
               f.error("Missing subtitle {} for sound event: {}", $$4.a(), $$3);
            }
         }
      }

      if (f.isDebugEnabled()) {
         for (alb $$5 : this.j.keySet()) {
            if (!lu.b.d($$5)) {
               f.debug("Not having sound event for: {}", $$5);
            }
         }
      }

      this.k.a();
   }

   public List<String> a() {
      return this.k.h();
   }

   public faj b() {
      return this.k.i();
   }

   static boolean a(hab $$0, alb $$1, auv $$2) {
      alb $$3 = $$0.b();
      if ($$2.getResource($$3).isEmpty()) {
         f.warn("File {} does not exist, cannot add it to event {}", $$3, $$1);
         return false;
      } else {
         return true;
      }
   }

   @Nullable
   public hbk a(alb $$0) {
      return this.j.get($$0);
   }

   public Collection<alb> d() {
      return this.j.keySet();
   }

   public void a(haf $$0) {
      this.k.a($$0);
   }

   public void a(hae $$0) {
      this.k.c($$0);
   }

   public void a(hae $$0, int $$1) {
      this.k.a($$0, $$1);
   }

   public void a(fhk $$0) {
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

   public void a(awe $$0, float $$1) {
      if ($$0 == awe.a && $$1 <= 0.0F) {
         this.f();
      }

      this.k.a($$0, $$1);
   }

   public void b(hae $$0) {
      this.k.a($$0);
   }

   public boolean c(hae $$0) {
      return this.k.b($$0);
   }

   public void a(hbi $$0) {
      this.k.a($$0);
   }

   public void b(hbi $$0) {
      this.k.b($$0);
   }

   public void a(@Nullable alb $$0, @Nullable awe $$1) {
      this.k.a($$0, $$1);
   }

   public String j() {
      return this.k.g();
   }

   public void k() {
      this.k.a();
   }

   protected static class a {
      final Map<alb, hbk> a = Maps.newHashMap();
      private Map<alb, auq> b = Map.of();

      void a(aus $$0) {
         this.b = hab.a.a($$0);
      }

      void a(alb $$0, hac $$1) {
         hbk $$2 = this.a.get($$0);
         boolean $$3 = $$2 == null;
         if ($$3 || $$1.b()) {
            if (!$$3) {
               hbj.f.debug("Replaced sound event location {}", $$0);
            }

            $$2 = new hbk($$0, $$1.c());
            this.a.put($$0, $$2);
         }

         auv $$4 = auv.fromMap(this.b);

         for (final hab $$5 : $$1.a()) {
            final alb $$6 = $$5.a();
            hbl<hab> $$8;
            switch ($$5.f()) {
               case a:
                  if (!hbj.a($$5, $$0, $$4)) {
                     continue;
                  }

                  $$8 = $$5;
                  break;
               case b:
                  $$8 = new hbl<hab>() {
                     @Override
                     public int e() {
                        hbk $$0 = a.this.a.get($$6);
                        return $$0 == null ? 0 : $$0.e();
                     }

                     public hab a(azk $$0) {
                        hbk $$1 = a.this.a.get($$6);
                        if ($$1 == null) {
                           return hbj.b;
                        } else {
                           hab $$2 = $$1.a($$0);
                           return new hab($$2.a(), new bqr($$2.c(), $$5.c()), new bqr($$2.d(), $$5.d()), $$5.e(), hab.a.a, $$2.g() || $$5.g(), $$2.h(), $$2.i());
                        }
                     }

                     @Override
                     public void a(hbg $$0) {
                        hbk $$1 = a.this.a.get($$6);
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

      public void a(Map<alb, hbk> $$0, Map<alb, auq> $$1, hbg $$2) {
         $$0.clear();
         $$1.clear();
         $$1.putAll(this.b);

         for (Entry<alb, hbk> $$3 : this.a.entrySet()) {
            $$0.put($$3.getKey(), $$3.getValue());
            $$3.getValue().a($$2);
         }
      }
   }
}
