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

public class hdv extends avj<hdv.a> {
   public static final all a = all.b("empty");
   public static final hcn b = new hcn(a, bri.a(1.0F), bri.a(1.0F), 1, hcn.a.a, false, false, 16);
   public static final all c = all.b("intentionally_empty");
   public static final hdw d = new hdw(c, null);
   public static final hcn e = new hcn(c, bri.a(1.0F), bri.a(1.0F), 1, hcn.a.a, false, false, 16);
   static final Logger f = LogUtils.getLogger();
   private static final String g = "sounds.json";
   private static final Gson h = new GsonBuilder().registerTypeHierarchyAdapter(xl.class, new xl.b(ke.b)).registerTypeAdapter(hco.class, new hcp()).create();
   private static final TypeToken<Map<String, hco>> i = new TypeToken<Map<String, hco>>() {
   };
   private final Map<all, hdw> j = Maps.newHashMap();
   private final hds k;
   private final Map<all, avc> l = new HashMap<>();

   public hdv(fkb $$0) {
      this.k = new hds(this, $$0, avh.fromMap(this.l));
   }

   protected hdv.a a(ave $$0, bor $$1) {
      hdv.a $$2 = new hdv.a();

      try (bow $$3 = $$1.d("list")) {
         $$2.a($$0);
      }

      for (String $$4 : $$0.a()) {
         try (bow $$5 = $$1.d($$4)) {
            for (avc $$7 : $$0.a(all.a($$4, "sounds.json"))) {
               $$1.a($$7.b());

               try (Reader $$8 = $$7.e()) {
                  $$1.a("parse");
                  Map<String, hco> $$9 = azd.a(h, $$8, i);
                  $$1.b("register");

                  for (Entry<String, hco> $$10 : $$9.entrySet()) {
                     $$2.a(all.a($$4, $$10.getKey()), $$10.getValue());
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

   protected void a(hdv.a $$0, ave $$1, bor $$2) {
      $$0.a(this.j, this.l, this.k);
      if (ab.aV) {
         for (all $$3 : this.j.keySet()) {
            hdw $$4 = this.j.get($$3);
            if (!xo.b($$4.a()) && lz.b.d($$3)) {
               f.error("Missing subtitle {} for sound event: {}", $$4.a(), $$3);
            }
         }
      }

      if (f.isDebugEnabled()) {
         for (all $$5 : this.j.keySet()) {
            if (!lz.b.d($$5)) {
               f.debug("Not having sound event for: {}", $$5);
            }
         }
      }

      this.k.a();
   }

   public List<String> a() {
      return this.k.h();
   }

   public fbz b() {
      return this.k.i();
   }

   static boolean a(hcn $$0, all $$1, avh $$2) {
      all $$3 = $$0.b();
      if ($$2.getResource($$3).isEmpty()) {
         f.warn("File {} does not exist, cannot add it to event {}", $$3, $$1);
         return false;
      } else {
         return true;
      }
   }

   @Nullable
   public hdw a(all $$0) {
      return this.j.get($$0);
   }

   public Collection<all> d() {
      return this.j.keySet();
   }

   public void a(hcr $$0) {
      this.k.a($$0);
   }

   public void a(hcq $$0) {
      this.k.c($$0);
   }

   public void a(hcq $$0, int $$1) {
      this.k.a($$0, $$1);
   }

   public void a(fjg $$0) {
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

   public void a(awp $$0, float $$1) {
      if ($$0 == awp.a && $$1 <= 0.0F) {
         this.f();
      }

      this.k.a($$0, $$1);
   }

   public void b(hcq $$0) {
      this.k.a($$0);
   }

   public boolean c(hcq $$0) {
      return this.k.b($$0);
   }

   public void a(hdu $$0) {
      this.k.a($$0);
   }

   public void b(hdu $$0) {
      this.k.b($$0);
   }

   public void a(@Nullable all $$0, @Nullable awp $$1) {
      this.k.a($$0, $$1);
   }

   public String j() {
      return this.k.g();
   }

   public void k() {
      this.k.a();
   }

   protected static class a {
      final Map<all, hdw> a = Maps.newHashMap();
      private Map<all, avc> b = Map.of();

      void a(ave $$0) {
         this.b = hcn.a.a($$0);
      }

      void a(all $$0, hco $$1) {
         hdw $$2 = this.a.get($$0);
         boolean $$3 = $$2 == null;
         if ($$3 || $$1.b()) {
            if (!$$3) {
               hdv.f.debug("Replaced sound event location {}", $$0);
            }

            $$2 = new hdw($$0, $$1.c());
            this.a.put($$0, $$2);
         }

         avh $$4 = avh.fromMap(this.b);

         for (final hcn $$5 : $$1.a()) {
            final all $$6 = $$5.a();
            hdx<hcn> $$8;
            switch ($$5.f()) {
               case a:
                  if (!hdv.a($$5, $$0, $$4)) {
                     continue;
                  }

                  $$8 = $$5;
                  break;
               case b:
                  $$8 = new hdx<hcn>() {
                     @Override
                     public int e() {
                        hdw $$0 = a.this.a.get($$6);
                        return $$0 == null ? 0 : $$0.e();
                     }

                     public hcn a(azv $$0) {
                        hdw $$1 = a.this.a.get($$6);
                        if ($$1 == null) {
                           return hdv.b;
                        } else {
                           hcn $$2 = $$1.a($$0);
                           return new hcn($$2.a(), new bro($$2.c(), $$5.c()), new bro($$2.d(), $$5.d()), $$5.e(), hcn.a.a, $$2.g() || $$5.g(), $$2.h(), $$2.i());
                        }
                     }

                     @Override
                     public void a(hds $$0) {
                        hdw $$1 = a.this.a.get($$6);
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

      public void a(Map<all, hdw> $$0, Map<all, avc> $$1, hds $$2) {
         $$0.clear();
         $$1.clear();
         $$1.putAll(this.b);

         for (Entry<all, hdw> $$3 : this.a.entrySet()) {
            $$0.put($$3.getKey(), $$3.getValue());
            $$3.getValue().a($$2);
         }
      }
   }
}
