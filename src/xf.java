import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record xf(xg l, xg m) {
   public static final Codec<xf> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(xg.a.fieldOf("chat").forGetter(xf::a), xg.a.fieldOf("narration").forGetter(xf::b)).apply($$0, xf::new)
   );
   public static final zh<wu, xf> b = zh.a(xg.b, xf::a, xg.b, xf::b, xf::new);
   public static final zh<wu, jq<xf>> c = zf.a(ma.aH, b);
   public static final xg d = xg.a("chat.type.text");
   public static final ali<xf> e = a("chat");
   public static final ali<xf> f = a("say_command");
   public static final ali<xf> g = a("msg_command_incoming");
   public static final ali<xf> h = a("msg_command_outgoing");
   public static final ali<xf> i = a("team_msg_command_incoming");
   public static final ali<xf> j = a("team_msg_command_outgoing");
   public static final ali<xf> k = a("emote_command");

   private static ali<xf> a(String $$0) {
      return ali.a(ma.aH, alj.b($$0));
   }

   public static void a(qz<xf> $$0) {
      $$0.a(e, new xf(d, xg.a("chat.type.text.narrate")));
      $$0.a(f, new xf(xg.a("chat.type.announcement"), xg.a("chat.type.text.narrate")));
      $$0.a(g, new xf(xg.b("commands.message.display.incoming"), xg.a("chat.type.text.narrate")));
      $$0.a(h, new xf(xg.c("commands.message.display.outgoing"), xg.a("chat.type.text.narrate")));
      $$0.a(i, new xf(xg.d("chat.type.team.text"), xg.a("chat.type.text.narrate")));
      $$0.a(j, new xf(xg.d("chat.type.team.sent"), xg.a("chat.type.text.narrate")));
      $$0.a(k, new xf(xg.a("chat.type.emote"), xg.a("chat.type.emote")));
   }

   public static xf.a a(ali<xf> $$0, bul $$1) {
      return a($$0, $$1.dV().J_(), $$1.o_());
   }

   public static xf.a a(ali<xf> $$0, ew $$1) {
      return a($$0, $$1.v(), $$1.b());
   }

   public static xf.a a(ali<xf> $$0, ke $$1, xj $$2) {
      kd<xf> $$3 = $$1.e(ma.aH);
      return new xf.a($$3.b($$0), $$2);
   }

   public xg a() {
      return this.l;
   }

   public xg b() {
      return this.m;
   }

   public static record a(jq<xf> b, xj c, Optional<xj> d) {
      public static final zh<wu, xf.a> a = zh.a(xf.c, xf.a::a, xl.d, xf.a::b, xl.e, xf.a::c, xf.a::new);

      a(jq<xf> $$0, xj $$1) {
         this($$0, $$1, Optional.empty());
      }

      public xj a(xj $$0) {
         return this.b.a().a().a($$0, this);
      }

      public xj b(xj $$0) {
         return this.b.a().b().a($$0, this);
      }

      public xf.a c(xj $$0) {
         return new xf.a(this.b, this.c, Optional.of($$0));
      }

      public jq<xf> a() {
         return this.b;
      }

      public xj b() {
         return this.c;
      }

      public Optional<xj> c() {
         return this.d;
      }
   }
}
