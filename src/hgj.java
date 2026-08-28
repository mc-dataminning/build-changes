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

public class hgj extends avq<hgj.a> {
   public static final alp a = alp.b("empty");
   public static final hfa b = new hfa(a, bsb.a(1.0F), bsb.a(1.0F), 1, hfa.a.a, false, false, 16);
   public static final alp c = alp.b("intentionally_empty");
   public static final hgk d = new hgk(c, null);
   public static final hfa e = new hfa(c, bsb.a(1.0F), bsb.a(1.0F), 1, hfa.a.a, false, false, 16);
   static final Logger f = LogUtils.getLogger();
   private static final String g = "sounds.json";
   private static final Gson h = new GsonBuilder().registerTypeHierarchyAdapter(xk.class, new xk.b(ke.b)).registerTypeAdapter(hfb.class, new hfc()).create();
   private static final TypeToken<Map<String, hfb>> i = new TypeToken<Map<String, hfb>>() {
   };
   private final Map<alp, hgk> j = Maps.newHashMap();
   private final hgg k;
   private final Map<alp, avj> l = new HashMap<>();

   public hgj(fmd $$0) {
      this.k = new hgg(this, $$0, avo.fromMap(this.l));
   }

   protected hgj.a a(avl $$0, bpj $$1) {
      hgj.a $$2 = new hgj.a();

      try (bpo $$3 = $$1.d("list")) {
         $$2.a($$0);
      }

      for (String $$4 : $$0.a()) {
         try (bpo $$5 = $$1.d($$4)) {
            for (avj $$7 : $$0.a(alp.a($$4, "sounds.json"))) {
               $$1.a($$7.b());

               try (Reader $$8 = $$7.e()) {
                  $$1.a("parse");
                  Map<String, hfb> $$9 = azk.a(h, $$8, i);
                  $$1.b("register");

                  for (Entry<String, hfb> $$10 : $$9.entrySet()) {
                     $$2.a(alp.a($$4, $$10.getKey()), $$10.getValue());
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

   protected void a(hgj.a $$0, avl $$1, bpj $$2) {
      $$0.a(this.j, this.l, this.k);
      if (ab.aU) {
         for (alp $$3 : this.j.keySet()) {
            hgk $$4 = this.j.get($$3);
            if (!xn.b($$4.a()) && ma.b.d($$3)) {
               f.error("Missing subtitle {} for sound event: {}", $$4.a(), $$3);
            }
         }
      }

      if (f.isDebugEnabled()) {
         for (alp $$5 : this.j.keySet()) {
            if (!ma.b.d($$5)) {
               f.debug("Not having sound event for: {}", $$5);
            }
         }
      }

      this.k.a();
   }

   public List<String> a() {
      return this.k.h();
   }

   public fea b() {
      return this.k.i();
   }

   static boolean a(hfa $$0, alp $$1, avo $$2) {
      alp $$3 = $$0.b();
      if ($$2.getResource($$3).isEmpty()) {
         f.warn("File {} does not exist, cannot add it to event {}", $$3, $$1);
         return false;
      } else {
         return true;
      }
   }

   @Nullable
   public hgk a(alp $$0) {
      return this.j.get($$0);
   }

   public Collection<alp> d() {
      return this.j.keySet();
   }

   public void a(hfe $$0) {
      this.k.a($$0);
   }

   public void a(hfd $$0) {
      this.k.c($$0);
   }

   public void a(hfd $$0, int $$1) {
      this.k.a($$0, $$1);
   }

   public void a(fli $$0) {
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

   public void a(aww $$0, float $$1) {
      if ($$0 == aww.a && $$1 <= 0.0F) {
         this.f();
      }

      this.k.a($$0, $$1);
   }

   public void b(hfd $$0) {
      this.k.a($$0);
   }

   public void a(hfd $$0, float $$1) {
      this.k.a($$0, $$1);
   }

   public boolean c(hfd $$0) {
      return this.k.b($$0);
   }

   public void a(hgi $$0) {
      this.k.a($$0);
   }

   public void b(hgi $$0) {
      this.k.b($$0);
   }

   public void a(@Nullable alp $$0, @Nullable aww $$1) {
      this.k.a($$0, $$1);
   }

   public String j() {
      return this.k.g();
   }

   public void k() {
      this.k.a();
   }

   protected static class a {
      final Map<alp, hgk> a = Maps.newHashMap();
      private Map<alp, avj> b = Map.of();

      void a(avl $$0) {
         this.b = hfa.a.a($$0);
      }

      void a(alp $$0, hfb $$1) {
         hgk $$2 = this.a.get($$0);
         boolean $$3 = $$2 == null;
         if ($$3 || $$1.b()) {
            if (!$$3) {
               hgj.f.debug("Replaced sound event location {}", $$0);
            }

            $$2 = new hgk($$0, $$1.c());
            this.a.put($$0, $$2);
         }

         avo $$4 = avo.fromMap(this.b);

         for (final hfa $$5 : $$1.a()) {
            final alp $$6 = $$5.a();
            hgl<hfa> $$8;
            switch ($$5.f()) {
               case a:
                  if (!hgj.a($$5, $$0, $$4)) {
                     continue;
                  }

                  $$8 = $$5;
                  break;
               case b:
                  $$8 = new hgl<hfa>() {
                     @Override
                     public int e() {
                        hgk $$0 = a.this.a.get($$6);
                        return $$0 == null ? 0 : $$0.e();
                     }

                     public hfa a(bac $$0) {
                        hgk $$1 = a.this.a.get($$6);
                        if ($$1 == null) {
                           return hgj.b;
                        } else {
                           hfa $$2 = $$1.a($$0);
                           return new hfa($$2.a(), new bsh($$2.c(), $$5.c()), new bsh($$2.d(), $$5.d()), $$5.e(), hfa.a.a, $$2.g() || $$5.g(), $$2.h(), $$2.i());
                        }
                     }

                     @Override
                     public void a(hgg $$0) {
                        hgk $$1 = a.this.a.get($$6);
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

      public void a(Map<alp, hgk> $$0, Map<alp, avj> $$1, hgg $$2) {
         $$0.clear();
         $$1.clear();
         $$1.putAll(this.b);

         for (Entry<alp, hgk> $$3 : this.a.entrySet()) {
            $$0.put($$3.getKey(), $$3.getValue());
            $$3.getValue().a($$2);
         }
      }
   }
}
