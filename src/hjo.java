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

public class hjo extends auu<hjo.a> {
   public static final aku a = aku.b("empty");
   public static final hif b = new hif(a, brk.a(1.0F), brk.a(1.0F), 1, hif.a.a, false, false, 16);
   public static final aku c = aku.b("intentionally_empty");
   public static final hjp d = new hjp(c, null);
   public static final hif e = new hif(c, brk.a(1.0F), brk.a(1.0F), 1, hif.a.a, false, false, 16);
   static final Logger f = LogUtils.getLogger();
   private static final String g = "sounds.json";
   private static final Gson h = new GsonBuilder().registerTypeHierarchyAdapter(wo.class, new wo.b(kf.b)).registerTypeAdapter(hig.class, new hih()).create();
   private static final TypeToken<Map<String, hig>> i = new TypeToken<Map<String, hig>>() {
   };
   private final Map<aku, hjp> j = Maps.newHashMap();
   private final hjl k;
   private final Map<aku, aun> l = new HashMap<>();

   public hjo(fln $$0) {
      this.k = new hjl(this, $$0, aus.fromMap(this.l));
   }

   protected hjo.a a(aup $$0, bos $$1) {
      hjo.a $$2 = new hjo.a();

      try (box $$3 = $$1.d("list")) {
         $$2.a($$0);
      }

      for (String $$4 : $$0.a()) {
         try (box $$5 = $$1.d($$4)) {
            for (aun $$7 : $$0.a(aku.a($$4, "sounds.json"))) {
               $$1.a($$7.b());

               try (Reader $$8 = $$7.e()) {
                  $$1.a("parse");
                  Map<String, hig> $$9 = ayp.a(h, $$8, i);
                  $$1.b("register");

                  for (Entry<String, hig> $$10 : $$9.entrySet()) {
                     $$2.a(aku.a($$4, $$10.getKey()), $$10.getValue());
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

   protected void a(hjo.a $$0, aup $$1, bos $$2) {
      $$0.a(this.j, this.l, this.k);
      if (ab.aU) {
         for (aku $$3 : this.j.keySet()) {
            hjp $$4 = this.j.get($$3);
            if (!wr.b($$4.a()) && mb.b.d($$3)) {
               f.error("Missing subtitle {} for sound event: {}", $$4.a(), $$3);
            }
         }
      }

      if (f.isDebugEnabled()) {
         for (aku $$5 : this.j.keySet()) {
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

   static boolean a(hif $$0, aku $$1, aus $$2) {
      aku $$3 = $$0.b();
      if ($$2.getResource($$3).isEmpty()) {
         f.warn("File {} does not exist, cannot add it to event {}", $$3, $$1);
         return false;
      } else {
         return true;
      }
   }

   @Nullable
   public hjp a(aku $$0) {
      return this.j.get($$0);
   }

   public Collection<aku> d() {
      return this.j.keySet();
   }

   public void a(hij $$0) {
      this.k.a($$0);
   }

   public void a(hii $$0) {
      this.k.c($$0);
   }

   public void a(hii $$0, int $$1) {
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

   public void b(hii $$0) {
      this.k.a($$0);
   }

   public void a(hii $$0, float $$1) {
      this.k.a($$0, $$1);
   }

   public boolean c(hii $$0) {
      return this.k.b($$0);
   }

   public void a(hjn $$0) {
      this.k.a($$0);
   }

   public void b(hjn $$0) {
      this.k.b($$0);
   }

   public void a(@Nullable aku $$0, @Nullable awb $$1) {
      this.k.a($$0, $$1);
   }

   public String j() {
      return this.k.g();
   }

   public void k() {
      this.k.a();
   }

   protected static class a {
      final Map<aku, hjp> a = Maps.newHashMap();
      private Map<aku, aun> b = Map.of();

      void a(aup $$0) {
         this.b = hif.a.a($$0);
      }

      void a(aku $$0, hig $$1) {
         hjp $$2 = this.a.get($$0);
         boolean $$3 = $$2 == null;
         if ($$3 || $$1.b()) {
            if (!$$3) {
               hjo.f.debug("Replaced sound event location {}", $$0);
            }

            $$2 = new hjp($$0, $$1.c());
            this.a.put($$0, $$2);
         }

         aus $$4 = aus.fromMap(this.b);

         for (final hif $$5 : $$1.a()) {
            final aku $$6 = $$5.a();
            hjq<hif> $$8;
            switch ($$5.f()) {
               case a:
                  if (!hjo.a($$5, $$0, $$4)) {
                     continue;
                  }

                  $$8 = $$5;
                  break;
               case b:
                  $$8 = new hjq<hif>() {
                     @Override
                     public int e() {
                        hjp $$0 = a.this.a.get($$6);
                        return $$0 == null ? 0 : $$0.e();
                     }

                     public hif a(azh $$0) {
                        hjp $$1 = a.this.a.get($$6);
                        if ($$1 == null) {
                           return hjo.b;
                        } else {
                           hif $$2 = $$1.a($$0);
                           return new hif($$2.a(), new brq($$2.c(), $$5.c()), new brq($$2.d(), $$5.d()), $$5.e(), hif.a.a, $$2.g() || $$5.g(), $$2.h(), $$2.i());
                        }
                     }

                     @Override
                     public void a(hjl $$0) {
                        hjp $$1 = a.this.a.get($$6);
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

      public void a(Map<aku, hjp> $$0, Map<aku, aun> $$1, hjl $$2) {
         $$0.clear();
         $$1.clear();
         $$1.putAll(this.b);

         for (Entry<aku, hjp> $$3 : this.a.entrySet()) {
            $$0.put($$3.getKey(), $$3.getValue());
            $$3.getValue().a($$2);
         }
      }
   }
}
