import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public record vc(vd j, vd k) {
   public static final Codec<vc> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(vd.a.fieldOf("chat").forGetter(vc::a), vd.a.fieldOf("narration").forGetter(vc::b)).apply($$0, vc::new)
   );
   public static final vd b = vd.a("chat.type.text");
   public static final ahg<vc> c = a("chat");
   public static final ahg<vc> d = a("say_command");
   public static final ahg<vc> e = a("msg_command_incoming");
   public static final ahg<vc> f = a("msg_command_outgoing");
   public static final ahg<vc> g = a("team_msg_command_incoming");
   public static final ahg<vc> h = a("team_msg_command_outgoing");
   public static final ahg<vc> i = a("emote_command");

   private static ahg<vc> a(String $$0) {
      return ahg.a(ke.au, new ahh($$0));
   }

   public static void a(pf<vc> $$0) {
      $$0.a(c, new vc(b, vd.a("chat.type.text.narrate")));
      $$0.a(d, new vc(vd.a("chat.type.announcement"), vd.a("chat.type.text.narrate")));
      $$0.a(e, new vc(vd.b("commands.message.display.incoming"), vd.a("chat.type.text.narrate")));
      $$0.a(f, new vc(vd.c("commands.message.display.outgoing"), vd.a("chat.type.text.narrate")));
      $$0.a(g, new vc(vd.d("chat.type.team.text"), vd.a("chat.type.text.narrate")));
      $$0.a(h, new vc(vd.d("chat.type.team.sent"), vd.a("chat.type.text.narrate")));
      $$0.a(i, new vc(vd.a("chat.type.emote"), vd.a("chat.type.emote")));
   }

   public static vc.a a(ahg<vc> $$0, blw $$1) {
      return a($$0, $$1.dL().I_(), $$1.Q_());
   }

   public static vc.a a(ahg<vc> $$0, ds $$1) {
      return a($$0, $$1.v(), $$1.b());
   }

   public static vc.a a(ahg<vc> $$0, iu $$1, vg $$2) {
      it<vc> $$3 = $$1.d(ke.au);
      return $$3.e($$0).a($$2);
   }

   public vc.a a(vg $$0) {
      return new vc.a(this, $$0);
   }

   public vd a() {
      return this.j;
   }

   public vd b() {
      return this.k;
   }

   public static record a(vc a, vg b, @Nullable vg c) {
      a(vc $$0, vg $$1) {
         this($$0, $$1, null);
      }

      public vg a(vg $$0) {
         return this.a.a().a($$0, this);
      }

      public vg b(vg $$0) {
         return this.a.b().a($$0, this);
      }

      public vc.a c(vg $$0) {
         return new vc.a(this.a, this.b, $$0);
      }

      public vc.b a(iu $$0) {
         it<vc> $$1 = $$0.d(ke.au);
         return new vc.b($$1.a(this.a), this.b, this.c);
      }
   }

   public static record b(int a, vg b, @Nullable vg c) {
      public b(uj $$0) {
         this($$0.n(), $$0.m(), $$0.c(uj::m));
      }

      public void a(uj $$0) {
         $$0.c(this.a);
         $$0.a(this.b);
         $$0.a(this.c, uj::a);
      }

      public Optional<vc.a> a(iu $$0) {
         it<vc> $$1 = $$0.d(ke.au);
         vc $$2 = $$1.a(this.a);
         return Optional.ofNullable($$2).map($$0x -> new vc.a($$0x, this.b, this.c));
      }
   }
}
