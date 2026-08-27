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

public class grq extends atw<grq.a> {
   public static final gqj a = new gqj("minecraft:empty", bon.a(1.0F), bon.a(1.0F), 1, gqj.a.a, false, false, 16);
   public static final akh b = new akh("minecraft", "intentionally_empty");
   public static final grr c = new grr(b, null);
   public static final gqj d = new gqj(b.toString(), bon.a(1.0F), bon.a(1.0F), 1, gqj.a.a, false, false, 16);
   static final Logger e = LogUtils.getLogger();
   private static final String f = "sounds.json";
   private static final Gson g = new GsonBuilder().registerTypeHierarchyAdapter(wu.class, new wu.b(jk.b)).registerTypeAdapter(gqk.class, new gql()).create();
   private static final TypeToken<Map<String, gqk>> h = new TypeToken<Map<String, gqk>>() {
   };
   private final Map<akh, grr> i = Maps.newHashMap();
   private final grn j;
   private final Map<akh, atp> k = new HashMap<>();

   public grq(fdi $$0) {
      this.j = new grn(this, $$0, atu.fromMap(this.k));
   }

   protected grq.a a(atr $$0, bma $$1) {
      grq.a $$2 = new grq.a();
      $$1.a();
      $$1.a("list");
      $$2.a($$0);
      $$1.c();

      for (String $$3 : $$0.a()) {
         $$1.a($$3);

         try {
            for (atp $$5 : $$0.a(new akh($$3, "sounds.json"))) {
               $$1.a($$5.b());

               try (Reader $$6 = $$5.e()) {
                  $$1.a("parse");
                  Map<String, gqk> $$7 = axp.a(g, $$6, h);
                  $$1.b("register");

                  for (Entry<String, gqk> $$8 : $$7.entrySet()) {
                     $$2.a(new akh($$3, $$8.getKey()), $$8.getValue());
                  }

                  $$1.c();
               } catch (RuntimeException var15) {
                  e.warn("Invalid {} in resourcepack: '{}'", new Object[]{"sounds.json", $$5.b(), var15});
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

   protected void a(grq.a $$0, atr $$1, bma $$2) {
      $$0.a(this.i, this.k, this.j);
      if (aa.aX) {
         for (akh $$3 : this.i.keySet()) {
            grr $$4 = this.i.get($$3);
            if (!wx.b($$4.a()) && ld.b.d($$3)) {
               e.error("Missing subtitle {} for sound event: {}", $$4.a(), $$3);
            }
         }
      }

      if (e.isDebugEnabled()) {
         for (akh $$5 : this.i.keySet()) {
            if (!ld.b.d($$5)) {
               e.debug("Not having sound event for: {}", $$5);
            }
         }
      }

      this.j.a();
   }

   public List<String> a() {
      return this.j.h();
   }

   public evu b() {
      return this.j.i();
   }

   static boolean a(gqj $$0, akh $$1, atu $$2) {
      akh $$3 = $$0.b();
      if ($$2.getResource($$3).isEmpty()) {
         e.warn("File {} does not exist, cannot add it to event {}", $$3, $$1);
         return false;
      } else {
         return true;
      }
   }

   @Nullable
   public grr a(akh $$0) {
      return this.i.get($$0);
   }

   public Collection<akh> d() {
      return this.i.keySet();
   }

   public void a(gqn $$0) {
      this.j.a($$0);
   }

   public void a(gqm $$0) {
      this.j.c($$0);
   }

   public void a(gqm $$0, int $$1) {
      this.j.a($$0, $$1);
   }

   public void a(fcp $$0) {
      this.j.a($$0);
   }

   public void e() {
      this.j.e();
   }

   public void f() {
      this.j.d();
   }

   public void g() {
      this.j.b();
   }

   public void h() {
      this.j.c();
   }

   public void a(boolean $$0) {
      this.j.a($$0);
   }

   public void i() {
      this.j.f();
   }

   public void a(avd $$0, float $$1) {
      if ($$0 == avd.a && $$1 <= 0.0F) {
         this.f();
      }

      this.j.a($$0, $$1);
   }

   public void b(gqm $$0) {
      this.j.a($$0);
   }

   public boolean c(gqm $$0) {
      return this.j.b($$0);
   }

   public void a(grp $$0) {
      this.j.a($$0);
   }

   public void b(grp $$0) {
      this.j.b($$0);
   }

   public void a(@Nullable akh $$0, @Nullable avd $$1) {
      this.j.a($$0, $$1);
   }

   public String j() {
      return this.j.g();
   }

   public void k() {
      this.j.a();
   }

   protected static class a {
      final Map<akh, grr> a = Maps.newHashMap();
      private Map<akh, atp> b = Map.of();

      void a(atr $$0) {
         this.b = gqj.a.a($$0);
      }

      void a(akh $$0, gqk $$1) {
         grr $$2 = this.a.get($$0);
         boolean $$3 = $$2 == null;
         if ($$3 || $$1.b()) {
            if (!$$3) {
               grq.e.debug("Replaced sound event location {}", $$0);
            }

            $$2 = new grr($$0, $$1.c());
            this.a.put($$0, $$2);
         }

         atu $$4 = atu.fromMap(this.b);

         for (final gqj $$5 : $$1.a()) {
            final akh $$6 = $$5.a();
            grs<gqj> $$8;
            switch ($$5.f()) {
               case a:
                  if (!grq.a($$5, $$0, $$4)) {
                     continue;
                  }

                  $$8 = $$5;
                  break;
               case b:
                  $$8 = new grs<gqj>() {
                     @Override
                     public int e() {
                        grr $$0 = a.this.a.get($$6);
                        return $$0 == null ? 0 : $$0.e();
                     }

                     public gqj a(ayg $$0) {
                        grr $$1 = a.this.a.get($$6);
                        if ($$1 == null) {
                           return grq.a;
                        } else {
                           gqj $$2 = $$1.a($$0);
                           return new gqj(
                              $$2.a().toString(), new bot($$2.c(), $$5.c()), new bot($$2.d(), $$5.d()), $$5.e(), gqj.a.a, $$2.g() || $$5.g(), $$2.h(), $$2.i()
                           );
                        }
                     }

                     @Override
                     public void a(grn $$0) {
                        grr $$1 = a.this.a.get($$6);
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

      public void a(Map<akh, grr> $$0, Map<akh, atp> $$1, grn $$2) {
         $$0.clear();
         $$1.clear();
         $$1.putAll(this.b);

         for (Entry<akh, grr> $$3 : this.a.entrySet()) {
            $$0.put($$3.getKey(), $$3.getValue());
            $$3.getValue().a($$2);
         }
      }
   }
}
