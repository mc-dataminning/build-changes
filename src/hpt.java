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

public class hpt extends avt<hpt.a> {
   public static final alr a = alr.b("empty");
   public static final hok b = new hok(a, bud.a(1.0F), bud.a(1.0F), 1, hok.a.a, false, false, 16);
   public static final alr c = alr.b("intentionally_empty");
   public static final hpu d = new hpu(c, null);
   public static final hok e = new hok(c, bud.a(1.0F), bud.a(1.0F), 1, hok.a.a, false, false, 16);
   static final Logger f = LogUtils.getLogger();
   private static final String g = "sounds.json";
   private static final Gson h = new GsonBuilder().registerTypeHierarchyAdapter(xg.class, new xg.b(ju.b)).registerTypeAdapter(hol.class, new hom()).create();
   private static final TypeToken<Map<String, hol>> i = new TypeToken<Map<String, hol>>() {
   };
   private final Map<alr, hpu> j = Maps.newHashMap();
   private final hpq k;
   private final Map<alr, avm> l = new HashMap<>();

   public hpt(fqu $$0) {
      this.k = new hpq(this, $$0, avr.fromMap(this.l));
   }

   protected hpt.a a(avo $$0, brm $$1) {
      hpt.a $$2 = new hpt.a();

      try (brr $$3 = $$1.d("list")) {
         $$2.a($$0);
      }

      for (String $$4 : $$0.a()) {
         try (brr $$5 = $$1.d($$4)) {
            for (avm $$7 : $$0.a(alr.a($$4, "sounds.json"))) {
               $$1.a($$7.b());

               try (Reader $$8 = $$7.e()) {
                  $$1.a("parse");
                  Map<String, hol> $$9 = azo.a(h, $$8, i);
                  $$1.b("register");

                  for (Entry<String, hol> $$10 : $$9.entrySet()) {
                     $$2.a(alr.a($$4, $$10.getKey()), $$10.getValue());
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

   protected void a(hpt.a $$0, avo $$1, brm $$2) {
      $$0.a(this.j, this.l, this.k);
      if (ac.aU) {
         for (alr $$3 : this.j.keySet()) {
            hpu $$4 = this.j.get($$3);
            if (!xj.b($$4.a()) && mh.b.d($$3)) {
               f.error("Missing subtitle {} for sound event: {}", $$4.a(), $$3);
            }
         }
      }

      if (f.isDebugEnabled()) {
         for (alr $$5 : this.j.keySet()) {
            if (!mh.b.d($$5)) {
               f.debug("Not having sound event for: {}", $$5);
            }
         }
      }

      this.k.a();
   }

   public List<String> a() {
      return this.k.h();
   }

   public fim b() {
      return this.k.i();
   }

   static boolean a(hok $$0, alr $$1, avr $$2) {
      alr $$3 = $$0.b();
      if ($$2.getResource($$3).isEmpty()) {
         f.warn("File {} does not exist, cannot add it to event {}", $$3, $$1);
         return false;
      } else {
         return true;
      }
   }

   @Nullable
   public hpu a(alr $$0) {
      return this.j.get($$0);
   }

   public Collection<alr> c() {
      return this.j.keySet();
   }

   public void a(hoo $$0) {
      this.k.a($$0);
   }

   public void a(hon $$0) {
      this.k.c($$0);
   }

   public void a(hon $$0, int $$1) {
      this.k.a($$0, $$1);
   }

   public void a(fpy $$0) {
      this.k.a($$0);
   }

   public void d() {
      this.k.e();
   }

   public void e() {
      this.k.d();
   }

   public void f() {
      this.k.b();
   }

   public void g() {
      this.k.c();
   }

   public void a(boolean $$0) {
      this.k.a($$0);
   }

   public void h() {
      this.k.f();
   }

   public void a(awz $$0, float $$1) {
      if ($$0 == awz.a && $$1 <= 0.0F) {
         this.e();
      }

      this.k.a($$0, $$1);
   }

   public void b(hon $$0) {
      this.k.a($$0);
   }

   public void a(hon $$0, float $$1) {
      this.k.a($$0, $$1);
   }

   public boolean c(hon $$0) {
      return this.k.b($$0);
   }

   public void a(hps $$0) {
      this.k.a($$0);
   }

   public void b(hps $$0) {
      this.k.b($$0);
   }

   public void a(@Nullable alr $$0, @Nullable awz $$1) {
      this.k.a($$0, $$1);
   }

   public String i() {
      return this.k.g();
   }

   public void j() {
      this.k.a();
   }

   protected static class a {
      final Map<alr, hpu> a = Maps.newHashMap();
      private Map<alr, avm> b = Map.of();

      void a(avo $$0) {
         this.b = hok.a.a($$0);
      }

      void a(alr $$0, hol $$1) {
         hpu $$2 = this.a.get($$0);
         boolean $$3 = $$2 == null;
         if ($$3 || $$1.b()) {
            if (!$$3) {
               hpt.f.debug("Replaced sound event location {}", $$0);
            }

            $$2 = new hpu($$0, $$1.c());
            this.a.put($$0, $$2);
         }

         avr $$4 = avr.fromMap(this.b);

         for (final hok $$5 : $$1.a()) {
            final alr $$6 = $$5.a();
            hpv<hok> $$8;
            switch ($$5.f()) {
               case a:
                  if (!hpt.a($$5, $$0, $$4)) {
                     continue;
                  }

                  $$8 = $$5;
                  break;
               case b:
                  $$8 = new hpv<hok>() {
                     @Override
                     public int e() {
                        hpu $$0 = a.this.a.get($$6);
                        return $$0 == null ? 0 : $$0.e();
                     }

                     public hok a(bai $$0) {
                        hpu $$1 = a.this.a.get($$6);
                        if ($$1 == null) {
                           return hpt.b;
                        } else {
                           hok $$2 = $$1.a($$0);
                           return new hok($$2.a(), new buj($$2.c(), $$5.c()), new buj($$2.d(), $$5.d()), $$5.e(), hok.a.a, $$2.g() || $$5.g(), $$2.h(), $$2.i());
                        }
                     }

                     @Override
                     public void a(hpq $$0) {
                        hpu $$1 = a.this.a.get($$6);
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

      public void a(Map<alr, hpu> $$0, Map<alr, avm> $$1, hpq $$2) {
         $$0.clear();
         $$1.clear();
         $$1.putAll(this.b);

         for (Entry<alr, hpu> $$3 : this.a.entrySet()) {
            $$0.put($$3.getKey(), $$3.getValue());
            $$3.getValue().a($$2);
         }
      }
   }
}
