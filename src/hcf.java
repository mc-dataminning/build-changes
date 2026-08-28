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

public class hcf extends avb<hcf.a> {
   public static final ale a = ale.b("empty");
   public static final hax b = new hax(a, bqt.a(1.0F), bqt.a(1.0F), 1, hax.a.a, false, false, 16);
   public static final ale c = ale.b("intentionally_empty");
   public static final hcg d = new hcg(c, null);
   public static final hax e = new hax(c, bqt.a(1.0F), bqt.a(1.0F), 1, hax.a.a, false, false, 16);
   static final Logger f = LogUtils.getLogger();
   private static final String g = "sounds.json";
   private static final Gson h = new GsonBuilder().registerTypeHierarchyAdapter(xe.class, new xe.b(kc.b)).registerTypeAdapter(hay.class, new haz()).create();
   private static final TypeToken<Map<String, hay>> i = new TypeToken<Map<String, hay>>() {
   };
   private final Map<ale, hcg> j = Maps.newHashMap();
   private final hcc k;
   private final Map<ale, aut> l = new HashMap<>();

   public hcf(fit $$0) {
      this.k = new hcc(this, $$0, auz.fromMap(this.l));
   }

   protected hcf.a a(auv $$0, bog $$1) {
      hcf.a $$2 = new hcf.a();
      $$1.a();
      $$1.a("list");
      $$2.a($$0);
      $$1.c();

      for (String $$3 : $$0.a()) {
         $$1.a($$3);

         try {
            for (aut $$5 : $$0.a(ale.a($$3, "sounds.json"))) {
               $$1.a($$5.b());

               try (Reader $$6 = $$5.e()) {
                  $$1.a("parse");
                  Map<String, hay> $$7 = ayv.a(h, $$6, i);
                  $$1.b("register");

                  for (Entry<String, hay> $$8 : $$7.entrySet()) {
                     $$2.a(ale.a($$3, $$8.getKey()), $$8.getValue());
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

   protected void a(hcf.a $$0, auv $$1, bog $$2) {
      $$0.a(this.j, this.l, this.k);
      if (ab.aW) {
         for (ale $$3 : this.j.keySet()) {
            hcg $$4 = this.j.get($$3);
            if (!xh.b($$4.a()) && lv.b.d($$3)) {
               f.error("Missing subtitle {} for sound event: {}", $$4.a(), $$3);
            }
         }
      }

      if (f.isDebugEnabled()) {
         for (ale $$5 : this.j.keySet()) {
            if (!lv.b.d($$5)) {
               f.debug("Not having sound event for: {}", $$5);
            }
         }
      }

      this.k.a();
   }

   public List<String> a() {
      return this.k.h();
   }

   public fbc b() {
      return this.k.i();
   }

   static boolean a(hax $$0, ale $$1, auz $$2) {
      ale $$3 = $$0.b();
      if ($$2.getResource($$3).isEmpty()) {
         f.warn("File {} does not exist, cannot add it to event {}", $$3, $$1);
         return false;
      } else {
         return true;
      }
   }

   @Nullable
   public hcg a(ale $$0) {
      return this.j.get($$0);
   }

   public Collection<ale> d() {
      return this.j.keySet();
   }

   public void a(hbb $$0) {
      this.k.a($$0);
   }

   public void a(hba $$0) {
      this.k.c($$0);
   }

   public void a(hba $$0, int $$1) {
      this.k.a($$0, $$1);
   }

   public void a(fhy $$0) {
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

   public void a(awh $$0, float $$1) {
      if ($$0 == awh.a && $$1 <= 0.0F) {
         this.f();
      }

      this.k.a($$0, $$1);
   }

   public void b(hba $$0) {
      this.k.a($$0);
   }

   public boolean c(hba $$0) {
      return this.k.b($$0);
   }

   public void a(hce $$0) {
      this.k.a($$0);
   }

   public void b(hce $$0) {
      this.k.b($$0);
   }

   public void a(@Nullable ale $$0, @Nullable awh $$1) {
      this.k.a($$0, $$1);
   }

   public String j() {
      return this.k.g();
   }

   public void k() {
      this.k.a();
   }

   protected static class a {
      final Map<ale, hcg> a = Maps.newHashMap();
      private Map<ale, aut> b = Map.of();

      void a(auv $$0) {
         this.b = hax.a.a($$0);
      }

      void a(ale $$0, hay $$1) {
         hcg $$2 = this.a.get($$0);
         boolean $$3 = $$2 == null;
         if ($$3 || $$1.b()) {
            if (!$$3) {
               hcf.f.debug("Replaced sound event location {}", $$0);
            }

            $$2 = new hcg($$0, $$1.c());
            this.a.put($$0, $$2);
         }

         auz $$4 = auz.fromMap(this.b);

         for (final hax $$5 : $$1.a()) {
            final ale $$6 = $$5.a();
            hch<hax> $$8;
            switch ($$5.f()) {
               case a:
                  if (!hcf.a($$5, $$0, $$4)) {
                     continue;
                  }

                  $$8 = $$5;
                  break;
               case b:
                  $$8 = new hch<hax>() {
                     @Override
                     public int e() {
                        hcg $$0 = a.this.a.get($$6);
                        return $$0 == null ? 0 : $$0.e();
                     }

                     public hax a(azn $$0) {
                        hcg $$1 = a.this.a.get($$6);
                        if ($$1 == null) {
                           return hcf.b;
                        } else {
                           hax $$2 = $$1.a($$0);
                           return new hax($$2.a(), new bqz($$2.c(), $$5.c()), new bqz($$2.d(), $$5.d()), $$5.e(), hax.a.a, $$2.g() || $$5.g(), $$2.h(), $$2.i());
                        }
                     }

                     @Override
                     public void a(hcc $$0) {
                        hcg $$1 = a.this.a.get($$6);
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

      public void a(Map<ale, hcg> $$0, Map<ale, aut> $$1, hcc $$2) {
         $$0.clear();
         $$1.clear();
         $$1.putAll(this.b);

         for (Entry<ale, hcg> $$3 : this.a.entrySet()) {
            $$0.put($$3.getKey(), $$3.getValue());
            $$3.getValue().a($$2);
         }
      }
   }
}
