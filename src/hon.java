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

public class hon extends avi<hon.a> {
   public static final alg a = alg.b("empty");
   public static final hne b = new hne(a, bth.a(1.0F), bth.a(1.0F), 1, hne.a.a, false, false, 16);
   public static final alg c = alg.b("intentionally_empty");
   public static final hoo d = new hoo(c, null);
   public static final hne e = new hne(c, bth.a(1.0F), bth.a(1.0F), 1, hne.a.a, false, false, 16);
   static final Logger f = LogUtils.getLogger();
   private static final String g = "sounds.json";
   private static final Gson h = new GsonBuilder().registerTypeHierarchyAdapter(wy.class, new wy.b(jt.b)).registerTypeAdapter(hnf.class, new hng()).create();
   private static final TypeToken<Map<String, hnf>> i = new TypeToken<Map<String, hnf>>() {
   };
   private final Map<alg, hoo> j = Maps.newHashMap();
   private final hok k;
   private final Map<alg, avb> l = new HashMap<>();

   public hon(fps $$0) {
      this.k = new hok(this, $$0, avg.fromMap(this.l));
   }

   protected hon.a a(avd $$0, bqq $$1) {
      hon.a $$2 = new hon.a();

      try (bqv $$3 = $$1.d("list")) {
         $$2.a($$0);
      }

      for (String $$4 : $$0.a()) {
         try (bqv $$5 = $$1.d($$4)) {
            for (avb $$7 : $$0.a(alg.a($$4, "sounds.json"))) {
               $$1.a($$7.b());

               try (Reader $$8 = $$7.e()) {
                  $$1.a("parse");
                  Map<String, hnf> $$9 = azc.a(h, $$8, i);
                  $$1.b("register");

                  for (Entry<String, hnf> $$10 : $$9.entrySet()) {
                     $$2.a(alg.a($$4, $$10.getKey()), $$10.getValue());
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

   protected void a(hon.a $$0, avd $$1, bqq $$2) {
      $$0.a(this.j, this.l, this.k);
      if (ac.aV) {
         for (alg $$3 : this.j.keySet()) {
            hoo $$4 = this.j.get($$3);
            if (!xb.b($$4.a()) && mg.b.d($$3)) {
               f.error("Missing subtitle {} for sound event: {}", $$4.a(), $$3);
            }
         }
      }

      if (f.isDebugEnabled()) {
         for (alg $$5 : this.j.keySet()) {
            if (!mg.b.d($$5)) {
               f.debug("Not having sound event for: {}", $$5);
            }
         }
      }

      this.k.a();
   }

   public List<String> a() {
      return this.k.h();
   }

   public fhh b() {
      return this.k.i();
   }

   static boolean a(hne $$0, alg $$1, avg $$2) {
      alg $$3 = $$0.b();
      if ($$2.getResource($$3).isEmpty()) {
         f.warn("File {} does not exist, cannot add it to event {}", $$3, $$1);
         return false;
      } else {
         return true;
      }
   }

   @Nullable
   public hoo a(alg $$0) {
      return this.j.get($$0);
   }

   public Collection<alg> c() {
      return this.j.keySet();
   }

   public void a(hni $$0) {
      this.k.a($$0);
   }

   public void a(hnh $$0) {
      this.k.c($$0);
   }

   public void a(hnh $$0, int $$1) {
      this.k.a($$0, $$1);
   }

   public void a(fow $$0) {
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

   public void a(awo $$0, float $$1) {
      if ($$0 == awo.a && $$1 <= 0.0F) {
         this.e();
      }

      this.k.a($$0, $$1);
   }

   public void b(hnh $$0) {
      this.k.a($$0);
   }

   public void a(hnh $$0, float $$1) {
      this.k.a($$0, $$1);
   }

   public boolean c(hnh $$0) {
      return this.k.b($$0);
   }

   public void a(hom $$0) {
      this.k.a($$0);
   }

   public void b(hom $$0) {
      this.k.b($$0);
   }

   public void a(@Nullable alg $$0, @Nullable awo $$1) {
      this.k.a($$0, $$1);
   }

   public String i() {
      return this.k.g();
   }

   public void j() {
      this.k.a();
   }

   protected static class a {
      final Map<alg, hoo> a = Maps.newHashMap();
      private Map<alg, avb> b = Map.of();

      void a(avd $$0) {
         this.b = hne.a.a($$0);
      }

      void a(alg $$0, hnf $$1) {
         hoo $$2 = this.a.get($$0);
         boolean $$3 = $$2 == null;
         if ($$3 || $$1.b()) {
            if (!$$3) {
               hon.f.debug("Replaced sound event location {}", $$0);
            }

            $$2 = new hoo($$0, $$1.c());
            this.a.put($$0, $$2);
         }

         avg $$4 = avg.fromMap(this.b);

         for (final hne $$5 : $$1.a()) {
            final alg $$6 = $$5.a();
            hop<hne> $$8;
            switch ($$5.f()) {
               case a:
                  if (!hon.a($$5, $$0, $$4)) {
                     continue;
                  }

                  $$8 = $$5;
                  break;
               case b:
                  $$8 = new hop<hne>() {
                     @Override
                     public int e() {
                        hoo $$0 = a.this.a.get($$6);
                        return $$0 == null ? 0 : $$0.e();
                     }

                     public hne a(azv $$0) {
                        hoo $$1 = a.this.a.get($$6);
                        if ($$1 == null) {
                           return hon.b;
                        } else {
                           hne $$2 = $$1.a($$0);
                           return new hne($$2.a(), new btn($$2.c(), $$5.c()), new btn($$2.d(), $$5.d()), $$5.e(), hne.a.a, $$2.g() || $$5.g(), $$2.h(), $$2.i());
                        }
                     }

                     @Override
                     public void a(hok $$0) {
                        hoo $$1 = a.this.a.get($$6);
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

      public void a(Map<alg, hoo> $$0, Map<alg, avb> $$1, hok $$2) {
         $$0.clear();
         $$1.clear();
         $$1.putAll(this.b);

         for (Entry<alg, hoo> $$3 : this.a.entrySet()) {
            $$0.put($$3.getKey(), $$3.getValue());
            $$3.getValue().a($$2);
         }
      }
   }
}
