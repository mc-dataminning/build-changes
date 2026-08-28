import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record xr(xs l, xs m) {
   public static final Codec<xr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(xs.a.fieldOf("chat").forGetter(xr::a), xs.a.fieldOf("narration").forGetter(xr::b)).apply($$0, xr::new)
   );
   public static final zt<xg, xr> b = zt.a(xs.b, xr::a, xs.b, xr::b, xr::new);
   public static final zt<xg, jq<xr>> c = zr.a(mb.aJ, b);
   public static final xs d = xs.a("chat.type.text");
   public static final aly<xr> e = a("chat");
   public static final aly<xr> f = a("say_command");
   public static final aly<xr> g = a("msg_command_incoming");
   public static final aly<xr> h = a("msg_command_outgoing");
   public static final aly<xr> i = a("team_msg_command_incoming");
   public static final aly<xr> j = a("team_msg_command_outgoing");
   public static final aly<xr> k = a("emote_command");

   private static aly<xr> a(String $$0) {
      return aly.a(mb.aJ, alz.b($$0));
   }

   public static void a(rk<xr> $$0) {
      $$0.a(e, new xr(d, xs.a("chat.type.text.narrate")));
      $$0.a(f, new xr(xs.a("chat.type.announcement"), xs.a("chat.type.text.narrate")));
      $$0.a(g, new xr(xs.b("commands.message.display.incoming"), xs.a("chat.type.text.narrate")));
      $$0.a(h, new xr(xs.c("commands.message.display.outgoing"), xs.a("chat.type.text.narrate")));
      $$0.a(i, new xr(xs.d("chat.type.team.text"), xs.a("chat.type.text.narrate")));
      $$0.a(j, new xr(xs.d("chat.type.team.sent"), xs.a("chat.type.text.narrate")));
      $$0.a(k, new xr(xs.a("chat.type.emote"), xs.a("chat.type.emote")));
   }

   public static xr.a a(aly<xr> $$0, bvk $$1) {
      return a($$0, $$1.dW().K_(), $$1.p_());
   }

   public static xr.a a(aly<xr> $$0, ew $$1) {
      return a($$0, $$1.u(), $$1.b());
   }

   public static xr.a a(aly<xr> $$0, ke $$1, xv $$2) {
      kd<xr> $$3 = $$1.e(mb.aJ);
      return new xr.a($$3.b($$0), $$2);
   }

   public xs a() {
      return this.l;
   }

   public xs b() {
      return this.m;
   }

   public static record a(jq<xr> b, xv c, Optional<xv> d) {
      public static final zt<xg, xr.a> a = zt.a(xr.c, xr.a::a, xx.d, xr.a::b, xx.e, xr.a::c, xr.a::new);

      a(jq<xr> $$0, xv $$1) {
         this($$0, $$1, Optional.empty());
      }

      public xv a(xv $$0) {
         return this.b.a().a().a($$0, this);
      }

      public xv b(xv $$0) {
         return this.b.a().b().a($$0, this);
      }

      public xr.a c(xv $$0) {
         return new xr.a(this.b, this.c, Optional.of($$0));
      }

      public jq<xr> a() {
         return this.b;
      }

      public xv b() {
         return this.c;
      }

      public Optional<xv> c() {
         return this.d;
      }
   }
}
