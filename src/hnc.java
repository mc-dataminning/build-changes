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

public class hnc extends avg<hnc.a> {
   public static final ale a = ale.b("empty");
   public static final hlt b = new hlt(a, bsz.a(1.0F), bsz.a(1.0F), 1, hlt.a.a, false, false, 16);
   public static final ale c = ale.b("intentionally_empty");
   public static final hnd d = new hnd(c, null);
   public static final hlt e = new hlt(c, bsz.a(1.0F), bsz.a(1.0F), 1, hlt.a.a, false, false, 16);
   static final Logger f = LogUtils.getLogger();
   private static final String g = "sounds.json";
   private static final Gson h = new GsonBuilder().registerTypeHierarchyAdapter(ww.class, new ww.b(js.b)).registerTypeAdapter(hlu.class, new hlv()).create();
   private static final TypeToken<Map<String, hlu>> i = new TypeToken<Map<String, hlu>>() {
   };
   private final Map<ale, hnd> j = Maps.newHashMap();
   private final hmz k;
   private final Map<ale, auz> l = new HashMap<>();

   public hnc(foj $$0) {
      this.k = new hmz(this, $$0, ave.fromMap(this.l));
   }

   protected hnc.a a(avb $$0, bqj $$1) {
      hnc.a $$2 = new hnc.a();

      try (bqo $$3 = $$1.d("list")) {
         $$2.a($$0);
      }

      for (String $$4 : $$0.a()) {
         try (bqo $$5 = $$1.d($$4)) {
            for (auz $$7 : $$0.a(ale.a($$4, "sounds.json"))) {
               $$1.a($$7.b());

               try (Reader $$8 = $$7.e()) {
                  $$1.a("parse");
                  Map<String, hlu> $$9 = aza.a(h, $$8, i);
                  $$1.b("register");

                  for (Entry<String, hlu> $$10 : $$9.entrySet()) {
                     $$2.a(ale.a($$4, $$10.getKey()), $$10.getValue());
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

   protected void a(hnc.a $$0, avb $$1, bqj $$2) {
      $$0.a(this.j, this.l, this.k);
      if (ab.aU) {
         for (ale $$3 : this.j.keySet()) {
            hnd $$4 = this.j.get($$3);
            if (!wz.b($$4.a()) && mf.b.d($$3)) {
               f.error("Missing subtitle {} for sound event: {}", $$4.a(), $$3);
            }
         }
      }

      if (f.isDebugEnabled()) {
         for (ale $$5 : this.j.keySet()) {
            if (!mf.b.d($$5)) {
               f.debug("Not having sound event for: {}", $$5);
            }
         }
      }

      this.k.a();
   }

   public List<String> a() {
      return this.k.h();
   }

   public fgf b() {
      return this.k.i();
   }

   static boolean a(hlt $$0, ale $$1, ave $$2) {
      ale $$3 = $$0.b();
      if ($$2.getResource($$3).isEmpty()) {
         f.warn("File {} does not exist, cannot add it to event {}", $$3, $$1);
         return false;
      } else {
         return true;
      }
   }

   @Nullable
   public hnd a(ale $$0) {
      return this.j.get($$0);
   }

   public Collection<ale> d() {
      return this.j.keySet();
   }

   public void a(hlx $$0) {
      this.k.a($$0);
   }

   public void a(hlw $$0) {
      this.k.c($$0);
   }

   public void a(hlw $$0, int $$1) {
      this.k.a($$0, $$1);
   }

   public void a(fnn $$0) {
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

   public void a(awm $$0, float $$1) {
      if ($$0 == awm.a && $$1 <= 0.0F) {
         this.f();
      }

      this.k.a($$0, $$1);
   }

   public void b(hlw $$0) {
      this.k.a($$0);
   }

   public void a(hlw $$0, float $$1) {
      this.k.a($$0, $$1);
   }

   public boolean c(hlw $$0) {
      return this.k.b($$0);
   }

   public void a(hnb $$0) {
      this.k.a($$0);
   }

   public void b(hnb $$0) {
      this.k.b($$0);
   }

   public void a(@Nullable ale $$0, @Nullable awm $$1) {
      this.k.a($$0, $$1);
   }

   public String j() {
      return this.k.g();
   }

   public void k() {
      this.k.a();
   }

   protected static class a {
      final Map<ale, hnd> a = Maps.newHashMap();
      private Map<ale, auz> b = Map.of();

      void a(avb $$0) {
         this.b = hlt.a.a($$0);
      }

      void a(ale $$0, hlu $$1) {
         hnd $$2 = this.a.get($$0);
         boolean $$3 = $$2 == null;
         if ($$3 || $$1.b()) {
            if (!$$3) {
               hnc.f.debug("Replaced sound event location {}", $$0);
            }

            $$2 = new hnd($$0, $$1.c());
            this.a.put($$0, $$2);
         }

         ave $$4 = ave.fromMap(this.b);

         for (final hlt $$5 : $$1.a()) {
            final ale $$6 = $$5.a();
            hne<hlt> $$8;
            switch ($$5.f()) {
               case a:
                  if (!hnc.a($$5, $$0, $$4)) {
                     continue;
                  }

                  $$8 = $$5;
                  break;
               case b:
                  $$8 = new hne<hlt>() {
                     @Override
                     public int e() {
                        hnd $$0 = a.this.a.get($$6);
                        return $$0 == null ? 0 : $$0.e();
                     }

                     public hlt a(azt $$0) {
                        hnd $$1 = a.this.a.get($$6);
                        if ($$1 == null) {
                           return hnc.b;
                        } else {
                           hlt $$2 = $$1.a($$0);
                           return new hlt($$2.a(), new btf($$2.c(), $$5.c()), new btf($$2.d(), $$5.d()), $$5.e(), hlt.a.a, $$2.g() || $$5.g(), $$2.h(), $$2.i());
                        }
                     }

                     @Override
                     public void a(hmz $$0) {
                        hnd $$1 = a.this.a.get($$6);
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

      public void a(Map<ale, hnd> $$0, Map<ale, auz> $$1, hmz $$2) {
         $$0.clear();
         $$1.clear();
         $$1.putAll(this.b);

         for (Entry<ale, hnd> $$3 : this.a.entrySet()) {
            $$0.put($$3.getKey(), $$3.getValue());
            $$3.getValue().a($$2);
         }
      }
   }
}
