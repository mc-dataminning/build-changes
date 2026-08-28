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

public class gtu extends aut<gtu.a> {
   public static final gsj a = new gsj("minecraft:empty", bpu.a(1.0F), bpu.a(1.0F), 1, gsj.a.a, false, false, 16);
   public static final ale b = new ale("minecraft", "intentionally_empty");
   public static final gtv c = new gtv(b, null);
   public static final gsj d = new gsj(b.toString(), bpu.a(1.0F), bpu.a(1.0F), 1, gsj.a.a, false, false, 16);
   static final Logger e = LogUtils.getLogger();
   private static final String f = "sounds.json";
   private static final Gson g = new GsonBuilder().registerTypeHierarchyAdapter(xo.class, new xo.b(jw.b)).registerTypeAdapter(gsk.class, new gsl()).create();
   private static final TypeToken<Map<String, gsk>> h = new TypeToken<Map<String, gsk>>() {
   };
   private final Map<ale, gtv> i = Maps.newHashMap();
   private final gtr j;
   private final Map<ale, aum> k = new HashMap<>();

   public gtu(ffi $$0) {
      this.j = new gtr(this, $$0, aur.fromMap(this.k));
   }

   protected gtu.a a(auo $$0, bnh $$1) {
      gtu.a $$2 = new gtu.a();
      $$1.a();
      $$1.a("list");
      $$2.a($$0);
      $$1.c();

      for (String $$3 : $$0.a()) {
         $$1.a($$3);

         try {
            for (aum $$5 : $$0.a(new ale($$3, "sounds.json"))) {
               $$1.a($$5.b());

               try (Reader $$6 = $$5.e()) {
                  $$1.a("parse");
                  Map<String, gsk> $$7 = ayo.a(g, $$6, h);
                  $$1.b("register");

                  for (Entry<String, gsk> $$8 : $$7.entrySet()) {
                     $$2.a(new ale($$3, $$8.getKey()), $$8.getValue());
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

   protected void a(gtu.a $$0, auo $$1, bnh $$2) {
      $$0.a(this.i, this.k, this.j);
      if (aa.aX) {
         for (ale $$3 : this.i.keySet()) {
            gtv $$4 = this.i.get($$3);
            if (!xr.b($$4.a()) && lp.b.d($$3)) {
               e.error("Missing subtitle {} for sound event: {}", $$4.a(), $$3);
            }
         }
      }

      if (e.isDebugEnabled()) {
         for (ale $$5 : this.i.keySet()) {
            if (!lp.b.d($$5)) {
               e.debug("Not having sound event for: {}", $$5);
            }
         }
      }

      this.j.a();
   }

   public List<String> a() {
      return this.j.h();
   }

   public exv b() {
      return this.j.i();
   }

   static boolean a(gsj $$0, ale $$1, aur $$2) {
      ale $$3 = $$0.b();
      if ($$2.getResource($$3).isEmpty()) {
         e.warn("File {} does not exist, cannot add it to event {}", $$3, $$1);
         return false;
      } else {
         return true;
      }
   }

   @Nullable
   public gtv a(ale $$0) {
      return this.i.get($$0);
   }

   public Collection<ale> d() {
      return this.i.keySet();
   }

   public void a(gsn $$0) {
      this.j.a($$0);
   }

   public void a(gsm $$0) {
      this.j.c($$0);
   }

   public void a(gsm $$0, int $$1) {
      this.j.a($$0, $$1);
   }

   public void a(fep $$0) {
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

   public void a(awa $$0, float $$1) {
      if ($$0 == awa.a && $$1 <= 0.0F) {
         this.f();
      }

      this.j.a($$0, $$1);
   }

   public void b(gsm $$0) {
      this.j.a($$0);
   }

   public boolean c(gsm $$0) {
      return this.j.b($$0);
   }

   public void a(gtt $$0) {
      this.j.a($$0);
   }

   public void b(gtt $$0) {
      this.j.b($$0);
   }

   public void a(@Nullable ale $$0, @Nullable awa $$1) {
      this.j.a($$0, $$1);
   }

   public String j() {
      return this.j.g();
   }

   public void k() {
      this.j.a();
   }

   protected static class a {
      final Map<ale, gtv> a = Maps.newHashMap();
      private Map<ale, aum> b = Map.of();

      void a(auo $$0) {
         this.b = gsj.a.a($$0);
      }

      void a(ale $$0, gsk $$1) {
         gtv $$2 = this.a.get($$0);
         boolean $$3 = $$2 == null;
         if ($$3 || $$1.b()) {
            if (!$$3) {
               gtu.e.debug("Replaced sound event location {}", $$0);
            }

            $$2 = new gtv($$0, $$1.c());
            this.a.put($$0, $$2);
         }

         aur $$4 = aur.fromMap(this.b);

         for (final gsj $$5 : $$1.a()) {
            final ale $$6 = $$5.a();
            gtw<gsj> $$8;
            switch ($$5.f()) {
               case a:
                  if (!gtu.a($$5, $$0, $$4)) {
                     continue;
                  }

                  $$8 = $$5;
                  break;
               case b:
                  $$8 = new gtw<gsj>() {
                     @Override
                     public int e() {
                        gtv $$0 = a.this.a.get($$6);
                        return $$0 == null ? 0 : $$0.e();
                     }

                     public gsj a(azg $$0) {
                        gtv $$1 = a.this.a.get($$6);
                        if ($$1 == null) {
                           return gtu.a;
                        } else {
                           gsj $$2 = $$1.a($$0);
                           return new gsj(
                              $$2.a().toString(), new bqa($$2.c(), $$5.c()), new bqa($$2.d(), $$5.d()), $$5.e(), gsj.a.a, $$2.g() || $$5.g(), $$2.h(), $$2.i()
                           );
                        }
                     }

                     @Override
                     public void a(gtr $$0) {
                        gtv $$1 = a.this.a.get($$6);
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

      public void a(Map<ale, gtv> $$0, Map<ale, aum> $$1, gtr $$2) {
         $$0.clear();
         $$1.clear();
         $$1.putAll(this.b);

         for (Entry<ale, gtv> $$3 : this.a.entrySet()) {
            $$0.put($$3.getKey(), $$3.getValue());
            $$3.getValue().a($$2);
         }
      }
   }
}
