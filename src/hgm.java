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

public class hgm extends awa<hgm.a> {
   public static final alz a = alz.b("empty");
   public static final hfe b = new hfe(a, bsj.a(1.0F), bsj.a(1.0F), 1, hfe.a.a, false, false, 16);
   public static final alz c = alz.b("intentionally_empty");
   public static final hgn d = new hgn(c, null);
   public static final hfe e = new hfe(c, bsj.a(1.0F), bsj.a(1.0F), 1, hfe.a.a, false, false, 16);
   static final Logger f = LogUtils.getLogger();
   private static final String g = "sounds.json";
   private static final Gson h = new GsonBuilder().registerTypeHierarchyAdapter(xv.class, new xv.b(ke.b)).registerTypeAdapter(hff.class, new hfg()).create();
   private static final TypeToken<Map<String, hff>> i = new TypeToken<Map<String, hff>>() {
   };
   private final Map<alz, hgn> j = Maps.newHashMap();
   private final hgj k;
   private final Map<alz, avt> l = new HashMap<>();

   public hgm(fmj $$0) {
      this.k = new hgj(this, $$0, avy.fromMap(this.l));
   }

   protected hgm.a a(avv $$0, bps $$1) {
      hgm.a $$2 = new hgm.a();

      try (bpx $$3 = $$1.d("list")) {
         $$2.a($$0);
      }

      for (String $$4 : $$0.a()) {
         try (bpx $$5 = $$1.d($$4)) {
            for (avt $$7 : $$0.a(alz.a($$4, "sounds.json"))) {
               $$1.a($$7.b());

               try (Reader $$8 = $$7.e()) {
                  $$1.a("parse");
                  Map<String, hff> $$9 = azu.a(h, $$8, i);
                  $$1.b("register");

                  for (Entry<String, hff> $$10 : $$9.entrySet()) {
                     $$2.a(alz.a($$4, $$10.getKey()), $$10.getValue());
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

   protected void a(hgm.a $$0, avv $$1, bps $$2) {
      $$0.a(this.j, this.l, this.k);
      if (ab.aU) {
         for (alz $$3 : this.j.keySet()) {
            hgn $$4 = this.j.get($$3);
            if (!xy.b($$4.a()) && ma.b.d($$3)) {
               f.error("Missing subtitle {} for sound event: {}", $$4.a(), $$3);
            }
         }
      }

      if (f.isDebugEnabled()) {
         for (alz $$5 : this.j.keySet()) {
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

   public feg b() {
      return this.k.i();
   }

   static boolean a(hfe $$0, alz $$1, avy $$2) {
      alz $$3 = $$0.b();
      if ($$2.getResource($$3).isEmpty()) {
         f.warn("File {} does not exist, cannot add it to event {}", $$3, $$1);
         return false;
      } else {
         return true;
      }
   }

   @Nullable
   public hgn a(alz $$0) {
      return this.j.get($$0);
   }

   public Collection<alz> d() {
      return this.j.keySet();
   }

   public void a(hfi $$0) {
      this.k.a($$0);
   }

   public void a(hfh $$0) {
      this.k.c($$0);
   }

   public void a(hfh $$0, int $$1) {
      this.k.a($$0, $$1);
   }

   public void a(flo $$0) {
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

   public void a(axg $$0, float $$1) {
      if ($$0 == axg.a && $$1 <= 0.0F) {
         this.f();
      }

      this.k.a($$0, $$1);
   }

   public void b(hfh $$0) {
      this.k.a($$0);
   }

   public boolean c(hfh $$0) {
      return this.k.b($$0);
   }

   public void a(hgl $$0) {
      this.k.a($$0);
   }

   public void b(hgl $$0) {
      this.k.b($$0);
   }

   public void a(@Nullable alz $$0, @Nullable axg $$1) {
      this.k.a($$0, $$1);
   }

   public String j() {
      return this.k.g();
   }

   public void k() {
      this.k.a();
   }

   protected static class a {
      final Map<alz, hgn> a = Maps.newHashMap();
      private Map<alz, avt> b = Map.of();

      void a(avv $$0) {
         this.b = hfe.a.a($$0);
      }

      void a(alz $$0, hff $$1) {
         hgn $$2 = this.a.get($$0);
         boolean $$3 = $$2 == null;
         if ($$3 || $$1.b()) {
            if (!$$3) {
               hgm.f.debug("Replaced sound event location {}", $$0);
            }

            $$2 = new hgn($$0, $$1.c());
            this.a.put($$0, $$2);
         }

         avy $$4 = avy.fromMap(this.b);

         for (final hfe $$5 : $$1.a()) {
            final alz $$6 = $$5.a();
            hgo<hfe> $$8;
            switch ($$5.f()) {
               case a:
                  if (!hgm.a($$5, $$0, $$4)) {
                     continue;
                  }

                  $$8 = $$5;
                  break;
               case b:
                  $$8 = new hgo<hfe>() {
                     @Override
                     public int e() {
                        hgn $$0 = a.this.a.get($$6);
                        return $$0 == null ? 0 : $$0.e();
                     }

                     public hfe a(bam $$0) {
                        hgn $$1 = a.this.a.get($$6);
                        if ($$1 == null) {
                           return hgm.b;
                        } else {
                           hfe $$2 = $$1.a($$0);
                           return new hfe($$2.a(), new bsp($$2.c(), $$5.c()), new bsp($$2.d(), $$5.d()), $$5.e(), hfe.a.a, $$2.g() || $$5.g(), $$2.h(), $$2.i());
                        }
                     }

                     @Override
                     public void a(hgj $$0) {
                        hgn $$1 = a.this.a.get($$6);
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

      public void a(Map<alz, hgn> $$0, Map<alz, avt> $$1, hgj $$2) {
         $$0.clear();
         $$1.clear();
         $$1.putAll(this.b);

         for (Entry<alz, hgn> $$3 : this.a.entrySet()) {
            $$0.put($$3.getKey(), $$3.getValue());
            $$3.getValue().a($$2);
         }
      }
   }
}
