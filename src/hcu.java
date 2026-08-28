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

public class hcu extends avf<hcu.a> {
   public static final alh a = alh.b("empty");
   public static final hbm b = new hbm(a, bqz.a(1.0F), bqz.a(1.0F), 1, hbm.a.a, false, false, 16);
   public static final alh c = alh.b("intentionally_empty");
   public static final hcv d = new hcv(c, null);
   public static final hbm e = new hbm(c, bqz.a(1.0F), bqz.a(1.0F), 1, hbm.a.a, false, false, 16);
   static final Logger f = LogUtils.getLogger();
   private static final String g = "sounds.json";
   private static final Gson h = new GsonBuilder().registerTypeHierarchyAdapter(xh.class, new xh.b(kd.b)).registerTypeAdapter(hbn.class, new hbo()).create();
   private static final TypeToken<Map<String, hbn>> i = new TypeToken<Map<String, hbn>>() {
   };
   private final Map<alh, hcv> j = Maps.newHashMap();
   private final hcr k;
   private final Map<alh, auy> l = new HashMap<>();

   public hcu(fje $$0) {
      this.k = new hcr(this, $$0, avd.fromMap(this.l));
   }

   protected hcu.a a(ava $$0, bok $$1) {
      hcu.a $$2 = new hcu.a();
      $$1.a();
      $$1.a("list");
      $$2.a($$0);
      $$1.c();

      for (String $$3 : $$0.a()) {
         $$1.a($$3);

         try {
            for (auy $$5 : $$0.a(alh.a($$3, "sounds.json"))) {
               $$1.a($$5.b());

               try (Reader $$6 = $$5.e()) {
                  $$1.a("parse");
                  Map<String, hbn> $$7 = ayz.a(h, $$6, i);
                  $$1.b("register");

                  for (Entry<String, hbn> $$8 : $$7.entrySet()) {
                     $$2.a(alh.a($$3, $$8.getKey()), $$8.getValue());
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

   protected void a(hcu.a $$0, ava $$1, bok $$2) {
      $$0.a(this.j, this.l, this.k);
      if (ab.aW) {
         for (alh $$3 : this.j.keySet()) {
            hcv $$4 = this.j.get($$3);
            if (!xk.b($$4.a()) && lx.b.d($$3)) {
               f.error("Missing subtitle {} for sound event: {}", $$4.a(), $$3);
            }
         }
      }

      if (f.isDebugEnabled()) {
         for (alh $$5 : this.j.keySet()) {
            if (!lx.b.d($$5)) {
               f.debug("Not having sound event for: {}", $$5);
            }
         }
      }

      this.k.a();
   }

   public List<String> a() {
      return this.k.h();
   }

   public fbn b() {
      return this.k.i();
   }

   static boolean a(hbm $$0, alh $$1, avd $$2) {
      alh $$3 = $$0.b();
      if ($$2.getResource($$3).isEmpty()) {
         f.warn("File {} does not exist, cannot add it to event {}", $$3, $$1);
         return false;
      } else {
         return true;
      }
   }

   @Nullable
   public hcv a(alh $$0) {
      return this.j.get($$0);
   }

   public Collection<alh> d() {
      return this.j.keySet();
   }

   public void a(hbq $$0) {
      this.k.a($$0);
   }

   public void a(hbp $$0) {
      this.k.c($$0);
   }

   public void a(hbp $$0, int $$1) {
      this.k.a($$0, $$1);
   }

   public void a(fij $$0) {
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

   public void a(awl $$0, float $$1) {
      if ($$0 == awl.a && $$1 <= 0.0F) {
         this.f();
      }

      this.k.a($$0, $$1);
   }

   public void b(hbp $$0) {
      this.k.a($$0);
   }

   public boolean c(hbp $$0) {
      return this.k.b($$0);
   }

   public void a(hct $$0) {
      this.k.a($$0);
   }

   public void b(hct $$0) {
      this.k.b($$0);
   }

   public void a(@Nullable alh $$0, @Nullable awl $$1) {
      this.k.a($$0, $$1);
   }

   public String j() {
      return this.k.g();
   }

   public void k() {
      this.k.a();
   }

   protected static class a {
      final Map<alh, hcv> a = Maps.newHashMap();
      private Map<alh, auy> b = Map.of();

      void a(ava $$0) {
         this.b = hbm.a.a($$0);
      }

      void a(alh $$0, hbn $$1) {
         hcv $$2 = this.a.get($$0);
         boolean $$3 = $$2 == null;
         if ($$3 || $$1.b()) {
            if (!$$3) {
               hcu.f.debug("Replaced sound event location {}", $$0);
            }

            $$2 = new hcv($$0, $$1.c());
            this.a.put($$0, $$2);
         }

         avd $$4 = avd.fromMap(this.b);

         for (final hbm $$5 : $$1.a()) {
            final alh $$6 = $$5.a();
            hcw<hbm> $$8;
            switch ($$5.f()) {
               case a:
                  if (!hcu.a($$5, $$0, $$4)) {
                     continue;
                  }

                  $$8 = $$5;
                  break;
               case b:
                  $$8 = new hcw<hbm>() {
                     @Override
                     public int e() {
                        hcv $$0 = a.this.a.get($$6);
                        return $$0 == null ? 0 : $$0.e();
                     }

                     public hbm a(azr $$0) {
                        hcv $$1 = a.this.a.get($$6);
                        if ($$1 == null) {
                           return hcu.b;
                        } else {
                           hbm $$2 = $$1.a($$0);
                           return new hbm($$2.a(), new brf($$2.c(), $$5.c()), new brf($$2.d(), $$5.d()), $$5.e(), hbm.a.a, $$2.g() || $$5.g(), $$2.h(), $$2.i());
                        }
                     }

                     @Override
                     public void a(hcr $$0) {
                        hcv $$1 = a.this.a.get($$6);
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

      public void a(Map<alh, hcv> $$0, Map<alh, auy> $$1, hcr $$2) {
         $$0.clear();
         $$1.clear();
         $$1.putAll(this.b);

         for (Entry<alh, hcv> $$3 : this.a.entrySet()) {
            $$0.put($$3.getKey(), $$3.getValue());
            $$3.getValue().a($$2);
         }
      }
   }
}
